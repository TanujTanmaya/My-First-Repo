import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidServ
 */
public class ValidServ extends HttpServlet {
private static final long serialVersionUID = 1L;

ServletConfig cfg;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidServ() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see Servlet#init(ServletConfig)
*/
public void init(ServletConfig config) throws ServletException {
cfg = config;
}

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String un = request.getParameter("user_id");
String pw = request.getParameter("password");
boolean flag = false;
Enumeration<String> initparams = cfg.getInitParameterNames();
while(initparams.hasMoreElements())
{
String name = initparams.nextElement();
String pass = cfg.getInitParameter(name);
if(un.equals(name) && pw.equals(pass))
{
flag = true;
}
}
if(flag)
{
response.getWriter().print("Valid user!");
}
else
{
response.getWriter().print("Invalid user!");
}
}
}