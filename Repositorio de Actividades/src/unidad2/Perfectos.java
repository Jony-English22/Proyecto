package unidad2;

import javax.swing.JOptionPane;

public class Perfectos {

	public void act_12() {
		
		for(int num = 1; num <=100; num++) {
			
			int sum=0;
			
			for(int div = 1; div<num; div++) {
				
				if(num % div == 0) {
					sum+=div;
				}
			}
			
			if(sum==num) {
				JOptionPane.showMessageDialog(null, num + " es número perfecto");
			}
		}
	}
}
