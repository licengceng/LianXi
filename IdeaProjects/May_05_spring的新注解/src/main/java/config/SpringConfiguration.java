package config;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
/*
* 该类是一个配置类，它的作用和bean.xml一样
* spring中的新注解
*   @Configuration 作用：指定当前类是一个配置类
*   @ComponentScan 作用:用于指定 spring 在初始化容器时要扫描的包。
*      属性:value   他和basePackages的作用是一样的：都是用于指定创建容器要扫描的包
*           使用该注解等同于 在  xml 配置文件配置了的：<context:component-scan base-package="top.zoick"/>）
*  @Bean        作用：该注解只能写在方法上，表明使用此方法创建一个对象，并且放入 spring 容器。
*               属性: name  给当前@Bean 注解方法创建的对象指定一个名称(即 bean 的 id），当不写时，默认值是当前方法的名称
*               细节：当我们使用注解配置方法时，如果方法有参数，spring框架会去容器中查找有没有可用的bean对象，查找的方法和Autowired注解的作用是一样的
* */


@Configuration
@ComponentScan({"dao","service"}) //basePackages是一个数组
public class SpringConfiguration {   //用于创建一个QueryRunner对象
    @Bean(name="runner")  //用于创建一个QueryRunner对象也存入容器中
    @Scope("prototype")  // QueryRunner如果是单例对象，面临多个dao同时使用时，可能会出现线程安全问题 设置为多例
    public QueryRunner createQueryRunner(DataSource dataSource){
        return  new QueryRunner(dataSource);
    }
    /*
    * 创建数据源对象
    * */
    @Bean(name="dataSource") //对应上面参数的dataSource (DataSource dataSource)
    public DataSource createDataSource(){
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost/spring?serverTimezone=UTC");
            ds.setUser("root");
            ds.setPassword("root");
            return ds;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
