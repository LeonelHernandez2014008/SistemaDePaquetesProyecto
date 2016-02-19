package org.leonelhernandez.SistemaDePaquetes.prueba;

import org.leonelhernandez.SistemaDePaquetes.bean.Usuario;
import org.leonelhernandez.SistemaDePaquetes.db.Conexion;

public class Prueba {
	public static void main(String args[]){
		for(Object obj:Conexion.getInstancia().listar("From Usuario")){
			Usuario usr=(Usuario)obj;
			System.out.println(usr.getNombre());
		}
	}
	
}
