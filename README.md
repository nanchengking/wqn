# wqn

<h3>A dmoz website for wqn</h3>
<h3>基于SpringMVC的轻量级web应用，数据库由mybatis托管，模板生成使用freemarker（同时可以用原生html页面），核心功能是webmagic实现的多线程爬虫</h3>

========================导入方法=====================<br>

1.项目clone到本地<br>
2.eclipse 导入项目：import maven project<br>
3.右键，run as maven install<br>
3.右键，run as maven build ,输入goals： tomcat7：run，然后点击运行<br>
4.浏览器输入localhost：8080，进入欢迎页面<br>
========================代码更新=====================<br>
1.为了避免一切不必要的麻烦，在本地新建自己的分支 ：git chechkout -b wqn<br>
2.更新代码前，确保没有冲突代码，git stash 一下<br>
3.直接更新dev分支上的最新代码，并且rebase，保证commit的正确顺序git pull --rebase --no-ff origin dev  <br>
4.释放之前的暂存代码：  git stash pop<br>
5.上传自己的代码，不允许直接push到dev分支，只需要推送到自己的分支：git push origin wqn<br>
如果显示错误，强制推送，git push origin wqn -f<br>
6.发起合并请求，在Github页面新建一个pullrequest，等待合并允许<br>

========================建表语句======================<br>
CREATE USER 'wqn'@'localhost' IDENTIFIED BY '123456';<br>
GRANT ALL ON test TO 'wqn'@'localhost';<br>
 CREATE DATABASE wqn DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;<br>
 CREATE TABLE if not exists user(<br>
  id int(11) PRIMARY KEY AUTO_INCREMENT,<br>
  password varchar(50) NOT NULL,<br>
  name varchar(100) DEFAULT NULL,<br>
  created_at TIMESTAMP NOT NULL,<br>
  updated_at TIMESTAMP NOT NULL,<br>
  leval int(11) NOT NULL,<br>
  description varchar(300) DEFAULT NULL
); <br>
