import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LikeClause {

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
	            "SELECT * from tutorials_tbl WHERE author LIKE 'A%';");
	         
	         while(result.next()){
	            System.out.println(result.getInt("id")+" | "+result.getString("title")+" | "+result.getString("author")+" | "+result.getDate("submission_date"));
	         }
	      } catch (Exception e) {
	         e.printStackTrace(System.out);
	      }
	   }
}
