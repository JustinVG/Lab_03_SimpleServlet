package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 709488
 */
public class ageCalculator extends HttpServlet {
    

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ageNumber = request.getParameter("inputAge"); 
        String error = "You Must Give Your Current Age";
        String errorSecond = "You Must Enter Your Age As A Number";
        
        if (ageNumber.length() == 0) {
            
        request.setAttribute("input_Age",error);
        }
        
        else if(ageNumber.matches("[a-zA-Z]+") == true ){
            request.setAttribute("input_Age",errorSecond);
        }
        
        else if (ageNumber != ""){
        int initNumber = Integer.parseInt(ageNumber);
        
        int finalNumber = initNumber + 1;
        
        request.setAttribute("input_Age",finalNumber);
        
        
        }  
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        
       
       
    }

   
   

}
