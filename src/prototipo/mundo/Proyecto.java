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
		directorio = "D:\\CDevia";
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
	
	public String darNombre()
	{
		String nombre = "";
		
		for (int i = 0; i < arregloPropuesta.size(); i++) 
		{
			PropuestaGrado aux = (PropuestaGrado) arregloPropuesta.get(i);
			String cast = aux.getPropuesta().getName();
			 
			 nombre = cast;
		}
		
		return nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Proyecto [darNombre()="+ darNombre() + "]";
	}
}
