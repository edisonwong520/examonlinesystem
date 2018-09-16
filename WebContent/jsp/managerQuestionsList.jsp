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
		$("#dg").datagrid({
			url:'${pageContext.request.contextPath}/managerGetQuestionsList.action',
			pagination:true,
			fit:true,
			fitColumns:true,
			toolbar:'#tb',
			rownumbers:true,
			columns:[[
				{
					field:'cb',
					align:'center',
					checkbox:true,
				},
				{
					field:'lessonName',
					title:'所属课程',
					width:100,
					align:'center',
				},
				{
					field:'taotiName',
					title:'套题名称',
					width:150,
					align:'center',
				},
				{
					field:'subject',
					title:'考试题目',
					width:400,
					align:'center',
				},
				{
					field:'type',
					title:'试题类型',
					width:100,
					align:'center',
				},
				{
					field:'createtime',
					title:'创建时间',
					width:150,
					align:'center',
					formatter:function(value){
						var date=new Date(value);
						var y=date.getFullYear();
						var m=date.getMonth()+1;
						var d=date.getDate();
						var h=date.getHours();
						var min=date.getMinutes();
						var s=date.getSeconds();
						return y+"-"+m+"-"+d+"&nbsp;&nbsp;&nbsp;&nbsp;"+h+":"+min+":"+s;
					}
				}
			]]
		})
	})
	
	function resetValue(){
		$("#cc2").val("");
		$("#subject").val("");
		$("#type").val("");
		$("#optiond").val("");
		$("#optionc").val("");
		$("#optionb").val("");
		$("#optiona").val("");
		$("#remark").val("");
		$("#addorupdate").val("");
		$("#id").val("");
	}

	function openAddDialog(){
		$("#addorupdate").val("1");
		$("#name").attr("readonly",false);
		$("#dlg").dialog("open").dialog("setTitle","添加考试题目");
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
		$("#dlg").dialog("open").dialog("setTitle","修改考试题目");
	}
	
	function closeDialog(){
		resetValue();
		$("#dlg").dialog("close");
	}
	
	function addOrUpdateQuestions(){
		var choice = $("#addorupdate").val();
		var myUrl;
		if (choice=="1") {
			myUrl="${pageContext.request.contextPath }/managerAddQuestion.action";
		}else{
			myUrl="${pageContext.request.contextPath }/managerUpdateQuestion.action";
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
	
	function deleteQuestions(){
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
					url:'${pageContext.request.contextPath }/managerDeleteQuestion.action',
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
<table id="dg"></table>
<div id="tb">
	&nbsp;<a href="javascript:openAddDialog()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">添加考试题目</a>
	&nbsp;<a href="javascript:openUpdateDialog()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改考试题目</a>
	&nbsp;<a href="javascript:deleteQuestions()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除考试题目</a>
</div>

<div id="dlg" class="easyui-dialog" data-options="buttons:'#bts',closed:true" style="width: 600px;height:300px">
	<form id="fm" method="post"> 
		<table cellpadding="10px">
			<tr>
				<td>所属套题</td>
				<td><input id="cc2" class="easyui-combobox" name="taotiid"
					data-options="textField:'name',valueField:'id',panelHeight:'auto',url:'${pageContext.request.contextPath }/managerGetTaotis.action'"></td>
				<td>
					<input type="hidden" id="id" name="id">
				</td>
				<td>
					<input type="hidden" id="addorupdate" value="">
				</td>
			</tr>
			<tr>
				<td>考试题目</td>
				<td><textarea id="subject" name="subject" cols="20" rows="4"></textarea></td>
				<td>试题类型</td>
				<td>
					<select id="type" name="type" class="easyui-combobox" data-options="panelHeight:'auto'">
						<option value="单选">单选</option>
						<option value="多选">多选</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>选项A</td>
				<td><input id="optiona" class="easyui-validatebox" data-options="required:true" name="optiona"></td>
				<td>选项B</td>
				<td><input id="optionb" class="easyui-validatebox" data-options="required:true" name="optionb"></td>
			</tr>
			<tr>
				<td>选项C</td>
				<td><input id="optionc" class="easyui-validatebox" data-options="required:true" name="optionc"></td>
				<td>选项D</td>
				<td><input id="optiond" class="easyui-validatebox" data-options="required:true" name="optiond"></td>
			</tr>
			<tr>
				<td>正确答案</td>
				<td>
					A<input type="checkbox" name="answer" checked="checked" value="A">&nbsp;&nbsp;&nbsp;&nbsp;
					B<input type="checkbox" name="answer" value="B">&nbsp;&nbsp;&nbsp;&nbsp;
					C<input type="checkbox" name="answer" value="C">&nbsp;&nbsp;&nbsp;&nbsp;
					D<input type="checkbox" name="answer" value="D">
				</td>
				<td>备注</td>
				<td><input id="remark" type="text" name="note"></td>
			</tr>
		</table>
	</form>
</div>

<div id="bts">
	<a href="javascript:addOrUpdateQuestions()" class="easyui-linkbutton" data-options="iconCls:'icon-save'">保存</a>
	<a href="javascript:closeDialog()" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">关闭</a>
</div>
</body>
</html>