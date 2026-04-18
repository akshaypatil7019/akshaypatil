//6b. Build a servlet program to create a cookie to get your name through text box and press submit button(
//through HTML) to display the message by greeting Welcome back your name ! , you have visited this page
//n times ( n = number of your visit ) and demonstrate the expiry of cookie also.

package com.cookie;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        int count = 0;

        Cookie[] cookies = request.getCookies();

        // Read existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue());
                }

                if (c.getName().equals("username")) {
                    name = c.getValue();
                }
            }
        }

        count++;

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(count));

        // Set expiry (30 seconds for demo)
        nameCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Display output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + count + " times.</h3>");

        out.println("<h3>Cookie Details:</h3>");
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("Name: " + c.getName() +
                            " | Value: " + c.getValue() + "<br>");
            }
        }

        out.println("<br><b>Note:</b> Cookies expire in 30 seconds.");
        out.println("</body></html>");
    }
}