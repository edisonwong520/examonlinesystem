package controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import po.Pagination;
import po.Questions;
import po.QuestionsCustom;
import service.QuestionsService;

@Controller
public class QuestionsController {
	
	@Autowired
	private QuestionsService questionsService;
	
	@RequestMapping("/managerGetQuestionsList.action")
	public @ResponseBody Map<String, Object> managerGetQuestionsList(Pagination pagination) throws Exception{
		Map<String, Object> map=new HashMap<String, Object>();
		List<Questions> list= questionsService.getList();
		List<QuestionsCustom> list2= questionsService.getListByLimit(pagination);
		map.put("total", list.size());
		map.put("rows", list2);
		return map;
	}
	
	@RequestMapping("/managerDeleteQuestion.action")
	public @ResponseBody String managerDeleteQuestion(@RequestBody String idsStr) throws Exception{
		String[] ids = idsStr.split(",");
		for (int i = 0; i < ids.length; i++) {
			questionsService.deleteOneById(Integer.parseInt(ids[i]));
		}
		return "success";
	}
	
	@RequestMapping("/managerAddQuestion.action")
	public @ResponseBody String managerAddQuestion(Questions questions) throws Exception{
		questions.setCreatetime(new Timestamp(new Date().getTime()));
		questionsService.addOne(questions);
		return "success";
	}
	
	@RequestMapping("/managerGetQuestionInfo.action")
	public @ResponseBody Questions managerGetQuestionInfo(Integer id) throws Exception{
		return questionsService.getOneById(id);
	}
	
	@RequestMapping("/managerUpdateQuestion.action")
	public @ResponseBody String managerUpdateQuestion(Questions questions) throws Exception{
		questionsService.updateOne(questions);
		return "success";
	}
}
