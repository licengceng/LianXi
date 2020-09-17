package March_1.JDBC;

public class _1初始化驱动 {
    public static void main(String[] args) {
    //初始化驱动  （首先在lib下导入包，再在idea目项目模块Modules的dependencies +号添加jar包）

        try {
        //驱动类com.mysql.jdbc.Driver
        //就在 mysql-connector-java-5.0.8-bin.jar中
        //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
        Class.forName("com.mysql.jdbc.Driver");

        System.out.println("数据库驱动加载成功 ！");

    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}
}