package cn.sc.love.thymeleaf.controller;

import cn.sc.love.thymeleaf.fruit.dao.impl.FruitDAOImpl;
import cn.sc.love.thymeleaf.pojo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
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
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FruitDAOImpl fruitDAO = new FruitDAOImpl();
        List<Fruit> fruitList = fruitDAO.getFruitList();
        HttpSession session = req.getSession();
        session.setAttribute("list",fruitList);
    }
}
