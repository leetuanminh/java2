import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrList {
    public SortArrList() {
    }

    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList();
        listNum.add(5);
        listNum.add(4);
        listNum.add(6);
        listNum.add(8);
        listNum.add(1);
        listNum.add(2);
        System.out.println(listNum);
        Collections.sort(listNum);
        System.out.println(listNum);
        Collections.reverse(listNum);
        System.out.println(listNum);
        System.out.println(listNum);
        listNum.sort((num1, num2) -> {
            return num1.compareTo(num2);
        });
        System.out.println(listNum);
    }
}
