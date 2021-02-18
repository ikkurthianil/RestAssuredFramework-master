package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SQL 
{
	
	public static int randomMatchedId(List<Integer> listIds)
	{
		int randomnumber=0;
		for(int i=0;i<100;i++) {
			 Random random = new Random(); 
			 randomnumber = random.nextInt(1000);
		 if(listIds.contains(randomnumber))
		 {
			 System.out.println("number matched : "+randomnumber);
			 break;
		 }
		 }
		return randomnumber;
	}
	
	
	
	public static int statement(String query) throws SQLException {
		String[] array;
		List<Integer> list = null;
		Connection con = null;
		int randomNum=0;
		try {
			list = new ArrayList();
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://65.0.23.226:3306/accountandinventory", "accountusr",
					"S#5tLbS8iQs*F");
			
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			List<Integer> listIds=new ArrayList();
			while(rs.next())
			{
				//System.out.println(rs.getInt(1));
				listIds.add(rs.getInt(1));
			}	
				//System.out.println("listIds : "+listIds);
				//list.add(rs.getInt(1));
				
				randomNum=randomMatchedId(listIds);
				//LoopValues(list,id);
			}
			//System.out.println(list);

		catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
		}
		return randomNum;
		

	}

	/*public static String LoopValues(List<Integer> list,int id) {
		for (int i = 0; i < list.size(); i++) 
		{
			if(list.get(i) == id) 
			{
				System.out.println(i);
			}
		}
		return null;*/
	//}
	/*
	 * public static List<String> SQLSelect(String SQLStmt) throws Exception {
	 * 
	 * 
	 * String environment = System.getProperty("env");
	 * 
	 * Statement stmt = null; Connection con;
	 * 
	 * if (environment.equalsIgnoreCase("Dev")) { con = DriverManager.getConnection(
	 * "jdbc:mysql://accountandinventory:3306/accountusr", "S#5tLbS8iQs*F",
	 * "t9OCbND$i5@CFe3"); } else { con =
	 * DriverManager.getConnection("jdbc:mysql://74.208.129.194:3306/sourcelead",
	 * "slqadbadmin", "t9OCbND$i5@CFe3"); }
	 * 
	 * List<String> rowValues = new ArrayList<String>(); try { stmt =
	 * con.createStatement();
	 * 
	 * ResultSet rs = stmt.executeQuery(SQLStmt);
	 * 
	 * while (rs.next()) { rowValues.add(rs.getString(1)); }
	 * 
	 * return rowValues; } catch (SQLException ex) { throw (ex); } finally { if
	 * (stmt != null) { stmt.close(); } }
	 */

}
