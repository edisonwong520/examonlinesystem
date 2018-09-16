<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
		$("#tt").datagrid({
			url:'${pageContext.request.contextPath}/managerStudentGetList.action',
			pagination:true,
			rownumbers:true,
			fit:true,
			fitColumns:true,
			toolbar:'#tb',
			columns:[[
				{
					field:'cb',
					align:'center',
					checkbox:true,
				},
				{
					field:'id',
					title:'编号',
					width:100,
					align:'center',
				},
				{
					field:'name',
					title:'帐号',
					width:150,
					align:'center',
				},
				{
					field:'password',
					title:'密码',
					width:150,
					align:'center',
				},
				{
					field:'sex',
					title:'性别',
					width:100,
					align:'center',
				},
				{
					field:'jointime',
					title:'注册时间',
					width:200,
					align:'center',
					formatter:function(value){
						var date=new Date(value);
						var y=date.getFullYear();
						var m=date.getMonth()+1;
						var d=date.getDate();
						return y+"-"+m+"-"+d;
					}
				},
				{
					field:'profesion',
					title:'专业',
					width:200,
					align:'center',
				}
			]]
		})
	})
	
	function deleteStudent(){
		var selections=$("#tt").datagrid("getSelections");
		if (selections.length==0) {
			$.messager.alert("系统提示","请选择要删除的数据！");
			return;
		}
		var ids=[];
		for (var i = 0; i < selections.length; i++) {
			ids.push(selections[i].id);
		}
		var idsStr = ids.join();
		$.messager.confirm("系统提示","确定要删除这"+selections.length+"条数据吗？",function(r){
			if (r) {
				$.ajax({
					url:'${pageContext.request.contextPath }/managerDeleteStudent.action',
					data:idsStr,
					type:'post',
					contentType:'application/json;charset=utf-8',
					success:function(result){
						if (result=="success") {
							$.messager.alert("系统提示","删除成功！");
							closeDialog();
							$("#tt").datagrid("reload");
						}else{
							$.messager.alert("系统提示","删除失败，请联系系统管理员！");
						}
					}
				})
			}
		})
	}
</script>
</head>
<body style="margin: 1px">
<table id="tt"></table>
<div id="tb">
	<a href="javascript:deleteStudent()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
</div>
</body>
</html>