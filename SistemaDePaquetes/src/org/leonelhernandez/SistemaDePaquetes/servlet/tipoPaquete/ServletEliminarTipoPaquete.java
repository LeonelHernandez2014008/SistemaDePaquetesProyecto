package org.leonelhernandez.SistemaDePaquetes.servlet.tipoPaquete;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.leonelhernandez.SistemaDePaquetes.bean.TipoPaquete;
import org.leonelhernandez.SistemaDePaquetes.db.Conexion;

@WebServlet("/ServletEliminarTipoPaquete.do")
public class ServletEliminarTipoPaquete extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		Integer id=Integer.parseInt(req.getParameter("idTipoPaquete"));
		Conexion.getInstancia().eliminar(Conexion.getInstancia().buscar(TipoPaquete.class, id));
		despachador=req.getRequestDispatcher("ServletListarTipoPaquete.do");
		despachador.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
