package unidad_2;

import javax.swing.JOptionPane;

public class Circulo {

	public void act_8() {
		
		float area = 0;
		int radio = 5;
		double PI = 3.1416;
		
		area = (float) PI * (radio * radio);
		System.out.println("El área del circulo es: " + area);
		JOptionPane.showMessageDialog(null, "El área del circulo es: " + area);
	}
}
