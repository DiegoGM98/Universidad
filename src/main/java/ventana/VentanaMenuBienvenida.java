// Paquete ventana
package ventana;

import Controller.UniversidadController;
import model.Universidad;
import javax.swing.*;
import java.awt.event.*;

public class VentanaMenuBienvenida extends JFrame implements ActionListener {

    private JLabel textoMenu;
    private JButton botonRegistrarEstudiante;
    private JButton botonSalir;
    private JButton botonRegistrarCarrera;
    private JButton botonBuscarEstudiante;
    private Universidad universidad;

    public VentanaMenuBienvenida(Universidad universidad) {
        this.universidad = universidad;
        setTitle("Menu Universidad");
        setSize(500, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        generarElementosVentana();
        setVisible(true);
    }

    private void generarElementosVentana() {
        generarMensajeMenu();
        generarBotonRegistrarEstudiante();
        generarBotonRegistrarCarrera();
        generarBotonBuscarEstudiante();
        generarBotonSalir();
    }

    private void generarMensajeMenu() {
        String textoBienvenida = "Sistema de Gestión de la Universidad";
        textoMenu = new JLabel(textoBienvenida);
        textoMenu.setBounds(20, 30, 500, 30);
        add(textoMenu);
    }

    private void generarBotonRegistrarEstudiante() {
        String textoBoton = "Registrar Estudiante";
        botonRegistrarEstudiante = new JButton(textoBoton);
        botonRegistrarEstudiante.setBounds(175, 100, 150, 40);
        add(botonRegistrarEstudiante);
        botonRegistrarEstudiante.addActionListener(this);
    }

    private void generarBotonSalir() {
        String textoBoton = "Salir";
        botonSalir = new JButton(textoBoton);
        botonSalir.setBounds(175, 420, 150, 40);
        add(botonSalir);
        botonSalir.addActionListener(this);
    }

    private void generarBotonRegistrarCarrera() {
        String textoBoton = "Registrar Carrera";
        botonRegistrarCarrera = new JButton(textoBoton);
        botonRegistrarCarrera.setBounds(175, 180, 150, 40);
        add(botonRegistrarCarrera);
        botonRegistrarCarrera.addActionListener(this);
    }

    private void generarBotonBuscarEstudiante(){
        String textoBoton = "Buscar Estudiante";
        botonBuscarEstudiante = new JButton(textoBoton);
        botonBuscarEstudiante.setBounds(175, 260, 150, 40);
        add(botonBuscarEstudiante);
        botonBuscarEstudiante.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonRegistrarEstudiante) {
            // Aquí va el código para abrir la ventana de registro de estudiantes
            VentanaRegistrarEstudiante ventanaRegistrarEstudiante = new VentanaRegistrarEstudiante(universidad);
            ventanaRegistrarEstudiante.setVisible(true);
        }
        if(e.getSource() == botonRegistrarCarrera){
            // Aquí va el código para abrir la ventana de registro de carreras
            VentanaRegistrarCarrera ventanaRegistrarCarrera = new VentanaRegistrarCarrera(universidad);
            ventanaRegistrarCarrera.setVisible(true);
        }
        if(e.getSource() == botonBuscarEstudiante){
            // Aquí va el código para abrir la ventana de búsqueda de estudiantes
            VentanaBuscarEstudiante ventanaBuscarEstudiante = new VentanaBuscarEstudiante(universidad);
            ventanaBuscarEstudiante.setVisible(true);
        }
        if(e.getSource() == botonSalir){
            // Aquí va el código para cerrar la aplicación
            System.exit(0);
        }
    }
}