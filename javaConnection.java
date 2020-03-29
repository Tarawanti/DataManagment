package net.codejava;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 

public class userManagment {

	 
		// TODO Auto-generated method stub
		public static void main(String args[]) {
			String jdbcURL = "jdbc:mysql://localhost:3306/sampledb";
			String username = "root";
			String password = "Password";
			String Username= "Tara";
//			String email= "tarakhatri@gmail.com";
//			String fullname="kk";
//			String pass="123";
			try {
				
				//INSERT
				Connection connection = DriverManager.getConnection(jdbcURL, username, password);
				/*String sql = "INSERT INTO users(username, email, fullname ,password)"
						+"VALUES (?, ?, ?, ?)";
				PreparedStatement statement=connection.prepareStatement(sql);
				statement.setString(1, Username);
				statement.setString(2, email);
				statement.setString(3, fullname);
				statement.setString(4, pass);
				int rows=statement.executeUpdate();
				if(rows>0)
				{
					System.out.println("New Records has been updated ");
				}	
			*/
				//SELECT
			/*Statement statement = connection.createStatement();
			String sql = "Select * from users";
			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				int userID = result.getInt("user_id");
				String usernames = result.getString("username");
				String email=result.getString("email");
				String fullname = result.getString("fullname");
				String pass= result.getString("password");
				
				

				System.out.println(usernames +", " +email+" "+fullname+" " +pass);
	
			}*/	
				
				//UPDATE
				
			/*	String sql="UPDATE users SET password= 'olala' where username= 'tara'";
				Statement statement = connection.createStatement();
				 
				int rows= statement.executeUpdate(sql);
				if(rows> 0)
				{
					System.out.println("Record has been updated");
				}*/
				
				
				String sql= "DELETE from users WHERE username= ?";
				PreparedStatement statement=connection.prepareStatement(sql);
				statement.setString(1, Username);
				int rows= statement.executeUpdate();
				if(rows > 0)
				{
					System.out.println("Record has been Deleted");
				}
				
				
				connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();

			}
		}

	}
