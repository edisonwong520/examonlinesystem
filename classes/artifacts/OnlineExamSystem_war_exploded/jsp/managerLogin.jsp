<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/image/main_logo.ico" rel="shortcut icon">
<title>在线考试系统-后台登录</title>
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
	
</head>
<body style="background-image:url('${pageContext.request.contextPath}/image/loginback2.jpg');background-size:cover">
	<div style="text-align:center;margin-top:10%">
		<font face="仿宋" color="white" size="10">管 理 员 登 录</font>
	</div>
	<div style="margin-top:3%;margin-left:40%">
		<form action="${pageContext.request.contextPath }/managerLogin.action" method="post">
			<table cellpadding="10px">
				<tr>
					<td><font color="white" >帐&nbsp;号</font></td>
					<td><input class="easyui-textbox" data-options="iconCls:'icon-man'" name="name"></td>
				</tr>
				<tr>
					<td><font color="white" >密&nbsp;码</font></td>
					<td><input class="easyui-passwordbox" name="password"></td>
				</tr>
				<tr>
					<td colspan="2" ><input type="submit" value="登录" style="background:whitesmoke"></td>
                    <td><input type="button"  value="退出" style="background:whitesmoke; margin-left: -65px;" onclick=window.location.href="${pageContext.request.contextPath}/jsp/login.jsp"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><font color="red">${message }</font></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>