package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mapper.LessonMapper;
import mapper.LessonMapperCustom;
import po.Lesson;
import po.LessonExample;
import po.Pagination;
import service.LessonService;

public class LessonServiceImpl implements LessonService {

	@Autowired
	private LessonMapper lessonMapper;
	
	@Autowired
	private LessonMapperCustom lessonMapperCustom;
	
	public List<Lesson> getListByLimit(Pagination pagination) throws Exception {
		pagination.setStartPage((pagination.getPage()-1)*pagination.getRows());
		return lessonMapperCustom.getListByLimit(pagination);
	}

	public List<Lesson> getList() throws Exception {
		LessonExample example=new LessonExample();
		return lessonMapper.selectByExample(example);
	}

	@Transactional
	public void deleteOneById(Integer id) {
		lessonMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	public void addOne(Lesson lesson) {
		lessonMapper.insertSelective(lesson);
	}

}
