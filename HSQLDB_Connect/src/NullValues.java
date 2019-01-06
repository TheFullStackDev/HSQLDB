import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NullValues {
	public static void main(String[] args) {
	      Connection con = null;
	      Statement stmt_is_null = null;
	      Statement stmt_is_not_null = null;
	      ResultSet result = null;
	      try {
	         Class.forName("org.hsqldb.jdbc.JDBCDriver");
	         con = DriverManager.getConnection(
	            "jdbc:hsqldb:hsql://localhost/testdb", "SA", "");
	         stmt_is_null = con.createStatement();
	         stmt_is_not_null = con.createStatement();
	         result = stmt_is_null.executeQuery(
	            "SELECT * FROM tcount_tbl WHERE tutorial_count IS NULL;");
	         System.out.println("Records where the tutorial_count is NULL");
	         
	         while(result.next()){
	            System.out.println(result.getString("author")+" | "+result.getInt("tutorial_count"));
	         }
	         result = stmt_is_not_null.executeQuery(
	            "SELECT * FROM tcount_tbl WHERE tutorial_count IS NOT NULL;");
	         System.out.println("Records where the tutorial_count is NOT NULL");
	         
	         while(result.next()){
	            System.out.println(result.getString("author")+" | "+result.getInt("tutorial_count"));
	         }
	      } catch (Exception e) {
	         e.printStackTrace(System.out);
	      }
	   }
}
