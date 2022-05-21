import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public ArrList() {
    }

    public static void main(String[] args) {
        List<String> group = new ArrayList();
        group.add("Nguyễn Danh Hưng");
        group.add("Chu Tiến Đạt");
        group.add("Bùi Văn Dũng");
        group.add(0, "Lê Tuấn Minh");
        System.out.println(group);
        List<String> Class = new ArrayList(group);
        System.out.println(Class);
        Class.addAll(group);
        System.out.println(Class);
        System.out.println((String)group.get(0));
        group.set(0, "Tuấn Minh");
        System.out.println((String)group.get(0));
        System.out.println(group.isEmpty());
        Class.remove("Lê Tuấn Minh");
        Class.remove(1);
        System.out.println(Class);
        Class.removeAll(group);
        System.out.println(Class);
        group.removeIf((element) -> {
            return element.length() > 5;
        });
        System.out.println(group);
        Class.clear();
        System.out.println(Class);
    }
}

