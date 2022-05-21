import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayIteration {
    public ArrayIteration() {
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
        Iterator iterator = BigClass.iterator();

        while(iterator.hasNext()) {
            Student student = (Student)iterator.next();
            System.out.println(student);
        }

        BigClass.forEach((element) -> {
            System.out.println(element);
        });
        iterator = BigClass.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator listIterator = BigClass.listIterator(BigClass.size());

        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
