package cn.sc.love.thymeleaf.controller;

import cn.sc.love.thymeleaf.fruit.dao.impl.FruitDAOImpl;
import cn.sc.love.thymeleaf.myssm.myspringmvc.ViewBaseServlet;
import cn.sc.love.thymeleaf.pojo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @Author yupengtao
 * @Date 2023/7/1 12:22
 **/
@WebServlet("/index")
public class IndexServlet extends ViewBaseServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FruitDAOImpl fruitDAO = new FruitDAOImpl();
        List<Fruit> fruitList = fruitDAO.getFruitList();
        HttpSession session = req.getSession();
        session.setAttribute("list", fruitList);

//        逻辑视图名称"index",物理视图名称在此基础上加上前缀后缀
        super.processTemplate("index", req, resp);
    }
}
