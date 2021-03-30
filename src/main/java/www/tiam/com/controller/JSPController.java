package www.tiam.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * springboot测试controller
 */
@Controller
public class JSPController {


    @GetMapping("/index")
    public String  index(Model model){
        model.addAttribute("msg","Spring boot集成JSP");
        return "index";
    }
}
