package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SqlProject 
{
	public static void main(String []args) 
	{
		try 
		{
			String url="jdbc:mysql://localhost:3306/GL";
			String username="root";
			String password="2002";

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection(url,username,password);
			System.out.println("connection established");

			String query="create table employee(id int primary key,name varchar(50),"
					+ "Email_id varchar(50),phone_number varchar(20))";
			 
			
			String query1="insert into employee(id,name,email_id,phone_number) values"
					+ "(1.,'Madhu','madhu1510@gmail.com','4657547523'),(2.,'Shalini','shalini1604@gmail.com','7664556372'),"
					+ "(3.,'Rupa','rupa2505@gmail.com','3845789345'),(4.,'Sathya','sathya1203@gmail.com','8948753485'),"
					+ "(5.,'Mahalakshmi','maha1312@gmail.com','8734581348')";
			
			
			String query2="alter table employee modify column email_id varchar(30) not null";

			
			
			String query3="insert into employee values(6.,'Varsha','varsha1406@gmail.com','8753384798'),"
					+ "(7.,'Achu','achu0412@gmail.com','8743489374')";
			
			
			String query4="update employee SET Name = 'Karthik', Phone_Number = '1234567890'"
					+ "WHERE Id = 3;";
		
			String query5="delete from employee where id in(3,4)";
			
			
			String query6="delete from employee";
			
			Statement st=connect.createStatement();

			st.execute(query);
			st.execute(query1);
			st.execute(query2);
			st.execute(query3);
			st.execute(query4);
			st.execute(query5);
			st.execute(query6);
			
			st.close();
			connect.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
