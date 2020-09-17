package February_3;

public class 操作字符串 {
    public static void main(String[] args) {
        //charAt(int index)获取指定位置的字符
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";  //25个字符
        char c = sentence.charAt(0);  //盖
        System.out.println(c);
        int a=sentence.length();  //25
        System.out.println(a);
       //toCharArray()获取对应的字符数组
        char[] cs = sentence.toCharArray(); //获取对应的字符数组
        System.out.println(sentence.length() == cs.length);
        //subString 截取子字符串
        //截取从第3个开始的字符串 （基0）
        String subString1 = sentence.substring(3);
        System.out.println(subString1);         //在进行了连续8次击杀后,获得了 超神 的称号
        //截取从第3个开始的字符串 （基0）
        //到5-1的位置的字符串
        //左闭右开
        String subString2 = sentence.substring(3,5);
        System.out.println(subString2);         //在进
        //split 根据分隔符进行分隔
        //根据,进行分割，得到3个子字符串
        String subSentences[] = sentence.split(",");  //注：,不会输出
        for (String sub : subSentences) {             //盖伦
            System.out.println(sub);                 // 在进行了连续8次击杀后
        }
        String sentence2 = "   盖伦,在进行了连续8次击杀后,获得了 超神 的称号  ";// 获得了 超神 的称号
        //trim 去掉首尾空格
        System.out.println(sentence2);
        System.out.println(sentence2.trim());
        //toLowerCase 全部变成小写
        //toUpperCase 全部变成大写
        String sentence3 = "Garen";
        //全部变成小写
        System.out.println(sentence3.toLowerCase());
        //全部变成大写
        System.out.println(sentence3.toUpperCase());
        //indexOf 判断字符或者子字符串出现的位置
        //contains 是否包含子字符串
        String sentence4 = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        System.out.println(sentence4.indexOf('8')); //字符第一次出现的位置(0开始) 9
        System.out.println(sentence4.indexOf("超神")); //字符串第一次出现的位置 18
        System.out.println(sentence4.lastIndexOf("了")); //字符串最后出现的位置 17
        System.out.println(sentence4.indexOf(',',5)); //从位置5开始，出现的第一次,的位置 14
        System.out.println(sentence4.contains("击杀")); //是否包含字符串"击杀" true
        //replaceAll 替换所有的
        //replaceFirst 只替换第一个
        String sentence5 = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        String temp = sentence5.replaceAll("击杀", "被击杀"); //替换所有的
        temp = temp.replaceAll("超神", "超鬼");
        System.out.println(temp);       //盖伦,在进行了连续8次被击杀后,获得了超鬼 的称号
        temp = sentence5.replaceFirst(",","");//只替换第一个
        System.out.println(temp);     //盖伦在进行了连续8次击杀后,获得了超神 的称号

    }
}
