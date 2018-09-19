<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/image/main_logo.ico" rel="shortcut icon">
<title>在线考试系统-当前考试成绩</title>
</head>
<body>
<div style="line-height:80px;height:80px;background-image:url('${pageContext.request.contextPath}/image/loginback2.jpg');background-size:cover">
	<font color="white" size="10" face="仿宋" style="font-weight:bold;margin-left:2%">在 线 考 试 系 统</font>
	<font id="ft" style="margin-left:40%">当 前 考 生：<span id="sp">${sessionScope.studentName }</span></font>
</div>
<div style="margin-top:2%;margin-left:2%">
	<font color="black">当前位置 ： 在线考试 >> 当前考试成绩</font>
</div>
<br>
<br>
<center>
	<table cellpadding="10px">
		<tr>
			<td>考试课程</td>
			<td>${studentresult.lessonname }</td>
		</tr>
		<tr>
			<td>准考证号</td>
			<td>${studentresult.examnumber }</td>
		</tr>
		<tr>
			<td>单选题成绩</td>
			<td>${studentresult.resingle }</td>
		</tr>
		<tr>
			<td>多选题成绩</td>
			<td>${studentresult.resmore }</td>
		</tr>
		<tr>
			<td>总成绩</td>
			<td>${studentresult.restotal }</td>
		</tr>
	</table>
	<br>
	<br>
	<a href="${pageContext.request.contextPath }/jsp/index.jsp">回 到 首 页</a>
</center>
</body>
</html>