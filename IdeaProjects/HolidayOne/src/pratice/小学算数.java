package pratice;

public class 小学算数 {
    public static void main(String[] args) {
        for (int i = 1; i < 14; i++) {
            for (int j = 1; j <14 ; j++) {
                for (int k = 1; k <14 ; k++) {
                    for (int l = 1; l <14 ; l++) {
                        if ((i+j==8)&&(k-l==6)&&(i+k==14)&&(j+l==10))
                            System.out.println("i:"+i+",j:"+j+",k:"+k+",l:"+l);

                    }
                }
            }
        }
    }
}
