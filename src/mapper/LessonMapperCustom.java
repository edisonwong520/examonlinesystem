package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Lesson;
import po.LessonExample;
import po.Pagination;

public interface LessonMapperCustom {
	List<Lesson> getListByLimit(Pagination pagination);
}