package February_25.集合框架HashSet;

public class 生成50个0_50之间的随机数要求不能有重复的 {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet=new HashSet<>();
        do {
            int number=(int) (Math.random()*50);
            integerHashSet.add(number);
        }while (integerHashSet.size()<50);
        System.out.println(integerHashSet.size());
        System.out.println(integerHashSet);
    }
}
