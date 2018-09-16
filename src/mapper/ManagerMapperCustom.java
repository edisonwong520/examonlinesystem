package mapper;

import java.util.List;

import po.Manager;
import po.Pagination;

public interface ManagerMapperCustom {
	List<Manager> getListByLimit(Pagination pagination);
}