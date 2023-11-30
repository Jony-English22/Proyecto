package unidad3;

import javax.swing.JOptionPane;

public class CPrimos {

	private int num;
	private int sum;
	
	public CPrimos (int num) {
		
		this.num = num;
		solicitar();
		imprimirDiv();
		
	}
	
	public void solicitar() {
		num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: ", num));
	}
	
	public void imprimirDiv () {
		calcular();
		if ( sum == 0)
			JOptionPane.showMessageDialog(null, toString());
		else 
			JOptionPane.showMessageDialog(null, toString2());
	}
	
	public void calcular() {
		for (int div = 2; div < num; div++) {
			if (num %div == 0)
				sum++;
		}
	}
	public String toString() {
		
		String texto = num + " es número es primo";
		return texto;
	}

	public String toString2() {
		
		String texto = num + " no es número primo";
		return texto;
	}

}
