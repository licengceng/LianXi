package February_6;

public class 可变字符串StringBuffer {
    public static void main(String[] args) {
        //append追加
        //delete 删除
        //insert 插入
        //reverse 反转
        String str1 = "let there ";
        StringBuffer sb = new StringBuffer(str1); //根据str1创建一个StringBuffer对象
        sb.append("be light"); //在最后追加
        System.out.println(sb);
        sb.delete(4, 10);//删除4-10之间的字符
        System.out.println(sb);
        sb.insert(4, "there ");//在4这个位置插入 there
        System.out.println(sb);
        sb.reverse(); //反转
        System.out.println(sb);

        String string="abc";
        StringBuffer stringBuffer=new StringBuffer(string);
        System.out.println(stringBuffer.append("def"));//abcdef
        System.out.println(stringBuffer.delete(4,6));//abcd
        System.out.println(stringBuffer.insert(4,"def"));//abcddef
        System.out.println(stringBuffer.length());//7    length: “abcddef”的长度 3
        System.out.println(stringBuffer.capacity());//17  capacity: 分配的总空间 19  注： 19这个数量，不同的JDK数量是不一样的
    }
}
