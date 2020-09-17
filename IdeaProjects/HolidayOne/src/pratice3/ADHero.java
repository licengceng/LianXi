package pratice3;
//疑问-->21
public class ADHero extends Hero implements AD{

    int moveSpeed=400; //移动速度


    public int func(int a){
        int b=a++;
        System.out.println("b:"+b);
        return b;
    }
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public void attack(){
        System.out.println("物理输出");
    }
    public int getMoveSpeed(){
        return this.moveSpeed;     //没有打印却输出有打印值  --对比第14、15行
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

    public static void main(String[] args) {
        ADHero h= new ADHero();
        h.func(5);
//        System.out.println(h.getMoveSpeed());
//        System.out.println(h.getMoveSpeed2());
        System.out.println(h+" "+h.toString());
    }

}