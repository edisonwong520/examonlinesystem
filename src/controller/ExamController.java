package controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import po.Exam;
import po.Questions;
import po.QuestionsCustom;
import po.Student;
import po.Studentresult;
import po.StudentresultCustom;
import po.Taoti;
import service.QuestionsService;
import service.ResultService;
import service.StudentService;
import service.TaotiService;

@Controller
public class ExamController {
	@Autowired
	private TaotiService taotiService;
	
	@Autowired
	private QuestionsService questionsService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private ResultService resultService;
	
	@RequestMapping("/toExam.action")
	public String toExam() throws Exception{
		return "/exam";
	}
	
	@RequestMapping("/toExamPage.action")
	public ModelAndView toExamPage(Integer lessonid) throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		List<Taoti> list = taotiService.findListByLessonid(lessonid);
		if (list.size()>0) {
			Integer length=list.size();
			Integer index=(int) (Math.random()*(length-1));
			Taoti taoti=list.get(index);
			List<QuestionsCustom> list2 = questionsService.findListByTaotiid(taoti.getId());
			modelAndView.addObject("list", list2);
		}else {
			modelAndView.addObject("list", null);
		}
		modelAndView.setViewName("/examPage");
		return modelAndView;
	}
	
	@RequestMapping("/postExam.action")
	public ModelAndView postExam(Exam exam,HttpSession session) throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		
		Studentresult studentresult=new Studentresult();
		
		Map<Integer, String> map = exam.getAnswerMap();
		Set<Integer> keySet=map.keySet();
		Iterator<Integer> it=keySet.iterator();
		Integer singleGrade=0;
		Integer doubleGrade=0;
		Integer taotiId=null;
		while(it.hasNext()) {
			Integer key=it.next();
			String value=map.get(key);
			
			Questions questions = questionsService.findById(key);
			if(taotiId == null) {
				taotiId=questions.getTaotiid();
			}
			if(questions.getType().equals("单选")) {
				if(questions.getAnswer().equals(value)) {
					singleGrade+=10;
				}
			}else {
				if(questions.getAnswer().equals(value)) {
					doubleGrade+=20;
				}
			}
		}
		Integer totalGrade=singleGrade+doubleGrade;
		
		Taoti taoti = taotiService.fintOneById(taotiId);
		
		String examnumber="CN";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
		Date date=new Date();
		String strD = simpleDateFormat.format(date);
		Object studentName = session.getAttribute("studentName");
		String studentId=null;
		if(studentName!=null) {
			String studentName2=studentName.toString();
			Student student = studentService.findOne(studentName2);
			studentId=student.getId().toString();
		}
		examnumber=examnumber+strD+studentId;
		
		studentresult.setExamnumber(examnumber);
		studentresult.setLessonid(taoti.getLessonid());
		studentresult.setResingle(singleGrade);
		studentresult.setResmore(doubleGrade);
		studentresult.setRestotal(totalGrade);
		studentresult.setCreatetime(new Timestamp(new Date().getTime()));
		
		if(session.getAttribute("xiaowutoken")!=null) {
			resultService.addOne(studentresult);
			session.removeAttribute("xiaowutoken");
		}
		
		List<QuestionsCustom> questionsCustoms = questionsService.findListByTaotiid(taotiId);
		StudentresultCustom studentresultCustom=new StudentresultCustom();
		BeanUtils.copyProperties(studentresult, studentresultCustom);
		studentresultCustom.setLessonname(questionsCustoms.get(0).getLessonName());
		
		modelAndView.setViewName("/examResult");
		modelAndView.addObject("studentresult", studentresultCustom);
		
		return modelAndView;
	}
}
