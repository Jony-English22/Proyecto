package unidad4;

import javax.swing.JOptionPane;

public class Reto1_Name {

	public void reto1() {
		
		int numeros[] = new int[6];
		
		for (int i = 0; i < 6; i++) {
			String valor = JOptionPane.showInputDialog("Ingrese el numero " + i + ":");
			numeros[i] = Integer.parseInt(valor);
		}
		
		String mensaje = "Los numeros son: ";
		
		for (int n : numeros) {
			mensaje += n + " s";
		}
		
		JOptionPane.showMessageDialog(null, mensaje);
		String mensajeEst = "Estructura del array: \n";
		
		for (int i = 0; i < 6; i++) {
			mensajeEst += "numeros[" + i + "] = " + numeros[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, mensajeEst);
	}
}
