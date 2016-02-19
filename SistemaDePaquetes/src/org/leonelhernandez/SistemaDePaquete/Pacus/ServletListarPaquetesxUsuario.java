package org.leonelhernandez.SistemaDePaquete.Pacus;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.leonelhernandez.SistemaDePaquetes.bean.Usuario;
import org.leonelhernandez.SistemaDePaquetes.db.Conexion;

/**
 * Servlet implementation class ServletListarPaquetesxUsuario
 */
@WebServlet("/ServletListarPaquetesxUsuario.do")
public class ServletListarPaquetesxUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListarPaquetesxUsuario() {
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
		Usuario rl = new Usuario();
		List<Object> lisTiPa = Conexion.getInstancia().listar("From Usuario u where u.nombre='"+request.getParameter("txtUsuarios")+"'");
		
		request.getSession().setAttribute("listaUsuario", Conexion.getInstancia().listar("From Usuario"));
		if(lisTiPa.size() != 0){
			rl = (Usuario)lisTiPa.get(0);
			request.getSession().setAttribute("listaPaquete", Conexion.getInstancia().listar("From Paquete p where p.idUsuario="+rl.getIdUsuario()));
		}else{
			request.getSession().setAttribute("listaPaquete", Conexion.getInstancia().listar("From Paquete"));
		}

		despachador=request.getRequestDispatcher("paqueteadmin/pacusuario.jsp");
		despachador.forward(request, response);
	}

}
