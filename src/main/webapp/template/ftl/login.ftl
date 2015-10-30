<#import "../public/common.ftl" as c/>
<@c.page title="首页" styles=["project.css"] >

<button onclick="testChangeToHtml('/login/html')" type="button" >
点击跳转到html写成的页面
</button>

<button onclick="testChangeToHtml('/')" type="button" >
点击跳转到首页
</button>

<button id='t_button'>点击按钮会在控制台打印出这句话</button>
<script src="/res/js/self/test.js"></script> 

</@c.page>


