package org.leonelhernandez.SistemaDePaquetes.servlet.usuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.leonelhernandez.SistemaDePaquetes.db.Conexion;

@WebServlet("/ServletListarUsuario.do")
public class ServletListarUsuario extends HttpServlet	{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		req.setAttribute("listaUsuario", Conexion.getInstancia().listar("From Usuario"));
		despachador=req.getRequestDispatcher("usuario/index.jsp");
		despachador.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
