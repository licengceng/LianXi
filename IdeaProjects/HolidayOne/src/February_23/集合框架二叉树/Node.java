package February_23.集合框架二叉树;

import java.util.ArrayList;
import java.util.List;

public class Node {
    // 左子节点
    public Node leftNode;
    // 右子节点
    public Node rightNode;
    // 值
    public Object value;
    // 插入 数据
    public void add(Object v) {
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == value)
            value = v;

            // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同

            if ((Integer) v -((Integer)value) <= 0) {
                if (null == leftNode)
                    leftNode = new Node();
                leftNode.add(v);
            }
            // 新增的值，比当前值大
            else {
                if (null == rightNode)
                    rightNode = new Node();
                rightNode.add(v);
            }

        }

    }
    //通过上一个步骤的插入行为，实际上，数据就已经排好序了。 接下来要做的是看，把这些已经排好序的数据，
    // 遍历成我们常用的List或者数组的形式
    //例如： 中序遍历所有的节点
    public List<Object> values(){
        List<Object> values=new ArrayList<>();
        // 左节点的遍历结果
        if (leftNode!=null){
            values.addAll(leftNode.values());
        }
        // 当前节点
        values.add(value);
        // 右节点的遍历结果
        if (rightNode!=null){
            values.addAll(rightNode.values());
        }
        return values;
    }
    public static void main(String[] args) {
        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
        Node roots = new Node();
        for (int number : randoms) {
           roots.add(number);
        }
        roots.values();
        System.out.println(roots.values());
    }
}