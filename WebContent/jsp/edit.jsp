<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/image/main_logo.ico" rel="shortcut icon">
<title>在线考试系统-修改资料</title>
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
		var studentId=$("#studentId").val();
		$("#ff").form('load','${pageContext.request.contextPath}/getEditInfo.action?id='+studentId);
		$("#name").change(function(){
			var name=$(this).val();
			$.ajax({
				url:'${pageContext.request.contextPath}/check',
				data:'name='+name,
				type:'post',
				success:function(data){
					if(data==false){
						$("#sp").text("帐号已被注册！");
					}else{
						$("#sp").text("");
					}
				}
			})
		})
		$("#subm").click(function(){
			var flag=true;
			$(":text").each(function(){
				var thisVal = $(this).val();
				var thisText=$(this).parent().prev().text();
				if(thisVal==""){
					$.messager.alert(thisText+"不能为空！");
					flag=false;
					return false;
				}
			})
			if(flag){
				var password1=$("#password1").val();
				var spanText = $("#sp2").text();
				if(spanText != ""){
					$.messager.alert("帐号已被注册！");
					return false;
				}
				if(password1==""){
					$.messager.alert("请输入密码！");
					return false;
				}
				return true;
			}
			return false;
		})
	})
</script>
</head>
<body>
<div style="line-height:80px;height:80px;background-image:url('${pageContext.request.contextPath}/image/signinback.jpg');background-size:cover">
	<font color="white" size="10" face="仿宋" style="font-weight:bold;margin-left:2%">在 线 考 试 系 统</font>
	<font id="ft" style="margin-left:40%">当 前 考 生：<span id="sp">${sessionScope.studentName }</span></font>
</div>
<div style="margin-top:2%;margin-left:2%">
	<font color="black">当前位置 ： 修改资料</font>
</div>
<center style="margin-top:2%">
	<form id="ff" action="${pageContext.request.contextPath }/edit.action" method="post">
	<input type="hidden" name="id" id="studentId" value="${studentId }">
		<table cellpadding="5px">
			<tr>
				<td>帐号</td>
				<td><input id="name" type="text" name="name"><font id="sp2" color="red"></font></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input id="password1" type="password" name="password"></td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					<select name="sex">
						<option value="男">男</option>
						<option value="女">女</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>专业</td>
				<td><input type="text" name="profesion"></td>
			</tr>
			<tr>
				<td><input id="subm" type="submit" value="修改"></td>
				<td align="right"><input type="reset" value="重置"></td>
			</tr>
		</table>
		<br>
		<br>
		<a href="${pageContext.request.contextPath }/jsp/index.jsp" class="easyui-linkbutton" data-options="iconCls:'icon-back'">回 到 首 页</a>
		<br>
		<br>
		<br>
		<br>
		<font color="red">温馨提示：可以通过刷新来获取初始数据哦</font>
	</form>
</center>
</body>
</html>