package unidad3;

import javax.swing.JOptionPane;

public class CRombo {
	private int RDiametro;
	private int Rdiametro;
	private float Area_R;
	
	public CRombo(int RDiametro, int Rdiametro) {
		this.RDiametro = RDiametro;
		this.Rdiametro = Rdiametro;
		leerDatos();
		imprimir();
	}
	
	public void leerDatos() {
		RDiametro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el diametro mayor ",RDiametro));
		Rdiametro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el diametro menor: ",Rdiametro));
	}
	
	public void imprimir() {
		JOptionPane.showMessageDialog(null, toString());
	}
	
	public float getArea() {
		Area_R = (float) RDiametro * Rdiametro / 2;
		return Area_R;
	}
	
	public String toString() {
		String texto = "El area del rombo es: " + getArea() + "\nDiamentro Mayor: " + RDiametro + "\nDiametro menor: " + Rdiametro; 
		return texto;
	}


}
