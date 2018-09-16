package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import po.Pagination;
import po.Student;
import po.StudentExample;

public interface StudentMapperCustom {
	List<Student> getListByLimit(Pagination pagination);
}