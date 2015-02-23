//STEP 1. Import required packages
import java.sql.*;
import java.util.Timer;

public class JDBCExample2 {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://10.0.0.217/db_cdr";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		long start = System.currentTimeMillis();
		String base = "bms2_cdr_nnull";
//		String base = "bms2_cdr_null";
		
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			//STEP 4: Execute a query
			System.out.println("Inserting records into the table...");
			stmt = conn.createStatement();

			for (int i = 0; i < 1000; i++) {
				String sql = "INSERT INTO " + base + " (oa_addr,da_addr,esme_ib,esme_ob)" +
						"VALUES (100, 'Zara', 'Ali', 18)";
				stmt.executeUpdate(sql);
				sql = "INSERT INTO " + base + " (oa_addr,da_addr,esme_ib,esme_ob) " +
						"VALUES (101, 'Mahnaz', 'Fatma', 25)";
				stmt.executeUpdate(sql);
				sql = "INSERT INTO " + base + " (oa_addr,da_addr,esme_ib,esme_ob) " +
						"VALUES (102, 'Zaid', 'Khan', 30)";
				stmt.executeUpdate(sql);
				sql = "INSERT INTO " + base + " (oa_addr,da_addr,esme_ib,esme_ob) " +
						"VALUES(103, 'Sumit', 'Mittal', 28)";
				stmt.executeUpdate(sql);
				
				if (i%20==0)System.out.println(i);


			}       
			String sql = "INSERT INTO bms2_cdr (oa_addr,da_addr,esme_ib,esme_ob)" +
					"VALUES (100, 'Zara', 'Ali', 18)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO bms2_cdr (oa_addr,da_addr,esme_ib,esme_ob) " +
					"VALUES (101, 'Mahnaz', 'Fatma', 25)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO bms2_cdr (oa_addr,da_addr,esme_ib,esme_ob) " +
					"VALUES (102, 'Zaid', 'Khan', 30)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO bms2_cdr (oa_addr,da_addr,esme_ib,esme_ob) " +
					"VALUES(103, 'Sumit', 'Mittal', 28)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");

		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					conn.close();
			}catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
		long finish = System.currentTimeMillis();

		System.out.println("Goodbye!" + base + "\n"+ (finish - start));
	}//end main
}//end JDBCExample