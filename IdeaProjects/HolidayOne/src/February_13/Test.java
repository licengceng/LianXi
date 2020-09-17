package February_13;
//对MyStringBuffer的插入和删除方法中的边界条件判断，用抛出异常来解决
//例: insert(int pos, String b) , 当pos 是负数的时候，抛出自定义异常
//需要实现自定义两种异常
//IndexIsNagetiveException 下标为负异常
//IndexIsOutofRangeException 下标超出范围异常
//以下是需要调用这些异常的场景：
//pos<0
//抛出 IndexIsNagetiveException
//pos>length
//抛出 IndexIsOutofRangeException
//null==b
//抛出 NullPointerException
//start<0
//抛出 IndexIsNagetiveException
//start>length
//抛出 IndexIsOutofRangeException
//end<0
//抛出 IndexIsNagetiveException
//end>length
//抛出 IndexIsOutofRangeException
//start>=end
//抛出 IndexIsOutofRangeException
//注意： 接口IStringBuffer中声明的方法需要抛出异常
public class Test {

}
