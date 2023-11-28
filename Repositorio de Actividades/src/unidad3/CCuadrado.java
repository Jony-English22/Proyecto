package unidad3;

import javax.swing.JOptionPane;

public class CCuadrado {

	private int Clado;
	private int Area_C;
	
	public CCuadrado(int Clado) {
		this.Clado = Clado;
		leerDatos();
		imprimir();
	}
	
	public void leerDatos() {
		Clado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado: ", Clado));
	}
	
	public void imprimir() {
		JOptionPane.showMessageDialog(null, toString());
	}
	
	public int getArea() {
		Area_C = Clado * Clado;
		return Area_C;
	}
	
	public String toString() {
		String texto = "El area del cuadrado es: " + getArea() + "\nCon Lado: " + Clado ; 
		return texto;
	}
}
