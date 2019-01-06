import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {

	public static void main(String args[]) {

		Connection con = null;

		try {

			// Registering HSQL JDBC Driver
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			// creating the connection with HSQLDB
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb", "SA", "");

			if (con != null) {
				System.out.println("Connection created successfully");

			} else {
				System.out.println("Problem with creating connection");
			}

		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}
