package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Taoti;
import po.TaotiExample;

public interface TaotiMapper {
    int countByExample(TaotiExample example);

    int deleteByExample(TaotiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Taoti record);

    int insertSelective(Taoti record);

    List<Taoti> selectByExample(TaotiExample example);

    Taoti selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Taoti record, @Param("example") TaotiExample example);

    int updateByExample(@Param("record") Taoti record, @Param("example") TaotiExample example);

    int updateByPrimaryKeySelective(Taoti record);

    int updateByPrimaryKey(Taoti record);
}