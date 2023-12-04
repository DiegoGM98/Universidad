// Paquete ventana
package ventana;

import Controller.UniversidadController;
import model.Estudiante;
import model.Universidad;
import javax.swing.*;
import java.awt.event.*;

public class VentanaBuscarEstudiante extends JFrame implements ActionListener {

    private JTextField campoNombre;
    private JButton botonBuscar;
    private Universidad universidad;

    public VentanaBuscarEstudiante(Universidad universidad) {
        this.universidad = universidad;
        setTitle("Buscar Estudiante");
        setSize(500, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        generarElementosVentana();
        setVisible(true);
    }

    private void generarElementosVentana() {
        // Generar campos de texto y botón de búsqueda
        campoNombre = new JTextField();
        campoNombre.setBounds(175, 100, 150, 40);
        add(campoNombre);

        botonBuscar = new JButton("Buscar");
        botonBuscar.setBounds(175, 300, 150, 40);
        add(botonBuscar);
        botonBuscar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonBuscar) {
            // Aquí va el código para buscar el estudiante
            String nombre = campoNombre.getText();

            UniversidadController controller = new UniversidadController(universidad);
            Estudiante estudiante = controller.buscarEstudiantePorNombre(nombre);

            if (estudiante != null) {
                JOptionPane.showMessageDialog(this, "Estudiante encontrado: " + estudiante.getNombre());
            } else {
                JOptionPane.showMessageDialog(this, "Estudiante no encontrado");
            }
        }
    }
}

