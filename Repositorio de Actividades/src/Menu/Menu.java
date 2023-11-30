package Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu {
  public static void main(String[] args) {
    String[] opcion = {"Unidad 1", "Unidad 2", "Unidad 3", "Unidad 4"};

    JFrame jFrame = new JFrame();

    JComboBox<String> jComboBox = new JComboBox<>(opcion);
    jComboBox.setBounds(80, 50, 140, 20);

    JButton jButton = new JButton("Done");
    jButton.setBounds(100, 25, 110, 50);
    //25 es x, 25 es y, 110 es ancho y 50 es altura
    JLabel jLabel = new JLabel();
    jLabel.setBounds(90, 100, 400, 100);

    jFrame.add(jButton);
    jFrame.add(jComboBox);
    jFrame.add(jLabel);

    jFrame.setLayout(null);
    jFrame.setSize(350, 250);
    jFrame.setVisible(true);

    jButton.addActionListener(new ActionListener() {
    
      public void actionPerformed(ActionEvent e) {
        String selectedFruit = "You selected " + jComboBox.getItemAt(jComboBox.getSelectedIndex());
        jLabel.setText(selectedFruit);
      }
    });
  }
}

package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Unidad_2.Circulo;
import Unidad_2.Hola_Mundo;

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
      getContentPane().setLayout(null);

      // Lista de temas para cada unidad (puedes personalizarla según tus necesidades)
      String[] temasUnidad1 = { "Hola Mundo", "Nombre en una linea", "Nombre en diferentes lineas", "Triangulo",
            "Cuadrado", "Rombo", "Trapecio", "Circulo", "Par-Impar", "Numeros Primos", "Suma de 100 numeros",
            "Perfectos" };
      String[] temasUnidad2 = { "Estructuras de Control", "Arreglos", "Funciones" };
      String[] temasUnidad3 = { "POO", "Excepciones", "Archivos" };
      String[] temasUnidad4 = { "APIs", "Interfaz gráfica", "Proyecto final" };

      // ActionListener para las opciones del menú
      ActionListener unidadListener = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // Acciones al seleccionar una unidad del menú
            String unidadSeleccionada = ((JMenuItem) e.getSource()).getText();

            // Determinar la lista de temas según la unidad seleccionada
            String[] temas = {};
            switch (unidadSeleccionada) {
            case "Unidad 1":
               temas = temasUnidad1;
               break;
            case "Unidad 2":
               temas = temasUnidad2;
               break;
            case "Unidad 3":
               temas = temasUnidad3;
               break;
            case "Unidad 4":
               temas = temasUnidad4;
               break;
            }

            // Mostrar la lista de temas en un cuadro de diálogo
            String temaSeleccionado = (String) JOptionPane.showInputDialog(Menu.this, "Selecciona un tema:", "Temas",
                  JOptionPane.PLAIN_MESSAGE, null, temas, temas[0]);

            switch (temaSeleccionado) {
            case "Hola Mundo":
               Hola_Mundo holaMundo = new Hola_Mundo();
               holaMundo.act_1();
               break;
            case "Circulo":
               Circulo circulo = new Circulo();
               circulo.act_8();
               break;
            }
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

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new Menu();
         }
      });
   }
}
