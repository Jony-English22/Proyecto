package unidad3;

import javax.swing.JOptionPane;

public class CTriangulo {

	private int Tbase;
	private int Taltura;
	private float Area_T;
	
	public CTriangulo(int Tbase, int Taltura) {
		this.Tbase = Tbase;
		this.Taltura = Taltura;
		leerDatos();
		imprimir();
	}
	
	public void leerDatos() {
		Tbase = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: ", Tbase));
		Taltura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura: ", Taltura));
	}
	
	public void imprimir() {
		JOptionPane.showMessageDialog(null, toString());
	}
	
	public float getArea() {
		Area_T = (float) Tbase * Taltura / 2;
		return Area_T;
	}
	
	public String toString() {
		String texto = "El area del triangulo es: " + getArea() + "\nBase: " + Tbase + "\nAltura: " + Taltura; 
		return texto;
	}
}
