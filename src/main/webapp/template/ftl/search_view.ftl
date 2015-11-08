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
		margin-top:10%;
		right:-3%px;
		width:10%;
	}
	#middle{
		vertical-align:central;
		width:75%;
	}
	#right_btn{
		margin-top:10%;
		left:3%;
		width:10%;
	}
	.glyphicon-fire{
	color:red;
	}
</style>

<div id="container">
    <div id="left_btn" class="contain_con">
    	<a href="#"><img src="arrowl.png" id="arrowl" alt="上一页" /></a>
    </div>
    <div id="middle" class="contain_con">
        <table class="table table-striped table-hover" >
        	<caption>xx(网站名)为您找到相关结果约xx(数量)个</caption>
            <thead>
               <tr>
                 <th>&nbsp;</th>
                 <th>电影</th>
                 <th>图片</th>
                 <th>导演/主演</th>
                 <th>下载链接&nbsp;&nbsp;<span class="glyphicon glyphicon-link"></span></th>
                 <th>人气指数&nbsp;&nbsp;<span class="glyphicon glyphicon-fire"></span></th>
               </tr>
        	</thead>
            <tbody>
               <tr>
                 <td>01</td>
                 <td>fsf</td>
                 <td>560001</td>
                 <td>Tanmay</td>
                 <td>Bangalore</td>
                 <td>560001</td>
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
    	<a href="#"><img src="arrowr.png" id="arrowr" alt="下一页" /></a>
    </div>
</div>
</@c.page>		