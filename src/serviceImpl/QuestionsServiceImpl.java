package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mapper.QuestionsMapper;
import mapper.QuestionsMapperCustom;
import po.Pagination;
import po.Questions;
import po.QuestionsCustom;
import po.QuestionsExample;
import po.QuestionsExample.Criteria;
import service.QuestionsService;

public class QuestionsServiceImpl implements QuestionsService {
	
	@Autowired
	private QuestionsMapper questionsMapper;
	
	@Autowired
	private QuestionsMapperCustom questionsMapperCustom;

	public List<Questions> getList() throws Exception {
		QuestionsExample example=new QuestionsExample();
		return questionsMapper.selectByExample(example);
	}

	public List<QuestionsCustom> getListByLimit(Pagination pagination) throws Exception {
		pagination.setStartPage((pagination.getPage()-1)*pagination.getRows());
		return questionsMapperCustom.getListByLimit(pagination);
	}

	@Transactional
	public void deleteOneById(Integer id) throws Exception {
		questionsMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	public void addOne(Questions questions) throws Exception {
		questionsMapper.insertSelective(questions);
	}

	public Questions getOneById(Integer id) throws Exception {
		return questionsMapper.selectByPrimaryKey(id);
	}

	@Transactional
	public void updateOne(Questions questions) throws Exception {
		questionsMapper.updateByPrimaryKeySelective(questions);
	}

	public List<QuestionsCustom> findListByTaotiid(Integer taotiId) throws Exception {
		QuestionsExample example=new QuestionsExample();
		Criteria criteria = example.createCriteria();
		criteria.andTaotiidEqualTo(taotiId);
		return questionsMapperCustom.getListByTaotiId(taotiId);
	}

	public Questions findById(Integer key) throws Exception {
		return questionsMapper.selectByPrimaryKey(key);
	}

}
