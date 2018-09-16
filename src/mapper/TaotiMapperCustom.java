package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import po.Pagination;
import po.Taoti;
import po.TaotiCustom;
import po.TaotiExample;

public interface TaotiMapperCustom {
	List<TaotiCustom> getListByLimit(Pagination pagination);
}