<#import  "../public/common.ftl" as c/>
<@c.page title="首页">
<form class="form-horizontal" id="crawl_form"   role="form" >
    <div class="form-group ">
			<label for="type" class="col-sm-2 control-label ">种类</label>
			<div class="col-sm-5">
				<select id="type" class=" form-control " name="type">
					<option value="1">音乐</option>
					<option value="2">电影</option>
					<option value="3">文档</option>
				</select>
			</div>
		</div>
		
		<div class="form-group ">
			<label for="keyword" class="col-sm-2 control-label">关键字</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" id="keyword"
					name="keyword" placeholder="请输入关键字">
			</div>
		</div>
		
		<div class="form-group ">
			<div class="col-sm-5 col-sm-offset-2">
				<button type="button"  id="do_search" class="btn btn-primary btn-lg">搜索</button>
			</div>
		</div>
</form>
<script src="/res/js/self/spider.js"></script>
</@c.page>
