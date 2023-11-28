package unidad_2;
import javax.swing.JOptionPane;

public class Primos {

	public void act_10() {
		
		int num;
		
		for(num = 1; num <=10; num++) {
			
			int sum = 0;
			
			for(int div = 1; div<=num; div++) {
			
				if(num % div == 0) {
					sum++;
				}
			}
			
			if(sum == 2) {
				JOptionPane.showMessageDialog(null,num + "es número primo");
			}
		}
	}
}
