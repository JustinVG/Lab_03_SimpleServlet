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
public class arithmeticCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstNumber = request.getParameter("first");
        String secondNumber = request.getParameter("second");
        String operator = request.getParameter("operation");
        String error = "Invalid";
        
        if (firstNumber.length() == 0 || secondNumber.length() == 0){
            request.setAttribute("mathDone",error);
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            
        }
        
        int oneNumber = Integer.parseInt(firstNumber);
        int twoNumber = Integer.parseInt(secondNumber);
        int finalNumber = 0;
        
        
        

        if ("+".equals(operator)) {
            finalNumber = oneNumber + twoNumber;
        } else if ("-".equals(operator)) {
            finalNumber = oneNumber - twoNumber;
        } else if ("*".equals(operator)) {
            finalNumber = oneNumber * twoNumber;
        } else if ("%".equals(operator)) {
            finalNumber = oneNumber % twoNumber;
        }
        request.setAttribute("mathDone",finalNumber);
        request.setAttribute("first", firstNumber);
        request.setAttribute("second", secondNumber);
        
 getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

}


