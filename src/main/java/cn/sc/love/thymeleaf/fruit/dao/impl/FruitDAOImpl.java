package cn.sc.love.thymeleaf.fruit.dao.impl;

import cn.sc.love.thymeleaf.fruit.dao.FruitDAO;
import cn.sc.love.thymeleaf.myssm.basedao.BaseDAO;
import cn.sc.love.thymeleaf.pojo.Fruit;

import java.util.List;

/**
 * @Author yupengtao
 * @Date 2023/7/1 12:11
 **/
public class FruitDAOImpl extends BaseDAO<Fruit> implements FruitDAO {
    @Override
    public List<Fruit> getFruitList() {
        List<Fruit> fruits = super.executeQuery("select * from t_fruit");
        return fruits;
    }
}
