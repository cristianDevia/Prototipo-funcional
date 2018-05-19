package prototipo.mundo;

import java.io.File;
import java.util.ArrayList;

public class Proyecto 
{

	private ArrayList arregloPropuesta;
	
	private String directorio;
	
	
	public Proyecto(String Pruta)
	{
		arregloPropuesta = new ArrayList();
		directorio = Pruta;
	}
	
	public void registrarPropuesta(PropuestaGrado propuesta, Estudiante estu) throws Exception
	{
		
		File f = new File(directorio);
		File[] elementos = f.listFiles();
		
		if(elementos != null)
		{
			for(int i = 0; i<elementos.length; i++)
			{
				
				if(elementos[i].isFile() && elementos[i].getName().equalsIgnoreCase(propuesta.getPropuesta().getName()))
				{
					arregloPropuesta.add(new PropuestaGrado(elementos[i].getPath(), estu));
					
				}
			}
		
		}
	
	}
	
	public ArrayList darNombre()
	{
		
		ArrayList<String> temp = new ArrayList<>();
		
		for (int i = 0; i < arregloPropuesta.size(); i++) 
		{
			PropuestaGrado aux = (PropuestaGrado) arregloPropuesta.get(i);
			String cast = aux.getPropuesta().getName();
			String cast1 = aux.getEstudiante().getCodigo();
			 
			String x = cast + cast1;
			
			if(cast != null && cast !="" && cast1 != null && cast1 != "")
			{
				temp.add(x);
			
			}
			
		}
		
		return temp;
	}

	/**
	 * @return the arregloPropuesta
	 */
	public ArrayList getArregloPropuesta() {
		return arregloPropuesta;
	}

	/**
	 * @return the directorio
	 */
	public String getDirectorio() {
		return directorio;
	}

	/**
	 * @param arregloPropuesta the arregloPropuesta to set
	 */
	public void setArregloPropuesta(ArrayList arregloPropuesta) {
		this.arregloPropuesta = arregloPropuesta;
	}

	/**
	 * @param directorio the directorio to set
	 */
	public void setDirectorio(String directorio) {
		this.directorio = directorio;
	}

}
