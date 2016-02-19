package org.leonelhernandez.SistemaDePaquetes.servlet.usuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.leonelhernandez.SistemaDePaquetes.db.Conexion;

/**
 * Servlet implementation class ServletListarRolUsuario
 */
@WebServlet("/ServletListarRolUsuario.do")
public class ServletListarRolUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListarRolUsuario() {
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
		request.getSession().setAttribute("listaRol", Conexion.getInstancia().listar("From Rol"));
		despachador=request.getRequestDispatcher("usuario/agregar.jsp");
		despachador.forward(request, response);
	}

}
