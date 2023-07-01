package cn.sc.love.thymeleaf.fruit.dao;

import cn.sc.love.thymeleaf.pojo.Fruit;

import java.util.List;

/**
 * @Author yupengtao
 * @Date 2023/7/1 12:09
 **/
public interface FruitDAO {
    //获取所有库存列表信息
    List<Fruit> getFruitList();
}
