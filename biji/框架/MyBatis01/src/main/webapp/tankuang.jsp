<%--
  Created by IntelliJ IDEA.
  User: 秦
  Date: 2020/3/20
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <script src="layui/layui.js" charset="utf-8"></script>

    <script src="js/jquery-3.4.1.min.js"></script>

</head>
<body>
<div class="layui-input-inline">
    <input type="text"  required lay-verify="required"
           autocomplete="off" class="layui-input" id="uid" value ='${user.id }'>
    <input type="text" id="uid" value ='${user.id }' >
    <input type="text" id="uname" value ='${user.userName }' >

    <input type="button" id="esit" class="ew" value="修改" />
    <input type="button" id="" value="取消" />
    <script>
        $("#esit").click(function(){
            var param = {
                uid:$("#uid").val(),
                uname:$("#uname").val()
            }
            //提交后台
            $.post('UserServlet',param,function(data){
                alert(data)
                parent.layer.alert(data,function(){
                    //parent:父页面的window对象
                    parent.location.reload();sp
                    parent.layer.closeAll();//关闭iframe
                })

            })

        })

    </script>
</div>
</body>
</html>