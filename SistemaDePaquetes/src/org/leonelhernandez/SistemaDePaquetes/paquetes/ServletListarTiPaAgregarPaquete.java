package org.leonelhernandez.SistemaDePaquetes.paquetes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.leonelhernandez.SistemaDePaquetes.db.Conexion;

@WebServlet("/ServletListarTiPaAgregarPaquete.do")
public class ServletListarTiPaAgregarPaquete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletListarTiPaAgregarPaquete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		request.setAttribute("listaTipoPaquete", Conexion.getInstancia().listar("From TipoPaquete"));
		despachador=request.getRequestDispatcher("paquete/agregar.jsp");
		despachador.forward(request, response);
	}

}
