package controller;

import java.awt.Font;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import po.Pagination;
import po.QueryResult;
import po.Student;
import po.Studentresult;
import po.StudentresultCustom;
import service.ResultService;
import service.StudentService;

@Controller
public class ResultController {
	@Autowired
	private ResultService resultService;
	
	@Autowired
	private StudentService studentService;

	@RequestMapping("/managerGetQueryResult.action")
	public @ResponseBody Map<String, Object> managerGetQueryResult(Pagination pagination,QueryResult queryResult) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		List<Studentresult> list=resultService.getList();
		if (queryResult.getOption()==null) {
			queryResult.setOption("");
		}
		if (queryResult.getValue()==null) {
			queryResult.setValue("");
		}
		List<StudentresultCustom> list2=resultService.getListByLimit(pagination,queryResult);
		map.put("rows", list2);
		map.put("total", list.size());
		return map;
	}
	
	@RequestMapping("/queryResult.action")
	public ModelAndView queryResult(HttpSession session) throws Exception{
		String studentName = (String) session.getAttribute("studentName");
		Student student = studentService.findOne(studentName);
		List<StudentresultCustom> list = resultService.getListByStudentId(student.getId());
		for (StudentresultCustom studentresultCustom : list) {
			studentresultCustom.getCreatetime();
		}
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/examResultAll");
		modelAndView.addObject("resultList", list);
		
		Integer mathTotal = resultService.getTotalByLessonnName("数学", list);
		Integer chineseTotal = resultService.getTotalByLessonnName("语文", list);
		Integer englishTotal = resultService.getTotalByLessonnName("英语", list);
		DefaultPieDataset dataset=new DefaultPieDataset();
		dataset.setValue("数学",mathTotal);
		dataset.setValue("语文",chineseTotal);
		dataset.setValue("英语",englishTotal);
		JFreeChart pieChart = ChartFactory.createPieChart("您的擅长学科分析图", dataset, true, true, true);
		
		PiePlot plot=(PiePlot) pieChart.getPlot();
		//设置显示数值，并设置字体样式
		plot.setLabelFont(new Font("微软雅黑", 2, 12));
		//设置饼状图是圆的（true），还是椭圆（false），默认为true
		plot.setCircular(true);
		//设置没有数据的时候显示的内容
		plot.setNoDataMessage("无数据显示");
		
		String filename = ServletUtilities.saveChartAsPNG(pieChart, 700, 500, null, session);
		modelAndView.addObject("filename", filename);
		return modelAndView;
	}
	
	@RequestMapping("/saveExcel.action")
	public void saveExcel(HttpSession session,HttpServletResponse response) throws Exception{
		String studentName = (String) session.getAttribute("studentName");
		Student student = studentService.findOne(studentName);
		List<StudentresultCustom> list = resultService.getListByStudentId(student.getId());
		Workbook workbook=new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("您的考试成绩单");
		Row row=sheet.createRow(0);
		Cell cell00=row.createCell(0);
		cell00.setCellValue("考试课程");
		Cell cell01=row.createCell(1);
		cell01.setCellValue("准号证号");
		Cell cell02=row.createCell(2);
		cell02.setCellValue("单选题成绩");
		Cell cell03=row.createCell(3);
		cell03.setCellValue("多选题成绩");
		Cell cell04=row.createCell(4);
		cell04.setCellValue("总成绩");
		Cell cell05=row.createCell(5);
		cell05.setCellValue("考试时间");
		for (int i = 0; i < list.size(); i++) {
			StudentresultCustom studentresultCustom = list.get(i);
			row=sheet.createRow(i+1);
			Cell cell0=row.createCell(0);
			cell0.setCellValue(studentresultCustom.getLessonname());
			Cell cell1=row.createCell(1);
			cell1.setCellValue(studentresultCustom.getExamnumber());
			Cell cell2=row.createCell(2);
			cell2.setCellValue(studentresultCustom.getResingle());
			Cell cell3=row.createCell(3);
			cell3.setCellValue(studentresultCustom.getResmore());
			Cell cell4=row.createCell(4);
			cell4.setCellValue(studentresultCustom.getRestotal());
			
			Cell cell5=row.createCell(5);
			cell5.setCellValue(studentresultCustom.getCreatetime());
			//获取单元格样式
			CreationHelper creationHelper = workbook.getCreationHelper();
			CellStyle cellStyle = workbook.createCellStyle();
			//定义单元格日期样式
			cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-mm-dd hh:mm:ss"));
			//设置单元格样式
			cell5.setCellStyle(cellStyle);
		}
		
		resultService.export(response, workbook, "examResults.xls");
	}
}
