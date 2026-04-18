//6a. Build a servlet program to find the factorial of a number using HTML with step by step procedure.

package com.factorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            // Validation
            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative");
            }
            if (number > 20) {
                throw new IllegalArgumentException("Maximum allowed is 20");
            }

            long factorial = 1;
            String steps = "Calculation steps:<br>";

            if (number == 0 || number == 1) {
                factorial = 1;
                steps += number + "! = 1";
            } else {
                steps += number + "! = " + number;

                for (int i = number; i >= 1; i--) {
                    factorial *= i;
                    if (i != number) {
                        steps += " × " + i;
                    }
                }
                steps += " = " + factorial;
            }

            // Output
            out.println("<html><body>");
            out.println("<h2>Factorial Result</h2>");
            out.println("<p>Number: " + number + "</p>");
            out.println("<p>Factorial: " + factorial + "</p>");
            out.println("<p>" + steps + "</p>");
            out.println("<a href='index.html'>Try Again</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            showError(out, "Invalid number!");
        } catch (IllegalArgumentException e) {
            showError(out, e.getMessage());
        }
    }

    private void showError(PrintWriter out, String msg) {
        out.println("<html><body>");
        out.println("<h2 style='color:red;'>Error: " + msg + "</h2>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}