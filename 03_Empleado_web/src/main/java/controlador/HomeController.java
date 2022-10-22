package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.EmpleadoDao;
import modelo.dao.EmpleadoDaoImplList;
import modelo.javabeans.Empleado;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpleadoDao edao= new EmpleadoDaoImplList();
		List<Empleado> lista = null;
		List<Empleado> listaEmpleados = (List<Empleado>)request.getSession().getAttribute("listaEmpleados");
		if(listaEmpleados == null)
			lista = edao.buscarTodos();
		else {
			((EmpleadoDaoImplList)edao).setLista(listaEmpleados);
			lista=((EmpleadoDaoImplList)edao).getLista();
		}
		request.setAttribute("empleados", lista);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
