import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectTest {
    public JdbcSelectTest() {
    }

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement stmt = connection.createStatement();
            String strSelect = "select title, price, qty from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");

            int rowCount;
            for(rowCount = 0; rset.next(); ++rowCount) {
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty);
            }

            System.out.println("Total number of records = " + rowCount);
        } catch (SQLException var13) {
            System.out.println("Truy vấn không thành công");
            System.out.println(var13.getErrorCode());
        }

    }
}
