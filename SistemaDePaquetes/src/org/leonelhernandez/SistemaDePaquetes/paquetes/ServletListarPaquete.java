package org.leonelhernandez.SistemaDePaquetes.paquetes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.leonelhernandez.SistemaDePaquetes.db.Conexion;

@WebServlet("/ServletListarPaquete.do")
public class ServletListarPaquete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletListarPaquete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		request.setAttribute("listaPaquetes", Conexion.getInstancia().listar("From Paquete"));
		despachador=request.getRequestDispatcher("paquete/listadoPaquetes.jsp");
		despachador.forward(request, response);
	}

}
