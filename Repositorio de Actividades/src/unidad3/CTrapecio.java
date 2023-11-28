package unidad3;

import javax.swing.JOptionPane;

public class CTrapecio {

	private int Tpaltura;
	private int TpBaseM;
	private int TpBasem;
	private float Area_Tp;
	
	public CTrapecio(int Tpaltura, int TpBaseM, int TpBasem) {
		this.Tpaltura = Tpaltura;
		this.TpBaseM = TpBaseM;
		this.TpBasem = TpBasem;
		leerDatos();
		imprimir();
	}
	
	public void leerDatos() {
		Tpaltura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura: ", Tpaltura));
		TpBaseM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base mayor: ", TpBaseM));
		TpBasem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base mayor: ", TpBasem));
	}
	
	public void imprimir() {
		JOptionPane.showMessageDialog(null, toString());
	}
	
	public float getArea() {
		Area_Tp = (float) Tpaltura * (TpBaseM + TpBasem)/ 2;
		return Area_Tp;
	}
	
	public String toString() {
		String texto = "El area del trapecio es: " + getArea() + "\nAltura: " + Tpaltura + "\nBase Mayor: " + TpBaseM + "\nBase menor: " + TpBasem; 
		return texto;
	}
}
