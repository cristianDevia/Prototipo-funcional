package mundo.interfaz;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
				
				proyecto.registrarPropuesta(new PropuestaGrado(ultimoDirectorio));
				System.out.println(proyecto.darNombre());
				
			} catch (Exception e) 
				{
				 JOptionPane.showMessageDialog( this, e.getMessage( ), "Error", JOptionPane.ERROR_MESSAGE );
				}
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PP interfaz = new PP( );
        interfaz.setVisible( true );
	}

}
