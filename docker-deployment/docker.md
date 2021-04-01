##docker安装mysql
###拉取镜像
docker pull mysql:8.0.21
###创建容器
docker run –-name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root1234 -d mysql:8.0.21
docker run --name mysql -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root1234 -d mysql:5.6.40
docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root1234 --name mysql:8.0.21 d7e5f99b502a904a970026e90227e186107e3b5d0baeaa93491af12cd7317b99
docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root1234 --name=mysql:8.0.21
###登录mysql
mysql -u root -p