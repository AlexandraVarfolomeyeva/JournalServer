package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Journal")
public class HomeController {

    @RequestMapping(value = "/get", method= RequestMethod.GET)
    public String getName(){
        return "my name";
    }
}
