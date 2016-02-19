package org.leonelhernandez.SistemaDePaquetes.servlet.auth;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.leonelhernandez.SistemaDePaquetes.bean.Rol;
import org.leonelhernandez.SistemaDePaquetes.bean.Usuario;
import org.leonelhernandez.SistemaDePaquetes.db.Conexion;

public class AutenticarUsuario extends HttpServlet	{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		Usuario us = new Usuario();
		Rol rl = new Rol();
		List<Object> usuarios=Conexion.getInstancia().autenticar(req.getParameter("txtUsuario"),
				req.getParameter("txtPassword"));
		if( usuarios.size()>0){
			//Creo sesion
			us = (Usuario)usuarios.get(0);
			if(us.getIdRol() == 1){
				HttpSession sesion=req.getSession(true);
				sesion.setAttribute("usuario", (Usuario)usuarios.get(0));
				despachador=req.getRequestDispatcher("admin/dashboard.jsp");
			}else{
				HttpSession sesion=req.getSession(true);
				sesion.setAttribute("usuario", (Usuario)usuarios.get(0));
				despachador=req.getRequestDispatcher("cliente/dashboard.jsp");
			}
		}else{
			req.setAttribute("error", "verifica tus credenciales");
			despachador=req.getRequestDispatcher("index.jsp");
		}
		despachador.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
