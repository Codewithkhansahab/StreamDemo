import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println(list);
        List<Integer> list2 = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(list2);

     }

}
