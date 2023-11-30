package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import Unidad_2.Hola_Mundo;
import Unidad_2.Nombre;
import Unidad_2.Nombre_Lineas;
import Unidad_2.Triangulo;

public class Menu extends JFrame {

   public Menu() {
      // Configuración del JFrame
      setTitle("Repositorio de actividades");
      setSize(500, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Creación del menú y las opciones
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);

      JMenu menuUnidad1 = new JMenu("Unidad 1");
      menuBar.add(menuUnidad1);

      JMenuItem menuItem0 = new JMenuItem("Mensaje");

      JMenu menuUnidad2 = new JMenu("Unidad 2");
      menuBar.add(menuUnidad2);

      JMenuItem menuItem1 = new JMenuItem("Hola Mundo");
      JMenuItem menuItem2 = new JMenuItem("Nombre en linea");
      JMenuItem menuItem3 = new JMenuItem("Nombre en diferentes lineas");
      JMenuItem menuItem4 = new JMenuItem("Triangulo");
      JMenuItem menuItem5 = new JMenuItem("Cuadrado");
      JMenuItem menuItem6 = new JMenuItem("Rombo");
      JMenuItem menuItem7 = new JMenuItem("Trapecio");
      JMenuItem menuItem8 = new JMenuItem("Circulo");
      JMenuItem menuItem9 = new JMenuItem("Par-Impar");
      JMenuItem menuItem10 = new JMenuItem("Numeros Primos");
      JMenuItem menuItem11 = new JMenuItem("Suma de 100 numeros");
      JMenuItem menuItem12 = new JMenuItem("Numeros perfectos");

      JMenu menuUnidad3 = new JMenu("Unidad 3");
      menuBar.add(menuUnidad3);

      JMenuItem menuItem13 = new JMenuItem("Area Triangulo");
      JMenuItem menuItem14 = new JMenuItem("Area Cuadrado");
      JMenuItem menuItem15 = new JMenuItem("Area Rombo");
      JMenuItem menuItem16 = new JMenuItem("Area Trapecio");
      JMenuItem menuItem17 = new JMenuItem("Area Circulo");
      JMenuItem menuItem18 = new JMenuItem("Par-Impar");
      JMenuItem menuItem19 = new JMenuItem("Numeros Primos");
      JMenuItem menuItem20 = new JMenuItem("Suma de 100 numeros");
      JMenuItem menuItem21 = new JMenuItem("Numeros perfectos");

      JMenu menuUnidad4 = new JMenu("Unidad 4");
      menuBar.add(menuUnidad4);

      menuUnidad1.add(menuItem0);
      menuUnidad2.add(menuItem1);
      menuUnidad2.add(menuItem2);
      menuUnidad2.add(menuItem3);
      menuUnidad2.add(menuItem4);
      menuUnidad2.add(menuItem5);
      menuUnidad2.add(menuItem6);
      menuUnidad2.add(menuItem7);
      menuUnidad2.add(menuItem8);
      menuUnidad2.add(menuItem9);
      menuUnidad2.add(menuItem10);
      menuUnidad2.add(menuItem11);
      menuUnidad2.add(menuItem12);
      menuUnidad3.add(menuItem13);
      menuUnidad3.add(menuItem14);
      menuUnidad3.add(menuItem15);
      menuUnidad3.add(menuItem16);
      menuUnidad3.add(menuItem17);
      menuUnidad3.add(menuItem18);
      menuUnidad3.add(menuItem19);
      menuUnidad3.add(menuItem20);
      menuUnidad3.add(menuItem21);
      getContentPane().setLayout(null);

      ActionListener unidadListener = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // Acciones al seleccionar una unidad del menú
            String unidadSeleccionada = ((JMenuItem) e.getSource()).getText();
            manejarUnidadSeleccionada(unidadSeleccionada);
         }
      };

      ActionListener cerrarListener = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // Cerrar la ventana
            dispose();
         }
      };

      // Asignar el ActionListener a las opciones del menú
      menuItem1.addActionListener(unidadListener);
      menuItem2.addActionListener(unidadListener);
      menuItem3.addActionListener(unidadListener);
      menuItem4.addActionListener(unidadListener);

      // Hacer visible el JFrame
      setVisible(true);
   }

   private void manejarUnidadSeleccionada(String unidadSeleccionada) {
      switch (unidadSeleccionada) {
      case "Hola Mundo":
         Hola_Mundo holaMundo = new Hola_Mundo();
         holaMundo.act_1();
         break;
      case "Nombre en linea":
         Nombre nombre = new Nombre();
         nombre.act_2();
         break;
      case "Nombre en diferentes lineas":
         Nombre_Lineas nombreLineas = new Nombre_Lineas();
         nombreLineas.act_3();
         break;
      case "Triangulo":
         Triangulo triangulo = new Triangulo();
         triangulo.act_4();
         break;
      }
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new Menu();
         }
      });
   }
}
