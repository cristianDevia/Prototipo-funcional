package prototipo.mundo;

import java.io.File;

public class Test {

	public static void main(String[] args) {
	
		
		Proyecto proyecto = new Proyecto();
		
		try {
			
			proyecto.registrarPropuesta( new PropuestaGrado(""));
			System.out.println(proyecto.darNombre());
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}

	}

}
