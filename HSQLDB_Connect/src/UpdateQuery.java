import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateQuery {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		int result = 0;

		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb", "SA", "");
			stmt = con.createStatement();
			result = stmt.executeUpdate("UPDATE tutorials_tbl "
					+ "SET title = 'HSQL and Data Structures' WHERE id = 101");
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		System.out.println(result + " Rows effected");
	}
}
