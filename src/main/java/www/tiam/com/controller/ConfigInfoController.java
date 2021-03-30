package www.tiam.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import www.tiam.com.config.ConfigInfo;

/**
 * 读取自定义配置
 * 1、使用spring提供的@Value注解
 * 2、使用@ConfigrationProperties注解（实现在ConfigInfo类）
 */
@Controller
public class ConfigInfoController {


    private String name;

    private String address;

    @Autowired
    private ConfigInfo configInfo;


    @RequestMapping("/getConfigInfo")
    public @ResponseBody String  getConfigInfo(){

//         return name +"---"+address;
        return configInfo.getName() +"^^^"+configInfo.getAddress();
    }
}
