<#import "/public/common.ftl" as c/>
<@c.page title="view">
<style type="text/css" media="screen">
	      body {
	    font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
	    font-size: 14px;
	    color: #333;
	}
      body {
		background-image:url(/res/img/1.png);
        background-color: #f2f8f8;
		background-position:right 300px;
		background-repeat:no-repeat;
		background-size:300px 320px;
        margin: 0;
        background-attachment:fixed;
      }
      body,input,search_btn {
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
      }
      .contain{ margin: 250px auto 300px; width: 800px; text-align: center; }
 
      a { color: #333; text-decoration: none; font-weight: normal; }
      a:hover { text-decoration: underline; }
  
      input[type=text],
      input[type=password] {
        font-size: 13px;
        min-height: 32px;
        margin: 0;
        padding: 7px 8px;
        outline: none;
        color: #333;
        background-color: #fff;
        background-repeat: no-repeat;
        background-position: right center;
        border: 1px solid #38F;
        border-radius:0px;
        box-shadow: inset 0 1px 2px rgba(0,0,0,0.075);
        -moz-box-sizing: border-box;
        box-sizing: border-box;
        transition: all 0.15s ease-in;
        -webkit-transition: all 0.15s ease-in 0;
        vertical-align: middle;
      }
	  .search_btn {
		position: relative;
		display: inline-block;
		margin: 0px;
		padding: 4px 15px;
		font-size: 18px;
		color: #FFF;
		white-space: nowrap;
		background-color: #38F;
		border-radius: 0px;
		border-width: 0px 0px 0px;
		border-style: solid;
		border-color: #f2f8f8 #38f #38f;
		border-image: none;
		vertical-align: middle;
		cursor: pointer;
		box-sizing: border-box;
	  }
	 
	  .selecter {
		position: relative;
		display: inline-block;
		left: 9px;
		margin: 0px;
		padding: 7px 15px;
		font-size: 18px;
		color: #FFF;
		white-space: nowrap;
		background-color: #38F;
		border-radius: 0px;
		border-width: 0px 0px 1px 0px;
		border-style: solid;
		border-color: #f2f8f8 #38f #38f;
		-moz-border-top-colors: none;
		-moz-border-right-colors: none;
		-moz-border-bottom-colors: none;
		-moz-border-left-colors: none;
		border-image: none;
		box-shadow: 0px 1px 3px rgba(0, 0, 0, 0.05);
		vertical-align: middle;
		cursor: pointer;
		box-sizing: border-box;
	  }
  
      .search_btn:hover,
      .search_btn:active {
        background-position: 0 -15px;
        border-color: #ccc #ccc #b5b5b5;
      }
	  
      .search_btn:active { 
        border-color: #b5b5b5;
        background-image: none;
        box-shadow: inset 0 3px 5px rgba(0,0,0,.15);
      }  
	  
      input[type=text]:focus,
      input[type=password]:focus {
        outline: none;
        border-color: #51a7e8;
        box-shadow: inset 0 1px 2px rgba(0,0,0,.075), 0 0 5px rgba(81,167,232,.5);
      }
      
      label[for=search] {
        display: block;
        text-align: left;
      }
      #search label {
        font-weight: 200;
        padding: 5px 0;
      }
      #search input[type=text] {
        font-size: 18px;
        width: 500px;
      }
      #search .search_btn {
        padding: 8px;
        width: 90px;
		left:-10px
      }
      #search.selecter{
		padding:9px;
		width:90px;
	  }	 
	 .header {
		
		border-bottom-style: solid;
		cursor: pointer;
		border-bottom:thin;
	  }

	  .img{
		  margin-top:100px auto;
	  }
	  .footer{
		  line-height:5px;
	  }
</style>
<div class="contain">
    <div id="search">
    <label for="search"></label>
       <select name="classify" class="selecter">
                <option value="1" selected="selected">全部</option>
                <option value="2">电影</option>
                <option value="3">音乐</option>
                <option value="4">文档</option>
       </select>      
    <input line-height="auto" type="text" name="content" placeholder="输入关键词…">
    <input class="search_btn" type="submit" value="搜索">
    </div>
</div>
</@c.page>


