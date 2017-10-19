import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioExcepciones {
    private JButton button1;
    private JPanel panel1;
    private JTextField numero1;
    private JTextField numero2;

    public FormularioExcepciones() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hola " + Nombre.getText());
                JOptionPane.showMessageDialog(null,"Quiero dividir " + numero1.getText() + " y " + numero2.getText());
            }
        });
    }

    public static void main(String[] args) {
        FormularioExcepciones formulario = new FormularioExcepciones();
        JFrame ventana = new JFrame();
        ventana.setContentPane(formulario.panel1);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
