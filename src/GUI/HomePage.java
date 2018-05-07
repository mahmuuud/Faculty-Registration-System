package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HomePage extends JFrame {
    private JPanel topPnl;
    private JPanel addCourse;
    private JPanel drop;
    private JPanel reserve;
    private JPanel register;
    private JLabel logo;
    private JPanel buttonsPnl;
    private JLabel addIcon;
    private JLabel userIcon;
    private JLabel reserveIcon;
    private JLabel courseIcon;
    private JTextField txt;

    public HomePage(){
        //initialize components
        this.setTitle("Home page");
        this.setDefaultCloseOperation(3);
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        this.setMinimumSize(new Dimension(600,700));
        this.setLocation((screenSize.width-this.getWidth())/2,(screenSize.height-this.getHeight())/2);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        topPnl=new JPanel();
        addCourse=new JPanel();
        drop=new JPanel();
        register=new JPanel();
        reserve=new JPanel();
        logo=new JLabel(new ImageIcon(("C:\\users\\m\\desktop\\Faculty_Registeration_System\\1.jpg")));
        buttonsPnl=new JPanel();
        addIcon=new JLabel(new ImageIcon(("C:\\users\\m\\desktop\\Faculty_Registeration_System\\Main Icons\\add.png")));
        userIcon=new JLabel(new ImageIcon(("C:\\users\\m\\desktop\\Faculty_Registeration_System\\Main Icons\\user.png")));
        reserveIcon=new JLabel(new ImageIcon(("C:\\users\\m\\desktop\\Faculty_Registeration_System\\Main Icons\\reserve.png")));
        courseIcon=new JLabel(new ImageIcon(("C:\\users\\m\\desktop\\Faculty_Registeration_System\\Main Icons\\course.png")));
        txt=new JTextField("  Faculty of engineering-Ain shams university");
        txt.setFont(new Font("SansSerif", Font.BOLD, 20));
        txt.setEditable(false);
        txt.setBackground(Color.WHITE);
        txt.setBorder(null);

        //top panel contains only the faculty logo
        topPnl.setBackground(Color.WHITE);
        topPnl.setLayout(new BorderLayout());
        topPnl.add(logo,BorderLayout.WEST);
        topPnl.add(txt,BorderLayout.CENTER);
        this.add(topPnl,BorderLayout.NORTH);

        //add a new course button
        addCourse.setBounds(70,50,170,170);
        addCourse.setLayout(new BorderLayout());
        addCourse.add(addIcon,BorderLayout.CENTER);
        addCourse.setToolTipText("Add a new course to the System.");
        addCourse.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addCourseForm form=new addCourseForm();
                form.setVisible(true);

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                addCourse.setBackground(new Color(46,87,141));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                addCourse.setBackground(new Color(238,238,238));
            }
        });

        //Course management button
        drop.setBounds(350,50,170,170);
        drop.setLayout(new BorderLayout());
        drop.add(courseIcon,BorderLayout.CENTER);
        drop.setToolTipText("Add/drop or Withdraw courses.");
        drop.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                courseManagementForm courseManagementForm=new courseManagementForm();
                courseManagementForm.setVisible(true);

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                drop.setBackground(new Color(46,87,141));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                drop.setBackground(new Color(238,238,238));
            }
        });

        //Classrooms management button
        reserve.setBounds(70,280,170,170);
        reserve.setLayout(new BorderLayout());
        reserve.add(reserveIcon,BorderLayout.CENTER);
        reserve.setToolTipText("Reserve an empty classroom.");
        reserve.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ReserveClassroomForm reserveClassroomForm=new ReserveClassroomForm();
                reserveClassroomForm.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                reserve.setBackground(new Color(46,87,141));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                reserve.setBackground(new Color(238,238,238));
            }
        });

        //members management button
        register.setBounds(350,280,170,170);
        register.setLayout(new BorderLayout());
        register.add(userIcon,BorderLayout.CENTER);
        register.setToolTipText("Register a new student or staff member.");
        register.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RegistrationForm r=new RegistrationForm();
                r.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                register.setBackground(new Color(46,87,141));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                register.setBackground(new Color(238,238,238));
            }
        });

        //main pnl setup
        buttonsPnl.setBackground(Color.WHITE);
        buttonsPnl.setLayout(null); //to add our buttons in the exact coordinates
        buttonsPnl.add(addCourse);
        buttonsPnl.add(drop);
        buttonsPnl.add(reserve);
        buttonsPnl.add(register);

        this.add(buttonsPnl,BorderLayout.CENTER);

    }


}
