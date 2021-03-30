package www.tiam.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot01Application {

    public static void main(String[] args) {
        // 启动springboot程序，启动内置的Tomcat
        SpringApplication.run(Springboot01Application.class, args);
    }

}
