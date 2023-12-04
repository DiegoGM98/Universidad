package ventana;


import Controller.UniversidadController;
import model.Universidad;
import javax.swing.*;
import java.awt.event.*;

public class VentanaRegistrarEstudiante extends JFrame implements ActionListener {

    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoRut;
    private JTextField campoNumeroMatricula;
    private JButton botonRegistrar;
    private Universidad universidad;

    public VentanaRegistrarEstudiante(Universidad universidad) {
        this.universidad = universidad;
        setTitle("Registrar Estudiante");
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

        campoApellido = new JTextField();
        campoApellido.setBounds(175, 150, 150, 40);
        add(campoApellido);

        campoRut = new JTextField();
        campoRut.setBounds(175, 200, 150, 40);
        add(campoRut);

        campoNumeroMatricula = new JTextField();
        campoNumeroMatricula.setBounds(175, 250, 150, 40);
        add(campoNumeroMatricula);

        botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(175, 300, 150, 40);
        add(botonRegistrar);
        botonRegistrar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonRegistrar) {
            // Aquí va el código para registrar el estudiante
            String nombre = campoNombre.getText();
            String apellido = campoApellido.getText();
            String rut = campoRut.getText();
            String numeroMatricula = campoNumeroMatricula.getText();

            UniversidadController controller = new UniversidadController(universidad);
            controller.registrarEstudiante(nombre, apellido, rut, numeroMatricula);

            JOptionPane.showMessageDialog(this, "Estudiante registrado exitosamente!");
        }
    }
}
