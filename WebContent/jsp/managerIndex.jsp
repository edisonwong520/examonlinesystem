<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/image/main_logo.ico" rel="shortcut icon">
<title>在线考试系统-后台管理</title>
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
	
	function openTab(title,url,icon){
		var managerName="${sessionScope.managerName}";
		if (managerName=="") {
			window.location.href="${pageContext.request.contextPath }/managerLogout.action";
			return;
		}
		if ($("#tabs").tabs("exists",title)) {
			$("#tabs").tabs("select",title);
		}else{
			var content="<iframe frameborder='0' scolling='auto' width='100%' height='100%' src='${pageContext.request.contextPath}/jsp/"+url+"'></iframe>";
			$("#tabs").tabs("add",{
				title:title,
				iconCls:icon,
				closable:true,
				content:content
			})
		}
	}
</script>
</head>
<body class="easyui-layout">
<input id="managerAuthority" type="hidden" value="${sessionScope.managerAuthority }">
	<div data-options="region:'north'" style="height:60px">
		<div style="line-height:60px;height:58px;background-image:url('${pageContext.request.contextPath}/image/signinback.jpg');background-size:cover">
			<font color="white" size="8px" face="仿宋" style="font-weight:bold;margin-left:2%">营 养 在 线 考 试 网<font size="5px" color="black"> -- 后 台 管 理 </font></font>
			<font id="ft" style="margin-left:20%">当 前 管 理 员：<span id="sp">${sessionScope.managerName }</span></font>
		</div>
	</div>
	
	<div data-options="region:'south'" style="height:40px">
		<center style="margin-top:1%">
			<font>CopyRight © : www.xiaowu.com</font>
		</center>
	</div>
	
	<div data-options="region:'west',title:'后台导航栏',split:true" style="width:200px">
		<div class="easyui-accordion" data-options="fit:true">
			<c:if test="${sessionScope.managerAuthority=='super' }">
				<div title="管理员管理" style="padding: 10px" data-options="iconCls:'icon-man'" align="center">
					<a href="javascript:openTab('管理员信息管理','managerList.jsp','icon-man')"  class="easyui-linkbutton" data-options="iconCls:'icon-man',plain:true" style="width:150px">管理员信息管理</a>
				</div>
			</c:if>
			<div title="考生管理" style="padding: 10px" data-options="iconCls:'icon-group'" align="center">
				<a href="javascript:openTab('考生信息管理','managerStudentList.jsp','icon-group')" class="easyui-linkbutton" data-options="iconCls:'icon-group',plain:true" style="width:150px">考生信息管理</a>
				<a href="javascript:openTab('考生成绩管理','managerQueryResult.jsp','icon-definition')" class="easyui-linkbutton" data-options="iconCls:'icon-definition',plain:true" style="width:150px">考生成绩管理</a>
			</div>
			<div title="试题管理" style="padding:10px" data-options="iconCls:'icon-ask'" align="center">
				<a href="javascript:openTab('课程信息管理','managerLessonList.jsp','icon-ask')" class="easyui-linkbutton" data-options="iconCls:'icon-ask',plain:true" style="width:150px">课程信息管理</a>
				<a href="javascript:openTab('套题信息管理','managerTaotiList.jsp','icon-deployment')" class="easyui-linkbutton" data-options="iconCls:'icon-deployment',plain:true" style="width:150px">套题信息管理</a>
				<a href="javascript:openTab('考试题目管理','managerQuestionsList.jsp','icon-flow')" class="easyui-linkbutton" data-options="iconCls:'icon-flow',plain:true" style="width:150px">考试题目管理</a>
			</div>
			<div title="系统管理" style="padding: 10px" align="center">
				<a href="${pageContext.request.contextPath }/managerLogout.action" class="easyui-linkbutton" data-options="iconCls:'icon-signout',plain:true" style="width:150px">退出后台管理</a>
			</div>
		</div>
	</div>
	
	<div data-options="region:'center'" style="padding:1px;background:#eee">
		<div id="tabs" class="easyui-tabs" data-options="fit:true,border:false">
			<div title="首页">
				<div align="center" style="margin-top: 15%">
					<font size="6" style="font-weight: bold">欢  迎  使  用  ！</font>
				</div>
			</div>
		</div>
	</div>
</body>
</html>