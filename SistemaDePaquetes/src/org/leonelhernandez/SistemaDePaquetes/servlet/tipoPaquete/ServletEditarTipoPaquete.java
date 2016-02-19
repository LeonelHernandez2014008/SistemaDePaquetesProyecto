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

@WebServlet("/ServletEditarTipoPaquete.do")
public class ServletEditarTipoPaquete extends HttpServlet	{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		TipoPaquete tipoPaquete=new TipoPaquete(Integer.parseInt(req.getParameter("txtIdTipoPaquete")),
				req.getParameter("txtTipoPaquete"),
				req.getParameter("txtCostoTipoPaquete"));
		Conexion.getInstancia().editar(tipoPaquete);
		despachador=req.getRequestDispatcher("ServletListarTipoPaquete.do");
		despachador.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
}
