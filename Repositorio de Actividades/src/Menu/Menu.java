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