package controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import po.Pagination;
import po.Student;
import service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/login.action")
	public String login(Student student,HttpSession session,HttpServletRequest request) throws Exception{

		Integer count = studentService.checkLogin(student);
		if(count>0) {
			session.setAttribute("studentName", student.getName());
			return "redirect:/jsp/index.jsp";
		}else {
			request.setAttribute("message", "对不起！帐号或密码错误！");
			return "/login";
		}
	}


	@RequestMapping("/toSignIn.action")
	public String toSignIn(@RequestParam("name") String name,
                           @RequestParam("password")String password,HttpServletRequest request
                           ) throws Exception{

        String md5code=MD5.stringToMD5(password);
        String sql=String.format("update student set password='%s' where name='%s'",md5code,name);
        Integer count = DBContoller.exec_cmd(sql);
        if(count>0) {
            request.setAttribute("message", "资料填写错误！");
            return "/login";
        }else {
            request.setAttribute("message", "重置密码成功！");
            return "/login";
//        }
        }
	}


//    @RequestMapping("/toSignIn.action")
//    public String toSignIn() throws Exception{
//        return "signIn";
//    }
	
	@RequestMapping("/checkSignIn.action")
	public @ResponseBody boolean checkSignIn(Student student,HttpSession session) throws Exception{
		Object name = session.getAttribute("studentName");
		if(name!=null) {
			if(name.equals(student.getName())) {
				return true;
			}
		}
		Integer count = studentService.checkSignIn(student);
		if(count>0) {
			return false;
		}
		return true;
	}
	
	@RequestMapping("/signIn.action")
	public String signIn(Student student) throws Exception{
		student.setJointime(new Date());
		studentService.insertStudent(student);
		return "redirect:/jsp/login.jsp";
	}
	
	@RequestMapping("/logout.action")
	public String logout(HttpSession session) throws Exception{
		session.invalidate();
		return "redirect:/jsp/login.jsp";
	}
	
	@RequestMapping("/toEdit.action")
	public ModelAndView toEdit(HttpSession session) throws Exception{
		String name=(String) session.getAttribute("studentName");
		Student student= studentService.findOne(name);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/edit");
		modelAndView.addObject("studentId", student.getId());
		return modelAndView;
	}
	
	@RequestMapping("/getEditInfo.action")
	public @ResponseBody Student getEditInfo(Integer id) throws Exception{
		return studentService.findOneById(id);
	}
	
	@RequestMapping("/edit.action")
	public String edit(Student student) throws Exception{
		studentService.editOne(student);
		return "redirect:/jsp/index.jsp";
	}
	
	@RequestMapping("/managerStudentGetList.action")
	public @ResponseBody Map<String, Object> managerStudentGetList(Pagination pagination) throws Exception{
		Map<String, Object> map=new HashMap<String, Object>();
		List<Student> list = studentService.getList();
		List<Student> list2 = studentService.getListByLimit(pagination);
		map.put("total", list.size());
		map.put("rows", list2);
		return map;
	}
	
	@RequestMapping("/managerDeleteStudent.action")
	public @ResponseBody String managerDeleteStudent(@RequestBody String idsStr) throws Exception{
		String[] ids = idsStr.split(",");
		for (int i = 0; i < ids.length; i++) {
			studentService.deleteOneById(Integer.parseInt(ids[i]));
		}
		return "success";
	}
	
}
