package prototipo.mundo;

import java.io.File;

public class Test {

	public static void main(String[] args) {
	
		
		Proyecto proyecto = new Proyecto();
		
		try {
			
			proyecto.directorio();
			System.out.println(proyecto.darNombreArchivosDirectorio());
			
			System.out.println(proyecto.consultarPropuesta("Credito Universidad.jpg"));
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}

	}

}