package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mapper.TaotiMapper;
import mapper.TaotiMapperCustom;
import po.Pagination;
import po.Taoti;
import po.TaotiCustom;
import po.TaotiExample;
import po.TaotiExample.Criteria;
import service.TaotiService;

public class TaotiServiceImpl implements TaotiService {
	@Autowired
	private TaotiMapper taotiMapper;
	
	@Autowired
	private TaotiMapperCustom taotiMapperCustom;

	public List<Taoti> getList() throws Exception {
		TaotiExample example=new TaotiExample();
		return taotiMapper.selectByExample(example);
	}

	public List<TaotiCustom> getListByLimit(Pagination pagination) throws Exception {
		pagination.setStartPage((pagination.getPage()-1)*pagination.getRows());
		return taotiMapperCustom.getListByLimit(pagination);
	}

	@Transactional
	public void deleteOneById(Integer id) throws Exception {
		taotiMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	public void addOne(Taoti taoti) throws Exception {
		taotiMapper.insertSelective(taoti);
	}

	@Transactional
	public void updateOne(Taoti taoti) throws Exception {
		taotiMapper.updateByPrimaryKeySelective(taoti);
	}

	public Taoti fintOneById(Integer id) throws Exception {
		return taotiMapper.selectByPrimaryKey(id);
	}

	public List<Taoti> findListByLessonid(Integer lessonid) throws Exception {
		TaotiExample example=new TaotiExample();
		Criteria criteria = example.createCriteria();
		criteria.andLessonidEqualTo(lessonid);
		return taotiMapper.selectByExample(example);
	}

}
