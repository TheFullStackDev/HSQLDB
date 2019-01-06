import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) { 
	      Connection con = null; 
	      Statement stmt = null; 
	      int result = 0; 
	      try { 
	         Class.forName("org.hsqldb.jdbc.JDBCDriver"); 
	         con = DriverManager.getConnection( "jdbc:hsqldb:hsql://"
	         		+ "localhost/testdb", "SA", ""); 
	         stmt = con.createStatement(); 
	         result = stmt.executeUpdate("INSERT INTO tutorials_tbl "
	         		+ "VALUES (105,'Learn Oracle', 'Lalit Tawade', NOW())"); 
	         con.commit(); 
	      }catch (Exception e) { 
	         e.printStackTrace(System.out); 
	      } 
	      System.out.println(result+" rows effected"); 
	      System.out.println("Rows inserted successfully"); 
	      
	   } 

}
