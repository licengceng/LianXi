package pratice4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String name;
    private int age;
    private Date birthday;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public User(String name, int age, Date birthday) throws ParseException {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    public User(){}

    /*逻辑视图
    *方便操作没有相应成员变量的属性，
    * */
    public String getBirth(){
        if(birthday!=null){
            //1.格式化日期对象
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //2.返回字符串
            return simpleDateFormat.format(birthday);
        }
        else {
            return null;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}

