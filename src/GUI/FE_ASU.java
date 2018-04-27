package GUI;
import javax.swing.*;
import java.awt.*;


public class FE_ASU extends JFrame {
    private JLabel backGround;
    private JPanel navBar;
    private JButton add;
    private JButton Drop;
    private JButton reserve;
    private JPanel reserveAclass;

    public FE_ASU(){
        backGround=new JLabel(new ImageIcon(("C:\\users\\m\\desktop\\Faculty_Registeration_System\\1.jpg")));
        navBar=new JPanel();
        add=new JButton("Add Course");
        Drop=new JButton("Drop/Withdraw Course");
        reserve=new JButton("Reserve a Classroom");
        reserveAclass=new JPanel();
        this.setTitle("FE-ASU");
        navBar.setBackground(new Color(46,87,141));
        this.setBounds(400,100,800,600);
        this.setDefaultCloseOperation(3);
        this.setBackground(Color.WHITE);
        this.setContentPane(backGround);
        this.setLayout(new BorderLayout());
        backGround.add(navBar,BorderLayout.NORTH);
        Drop.setBackground(new Color(46,87,141));
        Drop.setForeground(Color.WHITE);
        add.setBackground(new Color(46,87,141));
        add.setForeground(Color.WHITE);
        reserve.setBackground(new Color(46,87,141));
        reserve.setForeground(Color.WHITE);
        reserve.setFocusPainted(false);
        Drop.setFocusPainted(false);
        add.setFocusPainted(false);
        add.setBorderPainted(false);
        reserve.setBorderPainted(false);
        Drop.setBorderPainted(false);
        navBar.add(add);
        navBar.add(Drop);
        navBar.add(reserve);
        this.add(navBar,BorderLayout.NORTH);


    }
}
