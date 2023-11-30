package unidad4;

import javax.swing.JOptionPane;

public class Reto2_Names {
	
	public void reto2() {
		
		String nombre[] = new String[5];
		
		for (int i = 0; i < 5; i++) {
			
			String valor = JOptionPane.showInputDialog("Ingrese el nombre " + (i + 1) +" :");
			nombre[i] = valor;
			
		}
		
		String cadena = "Los nombres son:   \n";
		
		for (int i = 0; i < 5; i++) {
			cadena+="nombre[" + i + "] = " + nombre[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null,cadena);
	
		String cadena2 = "Los nombres son:   \n";
	
		for (int i = 4 ; i >= 0; i--) {
		cadena2+="nombre[" + i + "] = " + nombre[i] + "\n";
		}
	
		JOptionPane.showMessageDialog(null,cadena2);
	}

}
