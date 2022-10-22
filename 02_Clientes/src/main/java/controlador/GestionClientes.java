package controlador;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.beans.Cliente;

/**
 * Servlet implementation class GestionClientes
 */
@WebServlet("/GestionClientes")
public class GestionClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionClientes() {
        super();//constructor vacio 
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Iniciando");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("procesando service");
		String opcion = request.getParameter("opcion");
		switch(opcion) {
		case "editar" :
			request.setAttribute("mensaje", "Nos han pedido editar");
			break;
			
		case "alta" :
			Cliente cliente = new Cliente ("11A", "Hola");
			request.setAttribute("cliente", cliente);
			request.setAttribute("mensaje", "Nos han pedido dar de alta");
			break;
			
		case "eliminar" :
			request.setAttribute("mensaje", "Nos han pedido eliminar");
			break;
			
		default:
			request.setAttribute("mensaje", "error en la opcion");
			break;
		}
		
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
	}

}
