package prototipo.mundo;

import java.io.File;

public class Test {

	public static void main(String[] args) {
	
		
		Proyecto proyecto = new Proyecto();
		
		try {
			File f = new File("");
			proyecto.registrarPropuesta( new PropuestaGrado("P1", f));
			proyecto.registrarPropuesta( new PropuestaGrado("P1", f));
			
			System.out.println(proyecto.consultarNombre());
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}

	}

}
