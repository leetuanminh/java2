package managementStudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private String url = "jdbc:mysql://localhost:3306/managementStudent";
    private String user = "root";
    private String password = "";
    List<Student> studentList = new ArrayList();

    public StudentList() {
    }

    public Connection getConnection() throws SQLException {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(this.url, this.user, this.password);
        } catch (SQLException var3) {
            var3.printStackTrace();
        }

        return connection;
    }

    public List<Student> arrayListStudent() throws SQLException {
        String strSelect = "select * from students";

        try {
            Connection connection = this.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(strSelect);

            while(rs.next()) {
                Student student = new Student(rs.getString("studentId"), rs.getString("name"), rs.getString("address"), rs.getString("phone"));
                if (!this.studentList.contains(student)) {
                    this.studentList.add(student);
                }
            }
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return this.studentList;
    }

    public void insert(Student student) throws SQLException {
        String strInsert = "insert into students values (?, ?, ? ,?)";

        try {
            Connection connection = this.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(strInsert);
            pstmt.setString(1, student.getStudentId());
            pstmt.setString(2, student.getName());
            pstmt.setString(3, student.getAddress());
            pstmt.setString(4, student.getPhone());
            pstmt.execute();
        } catch (SQLException var5) {
            var5.printStackTrace();
        }

    }

    public void display() throws SQLException {
        Connection connection = this.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rset = statement.executeQuery("select * from students");
        ResultSetMetaData rsetMD = rset.getMetaData();
        int numColumns = rsetMD.getColumnCount();

        int i;
        for(i = 1; i <= numColumns; ++i) {
            System.out.printf("%-30s", rsetMD.getColumnName(i));
        }

        System.out.println();

        while(rset.next()) {
            for(i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rset.getString(i));
            }

            System.out.println();
        }

    }

    public void display2() throws SQLException {
        this.arrayListStudent();
        int num = this.studentList.size();
        System.out.printf("%-25s", "StudentID");
        System.out.printf("%-25s", "Student Name");
        System.out.printf("%-25s", "Address");
        System.out.printf("%-25s", "Phone");
        System.out.println();

        for(int i = 0; i < num; ++i) {
            System.out.printf("%-25s", ((Student)this.studentList.get(i)).getStudentId());
            System.out.printf("%-25s", ((Student)this.studentList.get(i)).getName());
            System.out.printf("%-25s", ((Student)this.studentList.get(i)).getAddress());
            System.out.printf("%-25s", ((Student)this.studentList.get(i)).getPhone());
            System.out.println();
        }

    }

    public void delete(Student student) {
        String strDelete = "delete from students where studentId = " + student.getStudentId();

        try {
            Connection connection = this.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(strDelete);
            pstmt.executeUpdate();
            if (this.studentList.contains(student)) {
                this.studentList.remove(student);
                System.out.println("Xoa thanh cong!!!");
            }
        } catch (SQLException var5) {
            var5.printStackTrace();
        }

    }
}
