package February_3;
//Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak
//把最后一个two单词首字母大写
public class Test5 {
    public static void main(String[] args) {
    String string="Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
    int index =string.lastIndexOf("two");

    String string1=string.substring(0,index);
    String string2=string.substring(index);
    String string3=string2.replaceAll("two","Two");
        System.out.println(string1.concat(string3));//拼接

        }
    }
