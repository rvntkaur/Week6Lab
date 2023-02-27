package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kaurr
 */
public class ShoppingListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String input = request.getParameter("action");
        if (input != null && input.equals("logout")) {
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            request.setAttribute("request", null);
        }
        if (session.getAttribute("username") != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/shopping.jsp").forward(request, response);
        } else {
            request.setAttribute("request", "");
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            HttpSession session = request.getSession();
            ArrayList<String> items = new ArrayList<String>();
            String name = request.getParameter("UserName");
    }



}
