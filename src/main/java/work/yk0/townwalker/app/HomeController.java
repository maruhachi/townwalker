package work.yk0.townwalker.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ykonno.
 * @since 2019/09/10.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/map")
    public String map(){
        return "map";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "yo-soro-!";
    }
}
