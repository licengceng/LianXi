package pratice;

public class lianxi {
    public static void main(String[] args) {
//        int i=2;
//        System.out.println( i== 1 & i++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
//        System.out.println(i);

//        ++i是将i的值先+1，然后返回i的值
//        i++是先将i的值存到寄存器里，然后执行i+1，然后返回寄存器里的值。

        int j=1; int z = 1;
        j+=++j;
        System.out.println(j);  //3

        ++z;
        System.out.println(z);//2
        z+=2;
        System.out.println(z);//4
    }
}
