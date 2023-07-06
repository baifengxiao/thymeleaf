package cn.sc.love.thymeleaf.controller;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * @author YPT
 * @create 2023-05-16-21:43
 */

@Controller
public class indexController {

    @GetMapping("index")
    public String index(HttpServletRequest request){

        request.setAttribute("name","柳岩");

        List<String> list = Arrays.asList("刘德华", "张学友", "周星驰","刘一菲","李伟");
        request.setAttribute("list",list);

        return "index";
    }
}
