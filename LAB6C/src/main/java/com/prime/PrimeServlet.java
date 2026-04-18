//6c. Build a servlet program to check the given number is prime number or not using HTML with step by
//step procedure.

package com.prime;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int num = Integer.parseInt(request.getParameter("number"));

            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><body>");
            out.println("<h2>Prime Number Result</h2>");
            out.println("<p>Number: " + num + "</p>");

            if (isPrime) {
                out.println("<h3 style='color:green;'>It is a Prime Number</h3>");
            } else {
                out.println("<h3 style='color:red;'>It is NOT a Prime Number</h3>");
            }

            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<h3 style='color:red;'>Invalid Input!</h3>");
        }
    }
}