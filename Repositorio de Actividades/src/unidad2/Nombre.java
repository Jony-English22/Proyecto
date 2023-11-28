package unidad2;
import javax.swing.JOptionPane;

public class Nombre {
	
	public void act_2() {
		
		String Name = JOptionPane.showInputDialog("Ingresa tu nombre: ");
		
		System.out.println(Name);
		
		JOptionPane.showMessageDialog(null, "JOptionPanel: " + Name);
	}

}
