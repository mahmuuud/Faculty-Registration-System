package GUI;

import Faculty.*;
import Users.Professor;
import Users.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegistrationForm extends JFrame {
    private JLabel Name;
    private JTextField name;
    private JLabel Age;
    private JTextField age;
    private JLabel ID;
    private JTextField id;
    private JRadioButton student;
    private JRadioButton professor;
    private JPanel Submit;
    private JLabel toplbl;
    private JLabel submitLbl;


    public RegistrationForm() {
        //initialize components
        Name = new JLabel("Name");
        name = new JTextField();
        Age = new JLabel("Member's age");
        age = new JTextField();
        Submit = new JPanel();
        toplbl = new JLabel("Registration");
        ID = new JLabel("Member's ID");
        id = new JTextField();
        student = new JRadioButton("Student");
        professor = new JRadioButton("Professor");
        submitLbl = new JLabel("Submit", SwingConstants.CENTER);
        this.setDefaultCloseOperation(3);
        this.setTitle("Registration");
        this.setMinimumSize(new Dimension(600, 600));
        this.setLocation(700, 200);
        this.setResizable(false);
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //top label
        toplbl.setBounds(230,70,250,70);
        toplbl.setFont(new Font("SansSerif",Font.PLAIN,25));
        toplbl.setForeground(Color.GRAY);
        this.add(toplbl);

        //member name
        Name.setBounds(20,150,200,45);
        Name.setFont(new Font("SansSerif",Font.PLAIN,16));
        Name.setForeground(Color.GRAY);
        name.setBounds(20,190,560,50);
        name.setFont(new Font("SansSerif",Font.PLAIN,20));
        name.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
        this.add(Name);
        this.add(name);

        //member's age
        Age.setBounds(20,245,200,45);
        Age.setFont(new Font("SansSerif",Font.PLAIN,16));
        Age.setForeground(Color.GRAY);
        age.setBounds(20,285,560,50);
        age.setFont(new Font("SansSerif",Font.PLAIN,20));
        age.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
        this.add(Age);
        this.add(age);

        //member's ID
        ID.setBounds(20,340,200,45);
        ID.setFont(new Font("SansSerif",Font.PLAIN,16));
        ID.setForeground(Color.GRAY);
        id.setBounds(20,383,560,50);
        id.setFont(new Font("SansSerif",Font.PLAIN,20));
        id.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
        this.add(ID);
        this.add(id);

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
                if(student.isSelected()){
                    Student s=new Student(name.getText(),Integer.parseInt(age.getText()),id.getText());
                    system.addStudent(s);
                    System.out.println(system.students);
                }
                if(professor.isSelected()){
                    Professor p=new Professor(name.getText(),Integer.parseInt(age.getText()),id.getText());
                    system.addProf(p);
                }

                if(professor.isSelected()&&student.isSelected()||!(professor.isSelected())&&!(student.isSelected())) {
                    JOptionPane optionPane=new JOptionPane("Error");
                    JOptionPane.showMessageDialog(null,"Please select the member's role");

                }
            }
        });

        //professor or student radio buttons
        professor.setBounds(360,450,150,45);
        student.setBounds(510,450,70,45);
        professor.setBorderPainted(false);
        student.setBorderPainted(false);
        this.add(professor);
        this.add(student);









    }

}
