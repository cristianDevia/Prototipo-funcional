package prototipo.mundo;

import java.io.File;

public class PropuestaGrado 
{

	public final static String MODALIDAD1 = "Monografia";
	
	public final static String MODALIDAD2 = "Asistencia de investigacion";
	
	public final static String MODALIDAD3 = "Trabajo de investigacion";
	
	public final static String MODALIDAD4 = "Opcion de empredimiento";
	
	private String nombrePropuesta;
	
	private File propuesta;
	
	public PropuestaGrado(String pNombrePropuesta, File pPropuesta)
	{
		nombrePropuesta = pNombrePropuesta;
		propuesta = pPropuesta;
	}

	/**
	 * @return the nombrePropuesta
	 */
	public String getNombrePropuesta() {
		return nombrePropuesta;
	}

	/**
	 * @return the propuesta
	 */
	public File getPropuesta() {
		return propuesta;
	}

	/**
	 * @param nombrePropuesta the nombrePropuesta to set
	 */
	public void setNombrePropuesta(String nombrePropuesta) {
		this.nombrePropuesta = nombrePropuesta;
	}

	/**
	 * @param propuesta the propuesta to set
	 */
	public void setPropuesta(File propuesta) {
		this.propuesta = propuesta;
	}
	
}
