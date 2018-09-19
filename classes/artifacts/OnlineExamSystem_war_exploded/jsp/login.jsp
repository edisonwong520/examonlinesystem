<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/image/main_logo.ico" rel="shortcut icon">
<title>在线考试系统-登录</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/easyui/locale/easyui-lang-zh_CN.js"></script>
	
<script type="text/javascript">
	$(function(){
		var message="${requestScope.message}";
		if (message !=null && message!="") {
			$.messager.alert("系统提示",message);
		}
		$("#btn").click(function(){
			window.location.href="${pageContext.request.contextPath}/jsp/signIn.jsp";
		})
		
	})
</script>
</head>
<body style="background-image:url('${pageContext.request.contextPath}/image/loginback2.jpg');background-size:cover">
	<div style="text-align:center;margin-top:12%">
		<font face="仿宋" size="10" color="white">考 生 登 录</font>
	</div>
	<div style="margin-top:3%;margin-left:40%">
		<form action="${pageContext.request.contextPath }/login.action" method="post">
			<table cellpadding="10px">
				<tr>
					<td><font color="#E8FFF5">帐&nbsp;号</font></td>
					<td><input class="easyui-textbox" data-options="iconCls:'icon-man'" name="name"></td>
				</tr>
				<tr>
					<td><font color="#E8FFF5">密&nbsp;码</font></td>
					<td><input class="easyui-passwordbox" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="登录" style="background:whitesmoke"></td>
                    <td><input type="button"  value="找回密码" style="background:whitesmoke" onclick=window.location.href="${pageContext.request.contextPath}/jsp/forgetpassword.jsp"></td>



                    <td><input type="button"  value="管理员登陆入口" style="background:whitesmoke; margin-left: -90px;" onclick=window.location.href="${pageContext.request.contextPath}/jsp/managerLogin.jsp"></td>
					<td><input type="button" id="btn" value="注册" style="background:whitesmoke"></td>

				</tr>

			</table>
		</form>
	</div>
</body>
</html>