package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CheckManagerIsLogin implements HandlerInterceptor {

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
		if(uri.indexOf("manager") != -1) {
			if(uri.indexOf("Login") != -1) {
				return true;
			}else {
				HttpSession session = request.getSession();
				Object managerName = session.getAttribute("managerName");
				if(managerName==null) {
					response.sendRedirect(request.getContextPath()+"/jsp/managerLogin.jsp");
					return false;
				}
			}
		}
		return true;
	}

}
