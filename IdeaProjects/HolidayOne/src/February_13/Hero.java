package February_13;
//一个英雄攻击另一个英雄的时候，如果发现另一个英雄已经挂了，就会抛出EnemyHeroIsDeadException
//创建一个类EnemyHeroIsDeadException，并继承Exception
//提供两个构造方法
//1. 无参的构造方法
//2. 带参的构造方法，并调用父类的对应的构造方法
 class EnemyHeroIsDeadException extends Exception {
    public EnemyHeroIsDeadException(){
    }
    public EnemyHeroIsDeadException(String msg){
        super(msg);
    }
}
//在Hero的attack方法中，当发现敌方英雄的血量为0的时候，抛出该异常
//        1. 创建一个EnemyHeroIsDeadException实例
//        2. 通过throw 抛出该异常
//        3. 当前方法通过 throws 抛出该异常
//        在外部调用attack方法的时候，就需要进行捕捉，并且捕捉的时候，可以通过e.getMessage() 获取当时出错的具体原因
class Hero{
     public String name;
     protected int hp;
     public void attckHero(Hero h) throws EnemyHeroIsDeadException{
         if(h.hp==0){
             throw new EnemyHeroIsDeadException(h.name+" 已经挂了,不需要施放技能");
         }
     }
     public String toString(){
         return name;
     }

    public static void main(String[] args) {
        Hero hero1=new Hero();
        hero1.name="盖伦";
        hero1.hp=100;

        Hero hero2=new Hero();
        hero2.name="提莫";
        hero2.hp=0;

        try {
            hero1.attckHero(hero2);
        }catch (Exception e){
            System.out.println("异常的原因："+e.getMessage());
            e.printStackTrace();
        }
    }
}
