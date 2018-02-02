FROM 192.168.0.237:20202/hwcse/java:8-jdk

WORKDIR /home/apps/
ADD target/hellotest-1.0.0.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
