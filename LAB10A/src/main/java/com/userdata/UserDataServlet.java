package com.userdata;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("uname");
        String email = request.getParameter("email");
        String desig = request.getParameter("desig");

        // Server-side validation
        if (name == null || name.isEmpty() ||
            email == null || email.isEmpty() ||
            desig == null || desig.isEmpty()) {

            response.getWriter().println("<h3 style='color:red;'>All fields are required!</h3>");
            return;
        }

        if (!email.contains("@")) {
            response.getWriter().println("<h3 style='color:red;'>Invalid Email!</h3>");
            return;
        }

        // Forward data to JSP
        request.setAttribute("uname", name);
        request.setAttribute("email", email);
        request.setAttribute("desig", desig);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}