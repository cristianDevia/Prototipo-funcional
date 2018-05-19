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
		directorio = "D:\\Unibague";
	}
	
	public void directorio() throws Exception
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
	
	public ArrayList darNombreArchivosDirectorio()
	{
		
		ArrayList<String> temp = new ArrayList<>();
		
		for (int i = 0; i < arregloPropuesta.size(); i++) 
		{
			PropuestaGrado aux = (PropuestaGrado) arregloPropuesta.get(i);
			String cast = aux.getPropuesta().getName();
			 
			temp.add(cast);
			
		}
		
		return temp;
	}
	
	public String consultarPropuesta(String pCodigo)
	{
		String consulta = "";
		
		for (int i = 0; i < arregloPropuesta.size(); i++) 
		{
			PropuestaGrado aux = (PropuestaGrado) arregloPropuesta.get(i);
			String cast = aux.getPropuesta().getName();
			
			if(cast.equalsIgnoreCase(pCodigo))
			{
				consulta = cast;
			}
		}
		
		return consulta;
	}
	

}
