import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Estudiantes {
    private JPanel Estudiantes;
    private JTextField codigo;
    private JTextField cedula;
    private JTextField nombre;
    private JTextField apellido;
    private JCheckBox rojoCheckBox;
    private JCheckBox negroCheckBox;
    private JCheckBox ningunoCheckBox;
    private JRadioButton siRadioButton;
    private JRadioButton noRadioButton;
    private JButton cargarDatosDesdeElButton;
    private JButton guardarDatosEnElButton;
    private JButton anteriorButton;
    private JButton siguienteButton;
    private JComboBox <String> anio;
    private JComboBox <String> mes;
    private JComboBox <String> dia;
    private JComboBox <String> signoz;

    private ArrayList<Estudiantes> info ;
    int indiceActual=0;

    public Estudiantes() {
        info = new ArrayList();

        //Signos
        signoz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String signoSeleccionado = (String) comboBox1.getSelectedItem();
            }
        });

        guardarDatosEnElButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigox=codigo.getText();
                String cedulax= cedula.getText();
                String nombrex=nombre.getText();
                String apellidox=apellido.getText();

                datosE(codigox,cedulax,nombrex,apellidox);
            }
        });
    }


    private void datosE(String codigox, String cedulax, String nombrex, String apellidox) {
        Estudiantes nuevo = new Estudiantes();
        //anado el objeto dentro del array
        info.add(nuevo);
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("datos.dat", true));
            writer.write("" );
            writer.newLine();
            writer.close();
            System.out.println("Datos guardados en datos.dat");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Estudiantes");

        frame.setContentPane(new Estudiantes().Estudiantes);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
