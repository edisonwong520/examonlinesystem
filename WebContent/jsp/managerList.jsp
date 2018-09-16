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
	function resetValue(){
		$("#name").val("");
		$("#id").val("");
		$("#password").val("");
	}

	function openAddDialog(){
		$("#addorupdate").val("1");
		$("#name").attr("readonly",false);
		$("#dlg").dialog("open").dialog("setTitle","添加管理员");
	}
	
	function openUpdateDialog(){
		var selectedRow = $("#dg").datagrid("getSelected");
		if (selectedRow==null) {
			$.messager.alert("系统提示","请选择要修改的数据！");
			return;
		}
		$("#fm").form("load",selectedRow);
		$("#addorupdate").val("2");
		$("#name").attr("readonly",true);
		$("#dlg").dialog("open").dialog("setTitle","修改管理员信息");
	}
	
	function closeDialog(){
		resetValue();
		$("#dlg").dialog("close");
	}
	
	function addOrUpdateManager(){
		var choice = $("#addorupdate").val();
		var myUrl;
		if (choice=="1") {
			myUrl="${pageContext.request.contextPath }/managerAdd.action";
		}else{
			myUrl="${pageContext.request.contextPath }/managerUpdate.action";
		}
		$("#fm").form("submit",{
			url:myUrl,
			onSubmit:function(){
				return $(this).form("validate");
			},
			success:function(result){
				if (result=="success") {
					$.messager.alert("系统提示","操作成功！");
					closeDialog();
					resetValue();
					$("#dg").datagrid("reload");
				}else{
					$.messager.alert("系统提示","操作失败，请联系系统管理员！");
					resetValue();
				}
			}
		})
	}
	
	function deleteManager(){
		var selections=$("#dg").datagrid("getSelections");
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
					url:'${pageContext.request.contextPath }/managerDelete.action',
					data:idsStr,
					type:'post',
					contentType:'application/json;charset=utf-8',
					success:function(result){
						if (result=="success") {
							$.messager.alert("系统提示","删除成功！");
							$("#dg").datagrid("reload");
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
<table id="dg" class="easyui-datagrid" data-options="fit:true,fitColumns:true,pagination:true,rownumbers:true,toolbar:'#tb',
	url:'${pageContext.request.contextPath}/managerGetList.action'">
	<thead>
		<tr>
			<th data-options="field:'cb',checkbox:true,align:'center'"></th>
			<th data-options="field:'id',width:200,align:'center'">编号</th>
			<th data-options="field:'name',width:200,align:'center'">帐号</th>
			<th data-options="field:'password',width:200,align:'center'">密码</th>
			<th data-options="field:'authority',width:200,align:'center'">权限类型</th>
		</tr>
	</thead>	
</table>
<div id="tb">
	&nbsp;<a href="javascript:openAddDialog()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">添加</a>
	&nbsp;<a href="javascript:openUpdateDialog()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改</a>
	&nbsp;<a href="javascript:deleteManager()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
</div>
<input id="addorupdate" type="hidden" value="1">
<div id="dlg" title="修改管理员信息" align="center" class="easyui-dialog" style="width:300px;height:250px;padding: 10px" data-options="closed:true,buttons:'#bts'">
	<form id="fm" method="post"> 
		<table cellpadding="10px">
			<tr>
				<td colspan="2"><input id="id" name="id" type="hidden"></td>
			</tr>
			<tr>
				<td>帐号</td>
				<td><input id="name" class="easyui-validatebox" name="name" data-options="required:true"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input id="password" class="easyui-validatebox" name="password" data-options="required:true"></td>
			</tr>
			<tr>
				<td>权限</td>
				<td>
					<select id="authority" class="easyui-combobox" name="authority" data-options="editable:false,panelHeight:'auto'">
						<option value="simple" selected="selected">simple</option>
						<option value="super">super</option>
					</select>
				</td>
			</tr>
		</table>
	</form>
</div>
<div id="bts">
	<a href="javascript:addOrUpdateManager()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">保存</a>
	<a href="javascript:closeDialog()" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">关闭</a>
</div>
</body>
</html>