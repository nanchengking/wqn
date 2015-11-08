<#import "/public/common.ftl" as c/>
<@c.page title="search_view">
<style type="text/css">
	body{
		width:100%;
		background-color:#f2f8f8;
	}
	#container {
	margin-left: 2%;
	margin-right: 2%;
	}
	.contain_con{
		position:relative;
		float:left;
		margin:40px 10px 10px 0px;
		display:inline;
	}
	td{
		cursor: pointer;
	}
	#left_btn{
		margin-top:5%;
		right:5%;
		width:10%;
	}
	#middle{
	    margin-top:5%;
		vertical-align:central;
		width:75%;
	}
	#right_btn{
		margin-top:5%;
		left:7%;
		width:10%;
	}
	.glyphicon-fire{
	color:red;
	}
</style>

<div id="container">
    <div id="left_btn" class="contain_con">
    	<a href="#"><img src="/res/img/arrowl.png" id="arrowl" alt="上一页" /></a>
    </div>
    <div id="middle" class="contain_con">
        <table class="table table-striped table-hover" >
        	<caption>xx(网站名)为您找到相关结果约xx(数量)个</caption>
            <thead>
               <tr>
                 <th width="10%">&nbsp;</th>
                 <th width="18%">电影</th>
                 <th width="18%">图片</th>
                 <th width="18%">导演/主演</th>
                 <th width="18%">下载链接&nbsp;&nbsp;<span class="glyphicon glyphicon-link"></span></th>
                 <th width="18%">人气指数&nbsp;&nbsp;<span class="glyphicon glyphicon-fire"></span></th>
               </tr>
        	</thead>
            <tbody>
               <tr>
                 <td>01</td>
                 <td>片名</td>
                 <td>链接</td>
                 <td>链接</td>
                 <td>链接</td>
                 <td>下载量</td>
               </tr>
               <tr>
                 <td>02</td>
                 <td>Mumbai</td>
                 <td>400003</td>
                 <td>Tanmay</td>
                 <td>Bangalore</td>
                 <td>560001</td>
               </tr>
               <tr>
                 <td>03</td>
                 <td>Pune</td>
                 <td>411027</td>
                 <td>Tanmay</td>
                 <td>Bangalore</td>
                 <td>560001</td>
               </tr>
               <tr>
                 <td>04</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
               </tr>
               <tr>
                 <td>05</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
               </tr>
               <tr>
                 <td>06</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
               </tr>
               <tr>
                 <td>07</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
               </tr>
               <tr>
                 <td>08</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
               </tr>
               <tr>
                 <td>09</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
               </tr>
               <tr>
                 <td>10</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
                 <td>&nbsp;</td>
               </tr>
             </tbody>
    	</table>
	</div>
    <div id="right_btn" class="contain_con">
    	<a href="#"><img src="/res/img/arrowr.png" id="arrowr" alt="下一页" /></a>
    </div>
</div>
</@c.page>		