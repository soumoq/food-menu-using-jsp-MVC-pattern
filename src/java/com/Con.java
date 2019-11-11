
package com;
import java.sql.*;
import java.util.*;

public class Con {
    public static void main(String []args)
    {
        Con con=new Con();
        
    }
    
    public List<Food> getFood()
    {
        ArrayList<Food> food=new ArrayList<>();
        try
        {
            Connection con=con();
            Statement st=con.createStatement();
            String sql="SELECT * FROM `food` WHERE 1";
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next())
            {
                int id=rs.getInt(1);
                String item=rs.getString(2);
                String price=rs.getString(3);
                Food f=new Food(id,item,price);
                food.add(f);
                
            }
            
        }catch(Exception e)
        {
            
        }
        return food;
    }
    
    
    private String pass="";
    private String uname="root";
    private String url="jdbc:mysql://localhost:3308/web3";
    public Connection connection;
    
    public Connection con()
    {
        try {
	            System.out.println("Start");
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("Lode");
	            connection = DriverManager.getConnection(url, uname, pass);
	            System.out.println("Connected");

	        }catch (Exception e)
	        {
	            System.out.println(e);
	        }
	        return connection;
    }
}
