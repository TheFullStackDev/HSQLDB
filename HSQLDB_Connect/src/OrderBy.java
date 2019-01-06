import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderBy {

	public static void main(String[] args) {
	      Connection con = null;
	      Statement stmt = null;
	      ResultSet result = null;
	      
	      try {
	         Class.forName("org.hsqldb.jdbc.JDBCDriver");
	         con = DriverManager.getConnection(
	            "jdbc:hsqldb:hsql://localhost/testdb", "SA", "");
	         stmt = con.createStatement();
	         result = stmt.executeQuery(
	            "SELECT id, title, author from tutorials_tbl ORDER BY author ASC");
	         
	         while(result.next()){
	            System.out.println(result.getInt("id")+" | "+result.getString("title")+" | "+result.getString("author"));
	         }
	      } catch (Exception e) {
	         e.printStackTrace(System.out);
	      }
	   }
}
