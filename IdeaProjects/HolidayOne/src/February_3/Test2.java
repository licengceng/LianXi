package February_3;

public class Test2 {
    public static void main(String[] args) {
//        英文绕口令
//        peter piper picked a peck of pickled peppers
//        统计这段绕口令有多少个以p开头的单词
        String string="  peter piper picked a peck of pickled peppers";
        int count=0;

        //split 根据分隔符进行分隔
        String sentence[]=string.trim().split(" ");//去除首尾空格，再根据空格进行分割，得到8个子字符串
        for (String ss:sentence
             ) {
            System.out.println(ss);
        }

        for (int i = 0; i <sentence.length ; i++) {
            String string1=sentence[i];
            if (string1.charAt(0)=='p'){     //String取字符charAt()
                count++;
            }

        }
        System.out.println("p个数为："+count);
    }
}
