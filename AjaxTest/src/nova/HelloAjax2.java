package nova;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nova.domain.Person;

import org.json.JSONArray;

/**
 * Servlet implementation class HelloAjax2
 */
@WebServlet("/HelloAjax2")
public class HelloAjax2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Person> personList1, personList2;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloAjax2() {
        super();
        // TODO Auto-generated constructor stub
        personList1 = new ArrayList<Person>();
        personList1.add(new Person("张飞", 35));
        personList1.add(new Person("关羽", 40));
        personList2 = new ArrayList<Person>();
        personList2.add(new Person("张辽", 38));
        personList2.add(new Person("徐晃", 41));
        personList2.add(new Person("曹洪", 45));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 我的Hello Ajax JSON
		PrintStream out = new PrintStream(response.getOutputStream());
		String click = request.getParameter("click");
		out.printf("{\"input\":\"%s\", \"output\":\"Hello JSON\"}", click);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 我的Data Ajax JSON
		PrintStream out = new PrintStream(response.getOutputStream());
		int id = Integer.parseInt(request.getParameter("id"));
		switch(id) {
		case 1:
			out.println(new JSONArray(personList1));
			break;
		case 2:
			out.println(new JSONArray(personList2).toString());
			break;
		default:
			//out.println(null);
		}
	}
}
