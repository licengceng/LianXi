package February_13;

public class Account {
    private double balance;// 余额
    public double getBalance(){  //获取余额
        return balance;
    }
    public double  deposit(double money){ //存钱
        balance+=money;
        System.out.println("当前存入"+money+"，当前余额为；"+balance);
        return balance;
    }
    public double withdraw(double money) throws OverdraftException{  //取钱
        if (balance>=money){
            balance=balance-money;
            System.out.printf("当前取%f,剩余%f",money,balance);
        }else {
           throw  new OverdraftException("已透支：",balance);

        }
        return balance;
    }
    class OverdraftException extends Exception{ //透支额
        private double deficit;
        public OverdraftException(){}
        public OverdraftException(String message,double deficit){
            super(message);
            this.deficit=deficit;
        }
    }


    public static void main(String[] args) {
        Account account=new Account();
        double num;
        account.balance=0;
        num=account.getBalance();
        System.out.println("余额为："+num);
        account.deposit(500);
        try{
            account.withdraw(100);
            account.withdraw(1000);
        }catch (Exception e){
            e.printStackTrace();

            System.out.println("透支的具体原因："+e.getMessage());
        }



    }
}
