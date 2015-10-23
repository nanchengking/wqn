# wqn
====================导入方法========================<br>
1.项目clone到本地<br>
2.eclipse 导入项目：import maven project<br>
3.run as maven install<br>
3.run as maven build ,输入goal： tomcat7：run，然后点击运行<br>
4.浏览器输入localhost：8080，进入欢迎页面<br>
a dmoz website for wqn<br>
========================建表语句=============================
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
