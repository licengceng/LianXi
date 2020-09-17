package service;

import java.util.Date;

public class AccountServiceImpl implements IAccountService{
    //如果是经常变化的数据，并不适用于注入的方式
    private String name;    //String类型
    private Integer age;    //基本类型
    private Date birthday;  //其他bean类型
    public AccountServiceImpl(String name,Integer age,Date birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了。。。"+name+","+age+","+birthday);
    }

}
