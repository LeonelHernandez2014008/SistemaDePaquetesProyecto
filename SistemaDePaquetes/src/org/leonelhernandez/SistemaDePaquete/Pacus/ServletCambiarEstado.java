package org.leonelhernandez.SistemaDePaquete.Pacus;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.leonelhernandez.SistemaDePaquetes.db.Conexion;
import org.leonelhernandez.SistemaDePaquetes.bean.Paquete;
import org.leonelhernandez.SistemaDePaquetes.bean.Envio;

/**
 * Servlet implementation class ServletCambiarEstado
 */
@WebServlet("/ServletCambiarEstado.do")
public class ServletCambiarEstado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCambiarEstado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		Paquete pacq = new Paquete();
		Envio env = new Envio();
		List<Object> lisTiPa = Conexion.getInstancia().listar("From Paquete u where u.idPaquete="+request.getParameter("idPaquete"));
		pacq = (Paquete)lisTiPa.get(0);
		request.getSession().setAttribute("pac", pacq);
		List<Object> lisEnv = Conexion.getInstancia().listar("From Envio u where u.idEnvio="+pacq.getIdEnvio());
		env = (Envio)lisEnv.get(0);
		request.getSession().setAttribute("env", env);
		request.getSession().setAttribute("estados", Conexion.getInstancia().listar("From Envio"));
		despachador=request.getRequestDispatcher("paqueteadmin/MostrarPaquete.jsp");
		despachador.forward(request, response);
	}

}
