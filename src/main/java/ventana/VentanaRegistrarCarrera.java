// Paquete ventana
package ventana;

import Controller.UniversidadController;
import model.Universidad;
import javax.swing.*;
import java.awt.event.*;

public class VentanaRegistrarCarrera extends JFrame implements ActionListener {

    private JTextField campoNombre;
    private JTextField campoCodigo;
    private JTextField campoCantidadSemestres;
    private JButton botonRegistrar;
    private Universidad universidad;

    public VentanaRegistrarCarrera(Universidad universidad) {
        this.universidad = universidad;
        setTitle("Registrar Carrera");
        setSize(500, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        generarElementosVentana();
        setVisible(true);
    }

    private void generarElementosVentana() {
        // Generar campos de texto y botón de registro
        campoNombre = new JTextField();
        campoNombre.setBounds(175, 100, 150, 40);
        add(campoNombre);

        campoCodigo = new JTextField();
        campoCodigo.setBounds(175, 150, 150, 40);
        add(campoCodigo);

        campoCantidadSemestres = new JTextField();
        campoCantidadSemestres.setBounds(175, 200, 150, 40);
        add(campoCantidadSemestres);

        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(175, 300, 150, 40);
        add(botonRegistrar);
        botonRegistrar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonRegistrar) {
            // Aquí va el código para registrar la carrera
            String nombre = campoNombre.getText();
            String codigo = campoCodigo.getText();
            int cantidadSemestres = Integer.parseInt(campoCantidadSemestres.getText());

            UniversidadController controller = new UniversidadController(universidad);
            controller.registrarCarrera(nombre, codigo, cantidadSemestres);

            JOptionPane.showMessageDialog(this, "Carrera registrada exitosamente!");
        }
    }
}
