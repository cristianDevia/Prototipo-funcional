package prototipo.mundo;

import java.io.File;
import java.util.ArrayList;

public class Proyecto 
{

	private ArrayList arregloPropuesta;
	
	private String directorio;
	
	
	public Proyecto()
	{
		arregloPropuesta = new ArrayList();
		directorio = "C:\\Users\\Cristian Devia\\Desktop\\Unibague.lnk";
	}
	
	public void registrarPropuesta(PropuestaGrado propuesta) throws Exception
	{
		
		File f = new File(directorio);
		File[] elementos = f.listFiles();
		
		if(elementos != null)
		{
			for(int i = 0; i<elementos.length; i++)
			{
				
				if(elementos[i].isFile())
				{
					arregloPropuesta.add(new PropuestaGrado(elementos[i].getAbsolutePath()));
					
				}
			}
		
		}
	
	}
}
