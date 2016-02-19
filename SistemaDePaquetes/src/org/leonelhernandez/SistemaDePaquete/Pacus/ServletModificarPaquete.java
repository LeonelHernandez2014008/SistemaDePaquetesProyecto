package org.leonelhernandez.SistemaDePaquete.Pacus;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.leonelhernandez.SistemaDePaquetes.db.Conexion;
import org.leonelhernandez.SistemaDePaquetes.bean.Paquete;
import org.leonelhernandez.SistemaDePaquetes.bean.Usuario;
import org.leonelhernandez.SistemaDePaquetes.bean.Envio;

/**
 * Servlet implementation class ServletModificarPaquete
 */
@WebServlet("/ServletModificarPaquete.do")
public class ServletModificarPaquete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletModificarPaquete() {
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
		Usuario us = new Usuario();
		Envio env = new Envio();
		HttpSession sesion=request.getSession(true);
		us =(Usuario)sesion.getAttribute("usuario");
		List<Object> lisTiPa = Conexion.getInstancia().listar("From Envio u where u.idEnvio="+request.getParameter("txtEnvio"));
		env = (Envio)lisTiPa.get(0);
		Paquete pac=new Paquete(Integer.parseInt(request.getParameter("txtIdPaquete")),
				request.getParameter("txtPaquete"),
				env.getIdEnvio(), 
				us.getIdUsuario(),
				request.getParameter("txtFecha"),
				request.getParameter("txtFeEv"),
				request.getParameter("txtLuEn"),
				Integer.parseInt(request.getParameter("txtTiPa")));
		Conexion.getInstancia().editar(pac);
		Usuario rl = new Usuario();
		List<Object> lisTiPas = Conexion.getInstancia().listar("From Usuario u where u.nombre='"+request.getParameter("txtUsuarios")+"'");
		
		request.getSession().setAttribute("listaUsuario", Conexion.getInstancia().listar("From Usuario"));
		if(lisTiPas.size() != 0){
			rl = (Usuario)lisTiPas.get(0);
			request.getSession().setAttribute("listaPaquete", Conexion.getInstancia().listar("From Paquete p where p.idUsuario="+rl.getIdUsuario()));
		}else{
			request.getSession().setAttribute("listaPaquete", Conexion.getInstancia().listar("From Paquete"));
		}

		despachador=request.getRequestDispatcher("paqueteadmin/pacusuario.jsp");
		despachador.forward(request, response);
	}

}
