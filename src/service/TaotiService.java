package service;

import java.util.List;

import po.Pagination;
import po.Taoti;
import po.TaotiCustom;

public interface TaotiService {

	List<Taoti> getList() throws Exception;

	List<TaotiCustom> getListByLimit(Pagination pagination) throws Exception;

	void deleteOneById(Integer id) throws Exception;

	void addOne(Taoti taoti) throws Exception;

	void updateOne(Taoti taoti) throws Exception;

	Taoti fintOneById(Integer id) throws Exception;

	List<Taoti> findListByLessonid(Integer lessonid) throws Exception;

}
