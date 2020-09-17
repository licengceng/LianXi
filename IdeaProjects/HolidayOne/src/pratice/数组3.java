package pratice;

public class 数组3 {
    public static void main(String[] args) {
        int values [] = new int[]{18,62,68,82,65,9};
        //常规遍历
//        for (int i = 0; i < values.length; i++) {
//            int each = values[i];
//            System.out.println(each);
//        }

        //增强型for循环遍历    注：增强型for循环只能用来取值，却不能用来修改数组里的值
        for (int a:values) {
            System.out.print(a+" ");
        }
        int max=values[0];
        for (int a: values) {
            if (a>max){
                max=a;
            }
        }
        System.out.println("最大值为："+max);
    }
}