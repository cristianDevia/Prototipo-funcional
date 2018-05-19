package prototipo.mundo;

import java.io.File;

public class Test {

	public static void main(String[] args) {
	
		
		Proyecto proyecto = new Proyecto();
		Estudiante estu1 = new Estudiante("Cristian", "2220161013", 5, "Ing.Sistemas");
		
		
		try {
			
			proyecto.registrarPropuesta( new PropuestaGrado("", "", estu1 ));
			System.out.println(proyecto.darNombre());
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}

	}

}
