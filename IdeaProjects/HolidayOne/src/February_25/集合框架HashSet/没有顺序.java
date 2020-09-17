package February_25.集合框架HashSet;

import java.util.HashSet;

//Set中的元素，没有顺序。
//严格的说，是没有按照元素的插入顺序排列
//HashSet的具体顺序，既不是按照插入顺序，也不是按照hashcode的顺序。关于hashcode有专门的章节讲解: hashcode 原理。
//以下是HashSet源代码中的部分注释
// * It makes no guarantees as to the iteration order of the set;
// * in particular, it does not guarantee that the order will remain constant over time.
//不保证Set的迭代顺序; 确切的说，在不同条件下，元素的顺序都有可能不一样
//换句话说，同样是插入0-9到HashSet中， 在JVM的不同版本中，看到的顺序都是不一样的。
//    所以在开发的时候，不能依赖于某种臆测的顺序，这个顺序本身是不稳定的
public class 没有顺序 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        // Set中的元素排列，不是按照插入顺序
        System.out.println(numbers);

    }
}