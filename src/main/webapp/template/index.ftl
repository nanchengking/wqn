<#import "/public/common.ftl" as c/>
<@c.page title="spider"  styles=["index-css.css"]>
<div class="col-sm-10  col-sm-offset-2">
	<form class="form-horizontal" id="login_form"   role="form" >
		<div class="form-group ">
			<label for="leval" class="col-sm-2 control-label ">等级</label>
			<div class="col-sm-5">
				<select id="leval" class=" form-control " name="leval">
					<option value="1">刘述清</option>
					<option value="2">王倩男</option>
					<option value="3">普通用户</option>
				</select>
			</div>
		</div>
		<div class="form-group ">
			<label for="name" class="col-sm-2 control-label ">名字</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="请输入名字">
			</div>
		</div>
		<div class="form-group ">
			<label for="passWord" class="col-sm-2 control-label">密码</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" id="passWord"
					name="passWord" placeholder="请输入密码">
			</div>
		</div>
		<div class="form-group ">
			<div class="col-sm-5 col-sm-offset-2">
			<#--必须是 type='button' 才能屏蔽form的默认方法，不会出现url提交了-->
				<button type="button" id="submit_form" class="btn btn-primary btn-lg">注册</button>
				<button type="button"  id="change_to_spider" class="btn btn-primary btn-lg">爬虫</button>
			</div>
		</div>
	</form>
</div>
<script src="/res/js/self/sign.js"></script>
<script src="/res/js/self/test.js"></script>
</@c.page>


