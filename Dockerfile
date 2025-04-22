## 基础镜像使用java
FROM openjdk:11
#
## 将JAR文件复制到镜像中
COPY *.jar /home/app/app.jar
#
## 暴露Spring Boot应用程序的端口（确保端口号与Spring Boot应用程序中的端口一致）
EXPOSE 8085
#
## 定义启动命令，运行Spring Boot应用程序
CMD ["java", "-jar", "/home/app/app.jar"]
