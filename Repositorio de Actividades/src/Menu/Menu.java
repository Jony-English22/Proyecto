package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import unidad2.Circulo;
import unidad2.Cuadrado;
import unidad2.Hola_Mundo;
import unidad2.Nombre;
import unidad2.Nombre_Lineas;
import unidad2.Par_Impar;
import unidad2.Perfectos;
import unidad2.Primos;
import unidad2.Rombo;
import unidad2.Suma;
import unidad2.Trapecio;
import unidad2.Triangulo;
import unidad3.CCirculo;
import unidad3.CCuadrado;
import unidad3.CPar_Impar;
import unidad3.CPerfectos;
import unidad3.CPrimos;
import unidad3.CRombo;
import unidad3.CSuma_Numeros;
import unidad3.CTrapecio;
import unidad3.CTriangulo;
import unidad4.Reto1_Name;
import unidad4.Reto2_Names;
import unidad4.Reto3_Sum;
import unidad4.Reto4_Num;

public class Menu extends JFrame {

   public Menu() {
      // Configuración del JFrame
      setTitle("Repositorio de actividades");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(700, 345);
      setLocationRelativeTo(null);

      // Creación del menú y las opciones
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);

      JMenu menuUnidad1 = new JMenu("Unidad 1");
      menuBar.add(menuUnidad1);

      JMenuItem menuItem0 = new JMenuItem("Messaje");

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
      JMenuItem menuItem18 = new JMenuItem("Par_Impar");
      JMenuItem menuItem19 = new JMenuItem("Números Primos");
      JMenuItem menuItem20 = new JMenuItem("Suma de numeros");
      JMenuItem menuItem21 = new JMenuItem("Números perfectos");

      JMenu menuUnidad4 = new JMenu("Unidad 4");
      menuBar.add(menuUnidad4);

      JMenuItem menuItem22 = new JMenuItem("Nombres con estructura");
      JMenuItem menuItem23 = new JMenuItem("Nombres ascendente y descendente");
      JMenuItem menuItem24 = new JMenuItem("Suma de Posiciones");
      JMenuItem menuItem25 = new JMenuItem("Numeros con estructura");

      JMenu acerca = new JMenu("Acerca de");
      menuBar.add(acerca);

      JMenuItem menuItem26 = new JMenuItem("Aplicación");

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
      menuUnidad4.add(menuItem22);
      menuUnidad4.add(menuItem23);
      menuUnidad4.add(menuItem24);
      menuUnidad4.add(menuItem25);
      acerca.add(menuItem26);
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
      menuItem0.addActionListener(unidadListener);
      menuItem1.addActionListener(unidadListener);
      menuItem2.addActionListener(unidadListener);
      menuItem3.addActionListener(unidadListener);
      menuItem4.addActionListener(unidadListener);
      menuItem5.addActionListener(unidadListener);
      menuItem6.addActionListener(unidadListener);
      menuItem7.addActionListener(unidadListener);
      menuItem8.addActionListener(unidadListener);
      menuItem9.addActionListener(unidadListener);
      menuItem10.addActionListener(unidadListener);
      menuItem11.addActionListener(unidadListener);
      menuItem12.addActionListener(unidadListener);
      menuItem13.addActionListener(unidadListener);
      menuItem14.addActionListener(unidadListener);
      menuItem15.addActionListener(unidadListener);
      menuItem16.addActionListener(unidadListener);
      menuItem17.addActionListener(unidadListener);
      menuItem18.addActionListener(unidadListener);
      menuItem19.addActionListener(unidadListener);
      menuItem20.addActionListener(unidadListener);
      menuItem21.addActionListener(unidadListener);
      menuItem22.addActionListener(unidadListener);
      menuItem23.addActionListener(unidadListener);
      menuItem24.addActionListener(unidadListener);
      menuItem25.addActionListener(unidadListener);
      menuItem26.addActionListener(unidadListener);
      // Hacer visible el JFrame
      setVisible(true);
   }

   private void manejarUnidadSeleccionada(String unidadSeleccionada) {
      switch (unidadSeleccionada) {
      case "Mensaje":
         unidad1 uni = new unidad1();
         uni.mesaje();
         break;
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
      case "Cuadrado":
         Cuadrado cuadrado = new Cuadrado();
         cuadrado.act_5();
         break;
      case "Rombo":
         Rombo rombo = new Rombo();
         rombo.act_6();
         break;
      case "Trapecio":
         Trapecio trapecio = new Trapecio();
         trapecio.act_7();
         break;
      case "Circulo":
         Circulo circulo = new Circulo();
         circulo.act_8();
         break;
      case "Par-Impar":
         Par_Impar parimpar = new Par_Impar();
         parimpar.act_9();
         break;
      case "Numeros Primos":
         Primos primos = new Primos();
         primos.act_10();
         break;
      case "Suma de 100 numeros":
         Suma suma = new Suma();
         suma.act_11();
         break;
      case "Numeros perfectos":
         Perfectos perfectos = new Perfectos();
         perfectos.act_12();
         break;
      case "Area Triangulo":
         CTriangulo ctriangulo = new CTriangulo(0, 0);
         break;
      case "Area Cuadrado":
         CCuadrado ccuadrado = new CCuadrado(0);
         break;
      case "Area Rombo":
         CRombo crombo = new CRombo(0, 0);
         break;
      case "Area Trapecio":
         CTrapecio ctrapecio = new CTrapecio(0, 0, 0);
         break;
      case "Area Circulo":
         CCirculo ccirculo = new CCirculo(0);
         break;
      case "Par_Impar":
         CPar_Impar cpar_impar = new CPar_Impar(0);
         break;
      case "Números Primos":
         CPrimos cprimos = new CPrimos(0);
         break;
      case "Suma de numeros":
         CSuma_Numeros csuma = new CSuma_Numeros(0, 0);
         break;
      case "Números perfectos":
         CPerfectos cperfectos = new CPerfectos(0);
         break;
      case "Nombres con estructura":
         Reto1_Name reto1 = new Reto1_Name();
         reto1.reto1();
         break;
      case "Nombres ascendente y descendente":
         Reto2_Names reto2 = new Reto2_Names();
         reto2.reto2();
         break;
      case "Suma de Posiciones":
         Reto3_Sum reto3 = new Reto3_Sum();
         reto3.reto3();
         break;
      case "Numeros con estructura":
         Reto4_Num reto4 = new Reto4_Num();
         reto4.reto4();
         break;
      case "Aplicación":
         unidad1 uni2 = new unidad1();
         uni2.acerca();
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
