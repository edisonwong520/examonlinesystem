package controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import po.Pagination;
import po.Taoti;
import po.TaotiCustom;
import service.TaotiService;

@Controller
public class TaoTiController {
	@Autowired
	private TaotiService taotiService;
	
	@RequestMapping("/managerToTaotiList.action")
	public String managerToTaotiList(HttpServletRequest request) throws Exception{
		request.setAttribute("myurl", request.getContextPath()+"/jsp/managerTaotiList.jsp");
		return "/managerIndex";
	}
	
	@RequestMapping("/managerGetTaotiList.action")
	public @ResponseBody Map<String, Object> managerGetTaotiList(Pagination pagination) throws Exception{
		Map<String, Object> map=new HashMap<String, Object>();
		List<Taoti> list=taotiService.getList();
		List<TaotiCustom> list2=taotiService.getListByLimit(pagination);
		map.put("total", list.size());
		map.put("rows", list2);
		return map;
	}
	
	@RequestMapping("/managerDeleteTaoti.action")
	public @ResponseBody String managerDeleteTaoti(@RequestBody String idsStr) throws Exception{
		String[] ids = idsStr.split(",");
		for (int i = 0; i < ids.length; i++) {
			taotiService.deleteOneById(Integer.parseInt(ids[i]));
		}
		return "success";
	}
	
	@RequestMapping("/managerAddTaoti.action")
	public @ResponseBody String managerAddTaoti(Taoti taoti) throws Exception{
		taoti.setCreatetime(new Date());
		taotiService.addOne(taoti);
		return "success";
	}
	
	@RequestMapping("/managerGetTaotiInfo.action")
	public @ResponseBody Taoti managerGetTaotiInfo(Integer id) throws Exception{
		Taoti taoti=taotiService.fintOneById(id);
		return taoti;
	}
	
	@RequestMapping("/managerUpdateTaoti.action")
	public @ResponseBody String managerUpdateTaoti(Taoti taoti) throws Exception{
		taotiService.updateOne(taoti);
		return "success";
	}
	
	@RequestMapping("/managerGetTaotis.action")
	public @ResponseBody List<Taoti> managerGetTaotis() throws Exception{
		return taotiService.getList();
	}
}
