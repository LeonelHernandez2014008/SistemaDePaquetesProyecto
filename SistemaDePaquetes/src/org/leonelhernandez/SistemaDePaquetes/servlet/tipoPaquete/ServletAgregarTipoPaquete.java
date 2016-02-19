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

@WebServlet("/ServletAgregarTipoPaquete.do")
public class ServletAgregarTipoPaquete extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		TipoPaquete tipoPaquete=new TipoPaquete(0,
				req.getParameter("txtTipoPaquete"),
				req.getParameter("txtCostoTipoPaquete"));
		Conexion.getInstancia().agregar(tipoPaquete);
		despachador=req.getRequestDispatcher("ServletListarTipoPaquete.do");
		req.getSession().setAttribute("listadoDeTiposDePaquetes", Conexion.getInstancia().listar("From TipoPaquete"));
		despachador.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	
	}
}