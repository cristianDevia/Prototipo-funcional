package prototipo.mundo;

import java.io.File;
import java.util.ArrayList;

public class Proyecto 
{

	private ArrayList<File> arregloPropuesta;
	
	public Proyecto()
	{
		arregloPropuesta = new ArrayList<File>();
	}
	
	public void registrarPropuesta(PropuestaGrado propuesta) throws Exception
	{
		File f = new File("C:\\Users\\Cristian Devia\\Desktop\\Matricula.pdf");
		String nombre = f.getName();
		
		for(int i = 0; i<arregloPropuesta.size(); i++)
		{
			if(nombre.equals(propuesta.getNombrePropuesta()))
			{
				throw new Exception();
			}
		}
		
		arregloPropuesta.add(f);
	}
	
	public String consultarNombre()
	{
		
		String nombre = "";
		
		for (int i = 0; i < arregloPropuesta.size(); i++)
		{
			File aux = arregloPropuesta.get(i);
			
			String x = aux.getName();
			
			nombre = x;
			
			return x;
		}
	
		return nombre;
	}
}
