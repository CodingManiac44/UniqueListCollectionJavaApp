import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        HashSet<Integer> uniqueSet = new HashSet<Integer>();
        uniqueSet.addAll(list);
        System.out.println(uniqueSet);
//        System.out.println(list);

    }

}

