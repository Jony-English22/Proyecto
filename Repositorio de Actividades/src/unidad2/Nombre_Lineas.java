package unidad2;
import javax.swing.JOptionPane;

public class Nombre_Lineas {

	public void act_3() {
		
		String Name = JOptionPane.showInputDialog("Ingresa tu nombre: ");
		String Apellido = JOptionPane.showInputDialog("Ingresa tu apellido paterno: ");
	 	String Apellido2 = JOptionPane.showInputDialog("Ingresa tu apellido materno: ");
		
		System.out.println("En el sistema: " + Name + " " + Apellido + " " + Apellido2);
		JOptionPane.showMessageDialog(null, "JOptionPanel: \n" + Name + "\n" + Apellido + "\n" + Apellido2 );
		
	}
}
