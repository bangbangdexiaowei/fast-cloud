FROM bangbangdexiaowei/centos7-jdk8:latest
# 制作镜像
MAINTAINER xiaowei

# 工作目录，类似于cd命令
WORKDIR /root

# 将target目录下的docker-demo-1.0.jar包复制到docker容器的/root目录下
ADD /target/*.jar /root/application.jar

# 用于设置环境变量
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8
ENV TZ Asia/Shanghai

# 声明服务运行在8080端口
EXPOSE 8080

# 指定docker容器启动时执行的命令，格式：ENTRYPOINT ["executable", "param1","param2"...]
ENTRYPOINT ["java","-jar","/root/application.jar"]