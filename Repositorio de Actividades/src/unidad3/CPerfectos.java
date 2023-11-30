package unidad3;

import javax.swing.JOptionPane;

public class CPerfectos {

	private int num;
	private int sum;
	
	public CPerfectos (int num) {
		this.num = num;
		solicitar();
		imprimir ();	
	}
	
	public void solicitar() {
		num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: ", num));
	}
	
	public void calcular() {
		for (int div = 1; div < num; div++) {
			if (num % div== 0)
				sum+=div;
		}
	}	
	
	public void imprimir() {
		calcular();
		if ( sum == num)
			JOptionPane.showMessageDialog(null, toString());
		else 
			JOptionPane.showMessageDialog(null, toString2());
	}
	
	public String toString() {
		String texto = num + " es número perfecto";
		return texto;
	}

	public String toString2() {	
		String texto = num + " no es número perfecto";
		return texto;
	}
}
