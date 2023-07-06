package cn.sc.love.thymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author YPT
 * @create 2023-05-16-21:43
 */

@Controller
public class indexController {

    @GetMapping("index")
    public String index(HttpServletRequest request, HttpSession session, Model model, HashMap hashMap) {

        request.setAttribute("name", "柳岩");

        List<String> list = Arrays.asList("刘德华", "张学友", "周星驰", "刘一菲", "李伟");
        request.setAttribute("list", list);
        request.setAttribute("age", 18);

        session.setAttribute("addr", "北京首都天安门");

        request.setAttribute("gname", "<span style=color:red>红色字体</span>");
        request.setAttribute("category3Id", 61);
//法1
        Map<String, String> map = new HashMap<>();
        map.put("mapName", "N001");
        map.put("mapAge", "28");
//          上下文对象
//        model.addAttribute("map", map);
//        存map法2,自动拆开成键值对扔
        model.addAllAttributes(map);
//法3，上下文对象
        hashMap.put("name","007");
        return "index";
    }

    @GetMapping("/list")
    @ResponseBody
    public String list(String category3Id) {
        return category3Id;
    }
}
