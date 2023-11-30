package unidad3;

import javax.swing.JOptionPane;

public class CSuma_Numeros {

	private int cant; 
	private int num; 
	private int sum; 
	
	public CSuma_Numeros(int num, int cant) {
		
		this.cant = cant;
		this.num = num;
		leer();
		imprimir();	
		}
	
	public void leer() {
		
		cant = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos números quiere sumar?", cant));
		
			for (int N = 1; N <= cant; N++) {
				
				num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + N + ": ", num));
				calcular();
			}
	}
	
	public String toString() {	
		String texto = "La suma de los " + cant + " es: " + sum;
		return texto;
	}
	
	public void imprimir() {
		JOptionPane.showMessageDialog(null, toString());
	}
	
	public int calcular() {
		sum+=num;
		return sum;
	}
}
