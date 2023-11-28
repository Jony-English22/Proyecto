package unidad_2;
import javax.swing.JOptionPane;

public class Suma {

	public void act_11() {
		
		int suma = 0;
		for(int i = 1; i <=100; i++) {
			suma += i;
		}
		
		JOptionPane.showMessageDialog(null, "La suma de 100 números es " + suma);
	}
}
