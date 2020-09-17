package March_2.JDBC.Dao;
import java.util.List;
//DAO=DataAccess Object
//数据访问对象,把数据库相关的操作都封装在这个类里面，其他地方看不到JDBC的代码
public interface Dao{
    //增加
    public void add(Hero hero);
    //修改
    public void update(Hero hero);
    //删除
    public void delete(int id);
    //获取
    public Hero get(int id);
    //查询
    public List<Hero> list();
    //分页查询
    public List<Hero> list(int start, int count);
}