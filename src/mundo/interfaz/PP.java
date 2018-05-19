package mundo.interfaz;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import prototipo.mundo.Estudiante;
import prototipo.mundo.PropuestaGrado;
import prototipo.mundo.Proyecto;

public class PP extends JFrame
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

	private Proyecto proyecto;
	
	private JFileChooser seleccionarArchivo;
	
	private String ultimoDirectorio;
	
	private PanelInterfaz panelPrincipal;
	
	public PP()
	{
		proyecto = new Proyecto();
		
        setLayout( new BorderLayout( ) );
        setTitle( "Consulta" );
        setSize( 400, 400 );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        panelPrincipal = new PanelInterfaz(this);
        add(panelPrincipal, BorderLayout.SOUTH);
        
        seleccionarArchivo = new JFileChooser();
	}
	
	
	public void registrarPropuesta()
	{
		 JFileChooser fc = new JFileChooser( ultimoDirectorio );
		 fc.setFileSelectionMode( JFileChooser.FILES_ONLY );
		 fc.setMultiSelectionEnabled( false );
		 
         int resultado = fc.showOpenDialog( this );

         if( resultado == JFileChooser.APPROVE_OPTION )
         {
             File seleccionado = fc.getSelectedFile( );
             ultimoDirectorio = seleccionado.getName();
    
			try 
			{
				String pNombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante", "");
				String pCodigo = JOptionPane.showInputDialog("Ingrese el codigo del estudiante", "");
				String pSemestre = JOptionPane.showInputDialog("Ingrese el semestre del estudiante (numero entero)", "");
				int castSemestre = Integer.parseInt(pSemestre);	
				String pPrograma = JOptionPane.showInputDialog("Ingrese el programa del estudiante", "");
				
		
				
				Estudiante estu = new Estudiante(pNombre, pCodigo, castSemestre, pPrograma);
				
				proyecto.registrarPropuesta(new PropuestaGrado(ultimoDirectorio, estu), estu);
					
				System.out.println(proyecto.darNombre());
				JOptionPane.showMessageDialog(null, "Se agregado correctamente");
				
			} catch (Exception e) 
				{
				 JOptionPane.showMessageDialog( this, e.getMessage( ), "Error", JOptionPane.ERROR_MESSAGE );
				}
		}
	
	}
	
	
	public void consultarPropuesta()
	{	
		
		for (int i = 0; i < proyecto.getArregloPropuesta().size(); i++)
		{
			
			String y = JOptionPane.showInputDialog("Ingrese el codigo del estudiante", "");
			
			PropuestaGrado aux = (PropuestaGrado) proyecto.getArregloPropuesta().get(i);
			String aux2 = aux.getEstudiante().getCodigo();

			if(y.equalsIgnoreCase(aux2))
			{
				String aux3 = aux.getPropuesta().getName();
				
				JOptionPane.showMessageDialog(null, aux3.toString());
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PP interfaz = new PP( );
        interfaz.setVisible( true );
	}

}
