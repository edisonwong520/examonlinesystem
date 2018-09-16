package mapper;

import java.util.List;

import po.StudentresultCustom;
import vo.QueryResultVo;

public interface StudentresultMapperCustom {
	List<StudentresultCustom> getListByLimit(QueryResultVo queryResultVo);
	List<StudentresultCustom> getListByStudentId(Integer id);
}