package unidad3;

import javax.swing.JOptionPane;

public class CCirculo {

	private int radio;
	private double PI = 3.1416;
	private float Area_CC;
	
	public CCirculo (int radio) {
		this.radio = radio;
		leerDatos();
		imprimir();
	}
	
	public void leerDatos() {
		radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio: ", radio));
	}
	
	public void imprimir() {
		JOptionPane.showMessageDialog(null, toString());
	}
	
	public float getArea() {
		Area_CC= (float) PI * (radio * radio);
		return Area_CC;
	}
	
	public String toString() {
		String texto = "El area del circulo es: " + getArea() + "\nRadio: " + radio; 
		return texto;
	}
}
