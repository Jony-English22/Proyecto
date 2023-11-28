package unidad_2;
import javax.swing.JOptionPane;

public class Par_Impar {

	public void act_9() {
		
		int num = 9;
		
		if(num%2 == 0) {
			JOptionPane.showMessageDialog(null, num + " es número par");
		}
		else
			JOptionPane.showMessageDialog(null, num + " es número impar");
	}
}
