package www.tiam.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * RESTFull风格url测试
 */
@Controller
public class RESTFullController {

    //访问地址：localhost:8090/hello/123/zhangsan
    @RequestMapping("/hello/{id}/{name}")
    public @ResponseBody String  hello(@PathVariable("id") Integer id, @PathVariable("name")String name){
        return "Hello "+id + name;
    }
}
