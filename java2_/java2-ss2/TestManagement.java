import java.util.Scanner;

public class TestManagement {
    public TestManagement() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student1 = new Student("01", "Nguyễn Danh Hưng", "Hà Nội", "leetuanminh@gmail.com", "01/01/2003", 1);
        Student student2 = new Student("02", "Lê Tuấn Minh", "Hà Nội", "leetuanminh@gmail.com", "01/01/2003", 1);
        Student student3 = new Student("03", "Bùi Văn Dũng", "Hà Nội", "leetuanminh@gmail.com", "01/01/2003", 1);
        Student student4 = new Student("04", "Chu Tiến Đạt", "Hà Nội", "leetuanminh@gmail.com", "01/01/2003", 1);
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);
        studentManagement.addStudent(student3);
        studentManagement.addStudent(student4);

        int selection;
        do {
            System.out.println("Mời nhập lựa chọn:");
            System.out.println("1.Thêm học sinh");
            System.out.println("2.Xóa học sinh");
            System.out.println("3.Sửa học sinh");
            System.out.println("4.Sắp xếp học sinh theo tên A->Z");
            System.out.println("5.Tìm Kiếm học sinh");
            System.out.println("6.In danh sách sinh viên");
            System.out.println("7.Thoát");
            selection = in.nextInt();
            switch(selection) {
                case 1:
                    studentManagement.addStudent();
                    break;
                case 2:
                    studentManagement.removeStudent();
                    break;
                case 3:
                    studentManagement.setStudent();
                    break;
                case 4:
                    studentManagement.sortStudent();
                    break;
                case 5:
                    studentManagement.searchStudent();
                    break;
                case 6:
                    studentManagement.getStudentList();
            }
        } while(selection < 7);

    }
}

