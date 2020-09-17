package dao;

import domain.Items;

import java.util.List;

public interface ItemsDao {
     List<Items> findAll();//java接口的方法默认都是public abstract类型，

    //因此我们在编写接口的实现类的时候，方法的实现前面要显式的加上public访问控制符
}
