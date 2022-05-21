import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcInsertTest {
    public JdbcInsertTest() {
    }

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối thành công");
            Statement stmt = conn.createStatement();
            String sqlDelete = "delete from books where id >=8000";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");
            String sqlInsert = "insert into books values (3001, 'Gone Fishing', 'Kumar', 11.11, 11)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
            sqlInsert = "insert into books values (8001, 'Java Core', 'Dang Kim Thi', 15.55, 55),(8002, 'Java Advanced', 'James Gosling', 25.55, 55)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
            sqlInsert = "insert into books (id, title, author) values (2001, 'Java JDBC MySQL', 'ThiDK')";
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
            Scanner in = new Scanner(System.in);
            System.out.println("Nhap ID");
            Integer id = in.nextInt();
            in.nextLine();
            System.out.println("Nhập tiêu đề");
            String title = in.nextLine();
            System.out.println("Nhập Tác giả");
            String author = in.nextLine();
            sqlInsert = "insert  into books(id,title,author) values ('" + id + "','" + title + "','" + author + "')";
            stmt.executeUpdate(sqlInsert);
            sqlDelete = "delete from books where id=2001";
            stmt.executeUpdate(sqlDelete);
            String strSelect = "select * from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            while(rset.next()) {
                PrintStream var10000 = System.out;
                int var10001 = rset.getInt("id");
                var10000.println(var10001 + ", " + rset.getString("author") + ", " + rset.getString("title") + ", " + rset.getDouble("price") + ", " + rset.getInt("qty"));
            }

            conn.close();
        } catch (SQLException var16) {
            var16.printStackTrace();
        }

    }
}

