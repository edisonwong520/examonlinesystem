<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/image/main_logo.ico" rel="shortcut icon">
<title>在线考试系统-首页</title>
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
		var spanText = $("#sp").text();
		if(spanText==""){
			$("#ft").hide();
		}
	})
</script>
</head>
<body style="background-image:url('${pageContext.request.contextPath}/image/indexback.jpg');background-size:cover">
<div style="margin-top:2%">
	<font color="#01814A" size="12px" face="仿宋" style="font-weight:bold;margin-left:34%">营 养 在 线 考 试 网</font>
	<br>
	<br>
	<font id="ft" style="margin-left:35%">当 前 学 生：<span id="sp">${sessionScope.studentName }</span></font>
</div>
<div style="margin-top:5%;margin-left:30%">
	<table cellpadding="30px">
		<tr>
			<td>
				<a href="${pageContext.request.contextPath }/toExam.action" class="easyui-linkbutton" data-options="iconCls:'icon-edit',size:'large'"><font size="4px">在线考试</font></a>
			</td>
			<td>
				<a href="${pageContext.request.contextPath }/queryResult.action" class="easyui-linkbutton" data-options="iconCls:'icon-search',size:'large'"><font size="4px">成绩查询</font></a>
			</td>
		</tr>
		<tr>
			<td>
				<a href="${pageContext.request.contextPath }/toEdit.action" class="easyui-linkbutton" data-options="iconCls:'icon-reload',size:'large'"><font size="4px">修改资料</font></a>
			</td>
			<td>
				<a href="${pageContext.request.contextPath }/logout.action" class="easyui-linkbutton" data-options="iconCls:'icon-cancel',size:'large'"><font size="4px">退出系统</font></a>
			</td>
		</tr>
	</table>
</div>
<center style="margin-top:5%">
	<font>CopyRight ©: www.xiaowu.com</font>
</center>
</body>
</html>