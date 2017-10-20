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
                try
                {
                    int num1 = Integer.parseInt(numero1.getText());
                    int num2 = Integer.parseInt(numero2.getText());
                    int resultado = num1 / num2;

                    JOptionPane.showMessageDialog(null,/*"Quiero dividir " + numero1.getText() + " y " + numero2.getText()*/
                            "La división de " + numero1.getText() + " y " + numero2.getText() + " es " + resultado);
                }
                catch (ArithmeticException e)
                {
                    JOptionPane.showMessageDialog(null, "No puedo dividir por cero");
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Número inválido");
                }
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
