
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class data2 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
              Class.forName("com.mysql.cj.jdbc.Driver");

             String url1 = "jdbc:mysql://localhost:3306/grasstech";

		  String username1 = "root";

		  String password1 = "";

		  try (Connection con = DriverManager.getConnection(url1,username1,password1);
	         PreparedStatement ps = con.prepareStatement("INSERT INTO registration (username , email , password) values(?,?,?)"))
                  {


			  String username = request.getParameter("username");
                           String email = request.getParameter("email");

			  String password = request.getParameter("password");

			  

			  ps.setString(1, username);
                          ps.setString(2, email);

			  ps.setString(3, password);

			  

			  int rowsAffected = ps.executeUpdate();

			  System.out.println(" Rows Affected:" +rowsAffected );
                           response.sendRedirect("suniul1.html");

		  }

	  }      catch(ClassNotFoundException | SQLException e) {
               e.printStackTrace();
	 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
