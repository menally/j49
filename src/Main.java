import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("j49_SelectorOpciones - Menús Desplegables");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(420, 220);
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null);

        String[] lenguajes = {"Java", "Python", "JavaScript", "C++", "Ruby"};
        JComboBox<String> comboLenguajes = new JComboBox<>(lenguajes);
        JLabel etiquetaLenguaje = new JLabel("Selecciona un lenguaje de la lista.");

        String[] sistemas = {"Windows", "Linux", "macOS", "Ubuntu", "Android"};
        JComboBox<String> comboSistemas = new JComboBox<>(sistemas);
        JLabel etiquetaSistema = new JLabel("Selecciona un sistema operativo.");


        comboLenguajes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccionado = (String) comboLenguajes.getSelectedItem();
                etiquetaLenguaje.setText("Lenguaje elegido: " + seleccionado);
            }
        });

        comboSistemas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sistemaSeleccionado = (String) comboSistemas.getSelectedItem();
                etiquetaSistema.setText("Sistema elegido: " + sistemaSeleccionado);
            }
        });

        ventana.add(new JLabel("Lenguaje favorito:"));
        ventana.add(comboLenguajes);
        ventana.add(etiquetaLenguaje);

        ventana.add(new JLabel("Sistema operativo:"));
        ventana.add(comboSistemas);
        ventana.add(etiquetaSistema);

        ventana.setVisible(true);
    }
}