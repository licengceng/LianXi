package February_3;

public class Test1 {
    public static void main(String[] args) {
        //给出一句英文句子： "let there be light"
        //得到一个新的字符串，每个单词的首字母都转换为大写
        String string="let there be light";
        String  str=string.replaceAll("there","There");
        str=str.replaceAll("let","Let");
        str=str.replaceAll("be","Be");
        str=str.replaceAll("light","Light");
        System.out.println(str);
    }
}
