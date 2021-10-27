import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class MainForm {
    private JTextField txtNume;
    private JTextField txtPrenume;
    private JButton btnDirectionare;
    private JPanel rootPanel;

    public MainForm() {
        btnDirectionare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] raspuns = {"Catre pagina cu discuri"};
                ImageIcon poza = new ImageIcon("logo1.png");
                int result= JOptionPane.showOptionDialog(null,"Inregistrat cu succes!","Confirmare",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,poza,raspuns,0);
                JFrame frame2 = new JFrame("Discuri");
                frame2.setContentPane(new frame2().rootPanel2);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.pack();
                frame2.setSize(500,450);
                frame2.setResizable(false);
                frame2.setVisible(true);
                ImageIcon imagine=new ImageIcon("logo.png");
                frame2.setIconImage(imagine.getImage());
                frame2.getContentPane().setBackground(Color.orange);
            }
        });
    }
    public static void main(String[] args){
        JFrame frame=new JFrame("Discuri");
        frame.setContentPane(new MainForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(290,250);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.orange);
        ImageIcon imagine=new ImageIcon("logo.png");
        frame.setIconImage(imagine.getImage());
    }
}
