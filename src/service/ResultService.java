package service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;

import po.Pagination;
import po.QueryResult;
import po.Studentresult;
import po.StudentresultCustom;

public interface ResultService {

	List<Studentresult> getList() throws Exception;

	List<StudentresultCustom> getListByLimit(Pagination pagination, QueryResult queryResult) throws Exception;

	void addOne(Studentresult studentresult) throws Exception;

	List<StudentresultCustom> getListByStudentId(Integer id)  throws Exception;
	
	void export(HttpServletResponse response,Workbook workbook,String fileName) throws Exception;

	Integer getTotalByLessonnName(String lessonName,List<StudentresultCustom> list) throws Exception;
}
