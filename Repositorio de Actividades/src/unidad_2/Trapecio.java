package unidad_2;

import javax.swing.JOptionPane;

public class Trapecio {

	public void act_7() {
		
		float area = 0;
		int h = 6;
		int B = 9;
		int b = 4;
		
		area = (float) h * (B + b) / 2;
		
		System.out.println("El área del trapecio es: " + area);
		JOptionPane.showMessageDialog(null, "El área del trapecio es: " + area);
	}
}
