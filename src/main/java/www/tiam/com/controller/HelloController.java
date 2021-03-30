package www.tiam.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * springboot测试controller
 */
@Controller
public class HelloController {

    //访问地址：localhost:8080/hello
    @RequestMapping("/hello")
    public @ResponseBody String  hello(){
        return "Hello SpringBoot!";
    }
}
