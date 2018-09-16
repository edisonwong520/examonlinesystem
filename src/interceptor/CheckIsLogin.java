package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CheckIsLogin implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		String uri=request.getRequestURI();
		if(uri.indexOf("login.action")!=-1 || uri.indexOf("ignIn.action")!=-1 || uri.indexOf("manager")!=-1) {
			return true;
		}
		HttpSession session = request.getSession();
		Object name = session.getAttribute("studentName");
		if(name!=null) {
			return true;
		}
		response.sendRedirect(request.getContextPath()+"/jsp/login.jsp");
		return false;
	}

}
