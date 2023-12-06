package Menu;

import javax.swing.JOptionPane;

public class unidad1 {

   public void mesaje() {

      String texto = "La unidad 1 fue una de las principales unidades donde "
            + "\nse nos dio a conocer los fundamentos de la programación, "
            + "\naprendiendo como funciona un algoritmo, pseudocódigo y diagramas de flujos.";
      JOptionPane.showMessageDialog(null, texto);
   }

   public void acerca() {
      String informacionAplicacion = "Esta es una aplicacion simple con el fin de exponer \n"
            + "de forma sencilla todos los ejercicios que hemos realizado \n"
            + " a lo largo del semestre a travez del lenguaje de Java.\n\n"
            + "Hecho por: Daniel García y Jonathan Ruiz.\n\n\n";

      JOptionPane.showMessageDialog(null, informacionAplicacion, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
   }
}
