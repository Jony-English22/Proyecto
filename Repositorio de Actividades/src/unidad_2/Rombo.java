package unidad_2;

import javax.swing.JOptionPane;

public class Rombo {

	public void act_6() {
		
		float area = 0;
		int D = 9;
		int d = 4;
		
		area = D * d / 2;
		
		System.out.println("El área del rombo es: " + area);
		JOptionPane.showMessageDialog(null, "El área del rombo es: " + area);
		
	}
}
