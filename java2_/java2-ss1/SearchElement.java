import java.util.ArrayList;
import java.util.List;

public class SearchElement {
    public SearchElement() {
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyễn Danh Hưng", "T2109M");
        Student student2 = new Student(2, "Chu Tiến Đạt", "T2109M");
        Student student3 = new Student(3, "Bùi Văn Dũng", "T2109M");
        Student student4 = new Student(4, "Lê Tuấn Minh", "T2109M");
        List<Student> BigClass = new ArrayList();
        BigClass.add(student1);
        BigClass.add(student2);
        BigClass.add(student3);
        BigClass.add(student4);
        BigClass.contains(student1);
        BigClass.contains(new Student(5, "Nguyễn Tuấn Anh", "T2108M"));
        int index = BigClass.indexOf(new Student(5, "Nguyễn Tuấn Anh", "T2108M"));
        System.out.println(index);
        index = BigClass.lastIndexOf(new Student(5, "Nguyễn Tuấn Anh", "T2108M"));
        System.out.println(index);
    }
}
