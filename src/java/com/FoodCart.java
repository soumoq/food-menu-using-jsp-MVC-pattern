
package com;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet("/Foodcate")

public class FoodCart extends HttpServlet{
    PrintWriter out;
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    {
        try
        {
            Con con=new Con();
            List<Food> foodItem=con.getFood();
            
            request.setAttribute("foodItem", foodItem);
            
            RequestDispatcher dispatcher=request.getRequestDispatcher("show-food.jsp");
            dispatcher.forward(request, response);
        }
        
        
        catch(Exception e)
        {
            try {
                out=response.getWriter();
            } catch (IOException ex) {
                Logger.getLogger(FoodCart.class.getName()).log(Level.SEVERE, null, ex);
            }
            out.println(e);
        }
    }
}
