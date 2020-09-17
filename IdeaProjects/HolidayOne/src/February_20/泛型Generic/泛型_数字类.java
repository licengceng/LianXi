package February_20.泛型Generic;

import java.util.ArrayList;

public class 泛型_数字类 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(123);//int
        numbers.add(123f);//float
        numbers.add(123d);//double


        //泛型使用Number, 就可以放所有Number的子类，比如Integer,Float,Double
        //但是不能放String
        // numbers.add("String");
    }
}

