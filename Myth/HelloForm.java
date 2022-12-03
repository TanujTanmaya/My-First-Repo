// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloForm extends HttpServlet {

   // Method to handle GET method request.
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Using GET Method to Read Form Data";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";
      
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b>First Name</b>: "
                  + request.getParameter("first_name") + "\n" +
                  "  <li><b>Last Name</b>: "
                  + request.getParameter("last_name") + "\n" +
                  "  <li><b>Roll No:</b> " 
                  + request.getParameter("roll_no") + "\n" +
                  "  <li><b>Gender:</b>: " 
                  + request.getParameter("sex") + "\n" +
                  "  <li><b>Semester:</b>" 
                  + request.getParameter("combo") + "\n" +
                "</ul>\n" +
            "</body>"+
         "</html>"
      );
      String hobby[] =  request.getParameterValues("hobbies");
      out.println("<h4>Hobbies:</h4> ");
      for(int i = 0; i < hobby.length; i++)
      {
    	  out.println(hobby[i]+"<br/>");
      }
      out.println("</li>");
      
      String language[] =  request.getParameterValues("lang");
      out.println("<h4>Programming Language:</h4>");
      for(int i = 0; i < language.length; i++)
      {
    	  out.println(language[i]+"<br/>");
      }
      out.println("</li>");
   }

   // Method to handle POST method request.
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      doGet(request, response);
   }
}