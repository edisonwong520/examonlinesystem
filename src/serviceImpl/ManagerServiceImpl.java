package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mapper.ManagerMapper;
import mapper.ManagerMapperCustom;
import po.Manager;
import po.ManagerExample;
import po.ManagerExample.Criteria;
import po.Pagination;
import service.ManagerService;

public class ManagerServiceImpl implements ManagerService {
	@Autowired
	private ManagerMapper managerMapper;
	
	@Autowired
	private ManagerMapperCustom managerMapperCustom;
	
	public List<Manager> checkManager(Manager manager) throws Exception {
		ManagerExample example=new ManagerExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(manager.getName());
		criteria.andPasswordEqualTo(manager.getPassword());

		return managerMapper.selectByExample(example);
	}

	public List<Manager> getList() throws Exception {
		ManagerExample example=new ManagerExample();
		List<Manager> list = managerMapper.selectByExample(example);
		return list;
	}

	public List<Manager> getListByLimit(Pagination pagination) throws Exception {
		pagination.setStartPage((pagination.getPage()-1)*pagination.getRows());
		List<Manager> list = managerMapperCustom.getListByLimit(pagination);
		return list;
	}

	@Transactional
	public void addOne(Manager manager) throws Exception {
		managerMapper.insertSelective(manager);
	}

	@Transactional
	public void deleteOne(Integer id) throws Exception {
		managerMapper.deleteByPrimaryKey(id);
	}

	public Manager findOneById(Integer id) throws Exception {
		return managerMapper.selectByPrimaryKey(id);
	}

	@Transactional
	public void updateOne(Manager manager) throws Exception {
		managerMapper.updateByPrimaryKeySelective(manager);
	}
}
