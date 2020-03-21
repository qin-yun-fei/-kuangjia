<%--
  Created by IntelliJ IDEA.
  User: 秦
  Date: 2020/3/20
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>qin</title>
    <link href="q_ioc/q1%20.ico" rel="icon">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
    <link rel="stylesheet" href="layui/css/layui-theme-custom.css"  media="all">

    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
<%--<img src="q_ioc/q1%20.ico"/>--%>
<div style="margin-bottom: 5px;">

    <!-- 示例-970 -->
    <ins class="adsbygoogle" style="display:inline-block;width:970px;height:90px" data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>

</div>

<div class="layui-btn-group demoTable">
    <button class="layui-btn" data-type="getCheckData">获取选中行数据</button>
    <button class="layui-btn" data-type="getCheckLength">获取选中数目</button>
    <button class="layui-btn" data-type="isAll">验证是否全选</button>
    <button class="layui-btn" data-type="reload">刷新</button>

</div>
<button class="layui-btn" id="btn"  data-type="reload2">刷新2</button>

<div class="layui-form-item">
    <label class="layui-form-label">1框</label>
    <div class="layui-input-inline">
        <input type="password" name="password" required lay-verify="required"
               placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">提示 </div>

    <label class="layui-form-label">2框</label>
    <div class="layui-input-inline">
        <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">提示 </div>
    <button class="layui-btn" data-type="" id="esit" onclick="">查询</button></div>

<div class="layui-form-item">


    <table class="layui-table"
           lay-data="{width: 892, height:330,url:'UserServlet', page:true, 
id:'idTest'}" lay-filter="demo">
        <thead>
        <tr>
            <th lay-data="{type:'checkbox', fixed: 'left'}"></th>
            <th lay-data="{field:'id', width:80, sort: true, fixed: true}">ID</th>
            <th lay-data="{field:'userCode', width:80}">用户</th>
            <th lay-data="{field:'userName', width:80, sort: true}">用户名</th>
            <th lay-data="{field:'userPassword', width:80}">密码</th>
            <th lay-data="{field:'phone', width:160}">电话</th>
            <th lay-data="{field:'address', width:80, sort: true}">地址</th>

            <th lay-data="{field:'birthday', width:80}">birthday</th>
            <th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}"></th>
        </tr>
        </thead>
    </table>
</div>

    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
        <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>

    </script>



    <script src="layui/layui.js" charset="utf-8"></script>
    <!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
    <script>
        //刷新 
        var btn = document.getElementById("btn");
        function sxin() {
            layer.alert("001")
        }


        layui.use('table', function(){
            var  table = layui.table;
            //监听表格复选框选择
            table.on('checkbox(demo)', function(obj){
                console.log(obj)
            });
            var $ = layui.$, active = {
                reload2: function(){
                    //执行重载
                    layer.alert(0001)
                    table.reload2('idTest', {
                        page: {
                            curr: 1 //重新从第 1 页开始
                        }

                    });
                }
            };



            //监听工具条
            table.on('tool(demo)', function(obj){
                var data = obj.data;//获取当前行数据
                if(obj.event === 'detail'){
                    layer.msg('ID：'+ data.id + ' 的查看操作<br>'+JSON.stringify(data));
                } else if(obj.event === 'del'){
                    layer.confirm('真的删除行么', function(index){
                        obj.del();
                        layer.close(index);
                    });
                } else if(obj.event === 'edit'){
                    //iframe层-父子操作

                    layer.open({
                        type: 2,
                        area: ['700px', '450px'],
                        fixed: false, //不固定
                        maxmin: true,
                        content: 'UserServlet01?id='+obj.data.id
                    });
                    //layer.alert('编辑行：<br>'+ JSON.stringify(data))
                }
            });

            var $ = layui.$, active = {
                getCheckData: function(){ //获取选中数据
                    var checkStatus = table.checkStatus('idTest')
                        ,data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                }
                ,getCheckLength: function(){ //获取选中数目
                    var checkStatus = table.checkStatus('idTest')
                        ,data = checkStatus.data;
                    layer.msg('选中了：'+ data.length + ' 个');
                }
                ,isAll: function(){ //验证是否全选
                    var checkStatus = table.checkStatus('idTest');
                    layer.msg(checkStatus.isAll ? '全选': '未全选')
                }
                , reload: function(){
                    //执行重载
                    table.reload('idTest', {
                        page: {
                            curr: 1 //重新从第 1 页开始
                        }

                    });
                }


            };

            $('.demoTable .layui-btn').on('click', function(){
                var type = $(this).data('type');
                active[type] ? active[type].call(this) : '';
            });
        });
    </script>
    <script>
        // 查询脚本

        $("#esit").click(function(){
            var param = {
                uid:$("#uid").val(),
                uname:$("#uname").val()
            }
            //提交后台
            $.post('UserServlet',param,function(data){
                //alert(data)
                layer.alert(data,function(){
                    //parent:父页面的window对象
                    this.sxin();

                })

            })

        })

    </script>
 </body>
</html>
