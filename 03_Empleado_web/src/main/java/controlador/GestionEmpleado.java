package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.EmpleadoDao;
import modelo.dao.EmpleadoDaoImplList;
import modelo.javabeans.Empleado;

/**
 * Servlet implementation class GestionEmpleado
 */
@WebServlet("/empleados")
public class GestionEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmpleadoDao edao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionEmpleado() {
        super();
        edao = new EmpleadoDaoImplList();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcion = request.getParameter("opcion");
		switch(opcion) {
		case "eliminar":
			procEliminarEmpleado(request, response);
			break;
			
		case "editar":
			procEditarEmpleado(request, response);
			break;
			
		case "alta":
			procAltaEmpleado(request, response);
			break;
			
		default: 
			System.out.println("opcion erronea" +opcion);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void procEliminarEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Empleado emp1 = edao.buscarUno(Integer.parseInt(request.getParameter("id")));
		String mensaje = null;
		 if(edao.eliminarEmpleado(emp1))
			 mensaje = "Empleado eliminado";
		 else 
			 mensaje = "empleado no se ha podido eliminar"; 
		 request.setAttribute("mensaje", mensaje);
		 request.getSession().setAttribute("listaEmpleados", ((EmpleadoDaoImplList)edao).getLista());
		 request.getRequestDispatcher("inicio").forward(request, response);
		
	}
	protected void procEditarEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void procAltaEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mensaje = null;
		Empleado empleado = new Empleado();
		empleado.setIdEmpleado(Integer.parseInt(request.getParameter("idEmpleado")));
		empleado.setNombre(request.getParameter("nombre"));
		empleado.setSalario(Double.parseDouble(request.getParameter("salario")));
		if(edao.altaEmpleado(empleado) ==1)
			mensaje = "Alta realizada";
		else 
			mensaje = "Alta no realizada";
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("inicio").forward(request, response);
	}

}
