package service;

import java.util.List;

import po.Lesson;
import po.Pagination;

public interface LessonService {

	List<Lesson> getListByLimit(Pagination pagination) throws Exception;

	List<Lesson> getList() throws Exception;

	void deleteOneById(Integer id);

	void addOne(Lesson lesson);

}
