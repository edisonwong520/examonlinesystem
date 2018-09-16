package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Lesson;
import po.LessonExample;

public interface LessonMapper {
    int countByExample(LessonExample example);

    int deleteByExample(LessonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lesson record);

    int insertSelective(Lesson record);

    List<Lesson> selectByExample(LessonExample example);

    Lesson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lesson record, @Param("example") LessonExample example);

    int updateByExample(@Param("record") Lesson record, @Param("example") LessonExample example);

    int updateByPrimaryKeySelective(Lesson record);

    int updateByPrimaryKey(Lesson record);
}