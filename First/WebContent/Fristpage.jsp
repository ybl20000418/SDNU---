<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta content="图书管理" http-equiv="keywords">
<meta name="description" content="图书管理">
<meta name="applicable-device" content="pc,mobile">
<meta http-equiv="Cache-Control" content="no-siteapp"/>
<meta http-equiv="Cache-Control" content="no-transform" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<style>
.roe{
   padding-top:20px;
   color: #fff;
   text-align: center;
   font-size: 50px;
   font-family:'STKaiti';
}
.roa{
   text-align:right;
   float:right ;


}
</style>
<title>图书管理</title>
<link rel="stylesheet" href="CSS/index.css" type="text/css">

<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/jquery.SuperSlide.2.1.1.js"></script>
<script type="text/javascript" src="js/public.js"></script><!-- 菜单js等-->
<!-- 时间选择js -->
<script type="text/javascript" src="js/laydate.js"></script>

</head>
<body>
<!--头部-->
<div class="topbox bg">
	<div class="wid_main fix">
		<div class="logo l"><img src=""  /></div>
		<!-- 搜索 -->
		<div class="roe">
		山东师范大学图书管理系统
		</div>
	</div>
</div>
<!-- top end -->

<!-- 主体内容框 -->
<div class="contentbox wid_main bora_5">
	<div class="content">

		<!-- 导航end -->

		<!-- 需要添加的最新通知或公告滚动部分 -->
		<div class="gonggao bdb_d fix">
			<div class="txtScroll-top l fix">
				<div class="l tit"><img src="images/icon_notice.png"><b class="dib vm">信息速递：</b></div>
				<div class="bd l">
					<ul class="infoList">
						<li>图书馆西二净水器更换，同学们可放心用水！<span class="date">2019-12-11</span></li>
						<li>阳面遮阳布已经部署完成，今天中午投入使用！<span class="date">2019-12-13</span></li>
						<li>关于图书馆惩治不文明占座的征求意见！<span class="date">2019-12-14</span></li>
					</ul>
				</div>
			</div>
			<script type="text/javascript">
				jQuery(".txtScroll-top").slide({titCell:".hd ul",mainCell:".bd ul",effect:"topLoop",autoPlay:true,vis:1,interTime:4000,});
			</script>

			<!-- 时间 -->
			<div class="timebox fc r">
				<script type="text/javascript" src="js/show_date.js"></script>
			</div>
		</div>

		
		<div class="conbox fix">
			<!-- 轮播图 -->
			<div class="news_banner l bora_5">
                <div class="hd">
                    <ul>
                    	<li>1</li>
                    	<li>2</li>
                    </ul>
                </div>
                <div class="bd">
                    <ul><!--图片新闻 最多4-5个左右li -->
                    	<li>
                            <a href="http://localhost:8080/First/haoshutuijian.jsp"><img src="images/haoshu.png" alt="好书推荐" /></a>
                            <h2><a href="http://localhost:8080/First/haoshutuijian.jsp">好书推荐</a></h2>
                        </li>
                        <li>
                            <a href="http://localhost:8080/First/bangshangxinshu.jsp"><img src="images/bangshang.png" alt="榜上新书" /></a>
                            <h2><a href="http://localhost:8080/First/bangshangxinshu.jsp">榜上新书</a></h2>
                        </li>
                    </ul>
                </div>
                <!-- 下面是前/后按钮代码，如果不需要删除即可 -->
                <a class="prev" href="javascript:void(0)"></a>
                <a class="next" href="javascript:void(0)"></a>

                <script type="text/javascript">
                jQuery(".news_banner").slide({mainCell:".bd ul",autoPlay:true,effect:"leftLoop",mouseOverStop:false,interTime:5000,});
                </script>
            </div>

            <!-- 部分主要入口 -->
            <div class="about_enter r">
            	<ul class="fix">
            		<li><a href="http://localhost:8080/First/logindwn/login1.jsp"><img src="images/icon_leader.png"><span>学生服务</span></a></li>
            		<li><a href="http://localhost:8080/First/jieyueguize.jsp"><img src="images/icon_jigou.png"><span>借阅规则</span></a></li>
            		<li><a href="http://localhost:8080/First/logindwn/adminlogin.jsp"><img src="images/icon_people.png"><span>管理员服务</span></a></li>
            		<li><a href="http://localhost:8080/First/duzhepeixun.jsp"><img src="images/icon_order.png"><span>读者培训</span></a></li>
            	</ul>
            	<dl>
            		<dd><a href="#"><img src="images/icon_alltel.png"><span>馆长热线  0531-5203</span></a></dd>
            		<dd><a><img src="images/icon_hottel.png"><span>读者投诉  0531-5530</span></a></dd>
            		<dd><a href="http://localhost:8080/First/jieshuliucheng.jsp"><img src="images/icon_liucheng.png"><span>借阅流程</span></a></dd>
            	</dl>
            </div>
		</div>

</body>
</html>
