package org.leonelhernandez.SistemaDePaquetes.paquetes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

import org.leonelhernandez.SistemaDePaquetes.bean.Paquete;
import org.leonelhernandez.SistemaDePaquetes.bean.Usuario;
import org.leonelhernandez.SistemaDePaquetes.bean.TipoPaquete;
import org.leonelhernandez.SistemaDePaquetes.db.Conexion;

/**
 * Servlet implementation class ServletAgregarPaquete
 */
@WebServlet("/ServletAgregarPaquete.do")
public class ServletAgregarPaquete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgregarPaquete() {
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
		Usuario us = new Usuario();
		TipoPaquete rl = new TipoPaquete();
		RequestDispatcher despachador=null;
		HttpSession sesion=request.getSession(true);
		us =(Usuario)sesion.getAttribute("usuario");
		List<Object> lisTiPa = Conexion.getInstancia().listar("From TipoPaquete tp where tp.tipoPaquete='"+request.getParameter("txtTiPa")+"'");
		List<Object> lisPa = Conexion.getInstancia().listar("From Paquete");
		Integer conta = lisPa.size();
		rl = (TipoPaquete)lisTiPa.get(0);
		Paquete pac=new Paquete(conta,
				request.getParameter("txtTipoPaquete"),
				1, 
				us.getIdUsuario(),
				request.getParameter("txtFeEn"),
				request.getParameter("txtFeEv"),
				request.getParameter("txtLuEn"),
				rl.getIdTipoPaquete());
		System.out.println(us.getIdUsuario());
		System.out.println(rl.getIdTipoPaquete());
		Conexion.getInstancia().agregar(pac);
		request.getSession().setAttribute("listaPaquetes", Conexion.getInstancia().listar("From Paquete"));
		despachador=request.getRequestDispatcher("paquete/listadoPaquetes.jsp");
		despachador.forward(request, response);
	}

}
