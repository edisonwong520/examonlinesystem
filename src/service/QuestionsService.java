package service;

import java.util.List;

import po.Pagination;
import po.Questions;
import po.QuestionsCustom;

public interface QuestionsService {

	List<Questions> getList() throws Exception;

	List<QuestionsCustom> getListByLimit(Pagination pagination) throws Exception;

	void deleteOneById(Integer id) throws Exception;

	void addOne(Questions questions) throws Exception;

	Questions getOneById(Integer id) throws Exception;

	void updateOne(Questions questions) throws Exception;

	List<QuestionsCustom> findListByTaotiid(Integer id) throws Exception;

	Questions findById(Integer key) throws Exception;

}
