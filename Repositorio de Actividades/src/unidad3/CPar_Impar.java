package unidad3;

import javax.swing.JOptionPane;

public class CPar_Impar {
	
	private int num;

	public CPar_Impar (int num) {
		
		this.num = num;
		solicitar();
		imprimir();
		
	}
	
	public void solicitar() {
		num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: ", num));
	}
	
	public void imprimir () {
		
		if ( num % 2 == 0)
			JOptionPane.showMessageDialog(null, toString());
		else 
			JOptionPane.showMessageDialog(null, toString2());
	}
	
	public String toString() {
		
		String texto = num + " es número par";
		return texto;
	}

	public String toString2() {
		
		String texto = num + " es número impar";
		return texto;
	}
}
