package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductApp {

	public static void main(String[] args) 
	{
		Connection con;
		Product p1=new Product();
		p1.setId(1);
		p1.setName("Watch");
		p1.setPrice(100);
		p1.setQty(10);
		
		Product p2=new Product ();
		
		
		try
		{
			String ss="jdbc:mysql://localhost:3306/bit";
			con=DriverManager.getConnection(ss,"root","Bhushan@25");
			PreparedStatement pst=con.prepareStatement("insert into product values(?,?,?,?)");
			pst.setInt(1, p1.getId());
			pst.setString(2, p1.getName());
			pst.setDouble(3, p1.getPrice());
			pst.setInt(4, p1.getQty());
			
			p1=null;
			int k=pst.executeUpdate();
			
			System.out.println(k+"row Affected");
			
			PreparedStatement pst1=con.prepareStatement("Select * from product");
			ResultSet rs=pst1.executeQuery();
			while(rs.next())
			{
				int i=rs.getInt(1);
				p2.setId(i);
				String s=rs.getString(2);
				p2.setName(s);
				double d=rs.getDouble(3);
				p2.setPrice(d);
				int a=rs.getInt(4);
				p2.setQty(a);
				String sp=p2.toString();
				System.out.println(sp);
			}
			
		}
		catch (Exception ee)
		{
			ee.printStackTrace();
		}
		

	}

}
