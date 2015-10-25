package nova;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloAjax1
 */
@WebServlet("/HelloAjax1")
public class HelloAjax1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloAjax1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 我的Hello Ajax HTML
		PrintStream out = new PrintStream(response.getOutputStream());
		out.println("<h1>This is Hello HTML by Ajax loaded on page ready!</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 我的Hello Ajax HTML Response a Form Post
		String user = request.getParameter("user");
		PrintStream out = new PrintStream(response.getOutputStream());
		out.printf("<h1>Hello %s. This is Hello HTML by Ajax loaded on post!</h1>", user);
	}

}
