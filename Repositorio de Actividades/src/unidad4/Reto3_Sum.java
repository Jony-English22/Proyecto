package unidad4;

import javax.swing.JOptionPane;

public class Reto3_Sum {

	public void reto3() {
		
		int numeros[] = new int[5];
		int numeros2[] = new int[5];
		
		for (int i = 0; i < 5; i++) {	
			String valor = JOptionPane.showInputDialog("Ingrese el numero " +  (i+1) + ": " );
			numeros[i] = Integer.parseInt(valor);
			
			int num = Integer.parseInt(valor);		
			
			if(num > 5) {	
				JOptionPane.showMessageDialog(null, "Numero incorrecto mandelo de nuevo");
				i--;
			}
			else {	
				numeros[i] = Integer.parseInt(valor);
					
				if(i == 0) {
					numeros2[i]= numeros[i]+ 0;
				}
				else {
					numeros2[i]= numeros[i]+numeros2[i-1];
				}
			}
		}
		
		String mensaje = "Los numeros son: ";
		
		for (int n : numeros2) {		
			mensaje += n + " ";
		}
		
		JOptionPane.showMessageDialog(null, mensaje);
		String mensajeEst = "Estructura del array: \n";
		
		for (int i = 0; i < 5; i++) {			
			mensajeEst += "numeros2[" + i + "] = " + numeros2[i] + "\n";
		}
			
		JOptionPane.showMessageDialog(null, mensajeEst);
		
	}
}
