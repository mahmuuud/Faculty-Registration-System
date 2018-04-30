package GUI;

import javax.swing.*;
import Faculty.*;
import Users.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class courseManagementForm extends JFrame {
    private JLabel studentName;
    private JTextField name;
    private JLabel studentID;
    private JTextField id;
    private JLabel courseCode;
    private JTextField code ;
    private JRadioButton add;
    private JRadioButton drop;
    private JRadioButton withdraw;
    private JPanel Submit;
    private JLabel toplbl;
    private JLabel submitLbl;


    public courseManagementForm() {
        //initialize components
        studentName = new JLabel("Student name");
        name = new JTextField();
        studentID = new JLabel("Student ID");
        id = new JTextField();
        Submit = new JPanel();
        toplbl = new JLabel("Course Add/Drop");
        courseCode = new JLabel("Course code");
        code = new JTextField();
        add = new JRadioButton("Add");
        drop = new JRadioButton("Drop");
        withdraw=new JRadioButton("Withdraw");
        submitLbl = new JLabel("Submit", SwingConstants.CENTER);
        //this.setDefaultCloseOperation(3);
        this.setTitle("Course Add/Drop");
        this.setMinimumSize(new Dimension(600, 600));
        this.setLocation(700, 200);
        this.setResizable(false);
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //top label
        toplbl.setBounds(200,70,250,70);
        toplbl.setFont(new Font("SansSerif",Font.PLAIN,25));
        toplbl.setForeground(Color.GRAY);
        this.add(toplbl);

        // Student Name
        studentName.setBounds(20,150,200,45);
        studentName.setFont(new Font("SansSerif",Font.PLAIN,16));
        studentName.setForeground(Color.GRAY);
        name.setBounds(20,190,560,50);
        name.setFont(new Font("SansSerif",Font.PLAIN,20));
        name.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
        this.add(studentName);
        this.add(name);

        //Student ID
        studentID.setBounds(20,245,200,45);
        studentID.setFont(new Font("SansSerif",Font.PLAIN,16));
        studentID.setForeground(Color.GRAY);
        id.setBounds(20,285,560,50);
        id.setFont(new Font("SansSerif",Font.PLAIN,20));
        id.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
        this.add(studentID);
        this.add(id);

        //Course Code
        courseCode.setBounds(20,340,200,45);
        courseCode.setFont(new Font("SansSerif",Font.PLAIN,16));
        courseCode.setForeground(Color.GRAY);
        code.setBounds(20,383,560,50);
        code.setFont(new Font("SansSerif",Font.PLAIN,20));
        code.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
        this.add(courseCode);
        this.add(code);

        //submit button
        Submit.setBounds(190,500,200,50);
        Submit.setLayout(new BorderLayout());
        Submit.setBackground(new Color(46,87,146));
        submitLbl.setFont(new Font("SansSerif",Font.PLAIN,20));
        submitLbl.setForeground(Color.WHITE);
        Submit.add(submitLbl,BorderLayout.CENTER);
        this.add(Submit);
        Submit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String c=code.getText();
                String n=name.getText();
                String iD=id.getText();
                if(system.getCourse(c)!=null&&system.getStudent(n,iD)!=null){
                    Student s=system.getStudent(n,iD);
                    Course course=system.getCourse(c);
                    if(add.isSelected()){
                        course.register(s);

                    }

                    else if(drop.isSelected()){
                        course.drop(s);

                    }

                    else if(withdraw.isSelected()){
                        course.withdraw(s);

                    }
                }
                else{
                    JOptionPane optionPane=new JOptionPane("Error");
                    optionPane.showMessageDialog(null,"Error");
                }
            }
        });

        //add, drop and withdraw radio buttons
        add.setBounds(360,450,70,45);
        drop.setBounds(440,450,70,45);
        withdraw.setBounds(510,450,100,45);
        add.setBorderPainted(false);
        drop.setBorderPainted(false);
        withdraw.setBorderPainted(false);
        this.add(add);
        this.add(drop);
        this.add(withdraw);


    }









}
