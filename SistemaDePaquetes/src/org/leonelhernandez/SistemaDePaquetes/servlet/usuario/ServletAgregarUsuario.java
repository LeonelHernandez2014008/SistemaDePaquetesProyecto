package org.leonelhernandez.SistemaDePaquetes.servlet.usuario;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.leonelhernandez.SistemaDePaquetes.bean.Rol;
import org.leonelhernandez.SistemaDePaquetes.bean.Usuario;
import org.leonelhernandez.SistemaDePaquetes.db.Conexion;

@SuppressWarnings("serial")
@WebServlet("/ServletAgregarUsuario.do")
public class ServletAgregarUsuario extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		Rol rl = new Rol();
		List<Object> lisTiPa = Conexion.getInstancia().listar("From Rol l where l.nombre='"+req.getParameter("txtRol")+"'");
		rl = (Rol)lisTiPa.get(0);
		List<Object> lisPa = Conexion.getInstancia().listar("From Usuario");
		Integer conta = lisPa.size();
		Usuario usuario=new Usuario(conta,
				req.getParameter("txtNombre"),
				req.getParameter("txtContraseña"),
				req.getParameter("txtNick"),
				req.getParameter("txtCorreo"),
				req.getParameter("txtNoDeIdentificacion"),
				rl.getIdRol()
				);
		Conexion.getInstancia().agregarUsuario(usuario);
		despachador=req.getRequestDispatcher("ServletListarUsuario.do");
		req.getSession().setAttribute("listadoDeUsuarios", Conexion.getInstancia().listar("From Usuario"));
		despachador.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	
	}
}