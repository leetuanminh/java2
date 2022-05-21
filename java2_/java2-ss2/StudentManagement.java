import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private List<Student> studentList = new ArrayList();
    private static Scanner in;

    public StudentManagement() {
    }

    public void getStudentList() {
        Iterator var1 = this.studentList.iterator();

        while(var1.hasNext()) {
            Student stu = (Student)var1.next();
            PrintStream var10000 = System.out;
            String var10001 = stu.getRollNo();
            var10000.println("RollNo(" + var10001 + "): " + stu.getFullName());
        }

    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void addStudent() {
        System.out.println("Thêm sinh viên");
        System.out.println("Nhap rollNo sv dạng chuỗi");
        String rollNo = in.next();
        if (this.studentList.stream().allMatch((student) -> {
            return !student.getRollNo().equals(rollNo);
        })) {
            System.out.println("Nhap fullName sv dạng chuỗi");
            String fullName = in.next();
            System.out.println("Nhap address sv dạng chuỗi");
            String address = in.next();
            System.out.println("Nhap email sv dạng chuỗi");
            String email = in.next();
            System.out.println("Nhap ngay sinh sv dạng chuỗi");
            String DBO = in.next();
            System.out.println("Nhap status sv dạng số");
            int status = in.nextInt();
            Student stu = new Student(rollNo, fullName, address, email, DBO, status);
            this.studentList.add(stu);
            System.out.println("Thêm sinh viên thành công");
        } else {
            System.out.printf("Sinh viên đã tồn tại");
        }

    }

    public void removeStudent() {
        System.out.println("Xóa học sinh");
        System.out.println("Mời bạn nhập rollNo:");
        String rollNo = in.next();
        if (this.studentList.stream().anyMatch((studentx) -> {
            return studentx.getRollNo().equals(rollNo);
        })) {
            Iterator var2 = this.studentList.iterator();

            while(var2.hasNext()) {
                Student student = (Student)var2.next();
                if (student.getRollNo().equals(rollNo)) {
                    this.studentList.remove(student);
                    System.out.printf("Xóa sinh viên thành công");
                    break;
                }
            }
        } else {
            System.out.printf("Sinh viên đã tồn tại");
        }

    }

    public void sortStudent() {
        this.studentList.sort((stu1, stu2) -> {
            return stu1.getFullName().compareTo(stu2.getFullName());
        });
        this.getStudentList();
    }

    public void setStudent() {
        System.out.println("Mời bạn nhập id sinh viên cần chỉnh sửa");
        String id = in.next();
        boolean check = false;
        Student stu = null;
        Iterator var4 = this.studentList.iterator();

        while(var4.hasNext()) {
            Student student = (Student)var4.next();
            if (student.getRollNo().equals(id)) {
                check = true;
                stu = student;
                break;
            }
        }

        if (check) {
            System.out.println("Mời bạn chọn:");
            System.out.println("1: Thay đổi email");
            System.out.println("2: Thay dổi status");
            System.out.println("3: Thay đổi address");
            int selection = in.nextInt();
            switch(selection) {
                case 1:
                    System.out.println("Mời bạn nhập thay đổi");
                    String email = in.next();
                    Iterator var12 = this.studentList.iterator();

                    while(var12.hasNext()) {
                        Student student = (Student)var12.next();
                        if (student.equals(stu)) {
                            student.setEmail(email);
                        }
                    }

                    return;
                case 2:
                    System.out.println("Mời bạn nhập thay đổi");
                    int st = in.nextInt();
                    Iterator var13 = this.studentList.iterator();

                    while(var13.hasNext()) {
                        Student student = (Student)var13.next();
                        if (student.equals(stu)) {
                            student.setStatus(st);
                        }
                    }

                    return;
                case 3:
                    System.out.println("Mời bạn nhập thay đổi");
                    String address = in.next();
                    Iterator var8 = this.studentList.iterator();

                    while(var8.hasNext()) {
                        Student student = (Student)var8.next();
                        if (student.equals(stu)) {
                            student.setAddress(address);
                        }
                    }

                    return;
                default:
                    System.out.println("Bạn đã chọn sai");
            }
        } else {
            System.out.println("ID bạn chọn không tồn tại");
        }

    }

    public void searchStudent() {
        System.out.println("Chọn tìm kiếm học sinh theo:");
        System.out.println("1.RollNo");
        System.out.println("2.Tên");
        int selection = in.nextInt();
        System.out.println("Nhập nội dung tìm kiếm");
        String key = in.next();
        PrintStream var10000;
        String var10001;
        Iterator var3;
        Student student;
        switch(selection) {
            case 1:
                var3 = this.studentList.iterator();

                while(var3.hasNext()) {
                    student = (Student)var3.next();
                    if (student.getRollNo().contains(key)) {
                        var10000 = System.out;
                        var10001 = student.getRollNo();
                        var10000.println("RollNo(" + var10001 + ") " + student.getFullName());
                    }
                }

                return;
            case 2:
                var3 = this.studentList.iterator();

                while(var3.hasNext()) {
                    student = (Student)var3.next();
                    if (student.getFullName().contains(key)) {
                        var10000 = System.out;
                        var10001 = student.getRollNo();
                        var10000.println("RollNo(" + var10001 + ") " + student.getFullName());
                    }
                }

                return;
            default:
                System.out.println("Nhập sai");
        }
    }

    static {
        in = new Scanner(System.in);
    }
}
