import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame2 {
    public JPanel rootPanel2;
    private JRadioButton btnFrank;
    private JRadioButton btnJimi;
    private JRadioButton btnMichael;
    private JButton btnCos;
    private JTextField txtSubtotal;
    private JLabel JLabel;
    private JTextField txtTotal;
    private JButton btnCalculeaza;
    ImageIcon jimi;
    ImageIcon michael;
    ImageIcon sinatra;

    public frame2(){

        btnCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result= JOptionPane.showConfirmDialog(null,"Produsele au fost adaugate in cos!","Confirmare",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnCalculeaza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total;
                double subtotal=0;

                if (btnJimi.isSelected()) {
                    subtotal =subtotal + 135;
                }if (btnMichael.isSelected()){
                    subtotal=subtotal + 100;
                }if(btnFrank.isSelected()){
                    subtotal=subtotal + 140;
                }

                txtSubtotal.setText(Double.toString (subtotal));
                subtotal = Double.parseDouble(txtSubtotal.getText());
                total= subtotal + 15;
                txtTotal.setText(Double.toString(total));
            }
        });
    }
}
