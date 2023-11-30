package unidad4;

import javax.swing.JOptionPane;

public class Reto4_Num {

	public void reto4() {
		
		int numeros[] = new int[5];

		for (int i = 0; i < 5; i++) {	
			String valor = JOptionPane.showInputDialog("Ingrese el numero " +  (i+1) + ": " );
			numeros[i] = Integer.parseInt(valor);
			int num = Integer.parseInt(valor);		
		}
		
		String mensaje = "Los numeros son: ";
		
		for (int n : numeros) {		
			mensaje += n + " ";
		}
		
		JOptionPane.showMessageDialog(null, mensaje);
		String mensajeEst = "Estructura del array: \n";
		
		for (int i = 0; i < 5; i++) {	
			mensajeEst += "numeros[" + i + "] = " + numeros[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, mensajeEst);
	}
}
