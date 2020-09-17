package pratice;
//寻找某两个数相除，其结果 离黄金分割点 0.618最近
//
//        分母和分子不能同时为偶数
//        分母和分子 取值范围在[1-20]
public class 黄金分割点 {
    public static void main(String[] args) {
        int answerfenzi=0;
       int answerfenmu=0;
        float Mindiffer=100;  //最小分割点相差
        float Value=0;
        for (int fenzi = 1; fenzi <=20 ; fenzi++) {
            for (int fenmu = 1; fenmu <=20 ; fenmu++) {
                if (fenmu%2==0&&fenzi%2==0)continue;
                float value=(float)fenzi/fenmu;
                float differ=value-0.618f;
                differ=differ<0?0-differ:differ;
                if(differ<=Mindiffer){
                    Mindiffer=differ;
                    answerfenmu=fenmu;
                    answerfenzi=fenzi;
                    Value=value;
                }
            }
        }
        System.out.println("值为："+Value+",分子为:"+answerfenzi+",分母为："+answerfenmu);
    }
}
