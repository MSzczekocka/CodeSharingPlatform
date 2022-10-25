package platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {

    @RequestMapping(value = "/code", produces = "text/html")
    public static String getHtmlCode() {
        return "index";
    }

}
