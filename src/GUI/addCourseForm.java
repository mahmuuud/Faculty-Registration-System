package GUI;
import Faculty.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addCourseForm extends JFrame {
    private JLabel courseCode;
    private JTextField code;
    private JLabel creditHours;
    private JTextField ch;
    private JLabel instructorName;
    private JTextField name;
    private JRadioButton add;
    private JRadioButton close;
    private JPanel Submit;
    private JLabel toplbl;
    private JLabel submitLbl;


    public addCourseForm(){
        //initialize components
        courseCode=new JLabel("Course code");
        code=new JTextField();
        creditHours=new JLabel("Credit Hours");
        ch=new JTextField();
        Submit=new JPanel();
        toplbl=new JLabel("Course Management");
        instructorName=new JLabel("Instructor's name");
        name=new JTextField();
        add=new JRadioButton("Add course");
        close=new JRadioButton("Close course");
        submitLbl=new JLabel("Submit",SwingConstants.CENTER);
        //this.setDefaultCloseOperation(3);
        this.setTitle("Course Management");
        this.setMinimumSize(new Dimension(600,600));
        this.setLocation(700,200);
        this.setResizable(false);
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //top label
        toplbl.setBounds(175,70,250,70);
        toplbl.setFont(new Font("SansSerif",Font.PLAIN,25));
        toplbl.setForeground(Color.GRAY);
        this.add(toplbl);

        //course code
        courseCode.setBounds(20,150,200,45);
        courseCode.setFont(new Font("SansSerif",Font.PLAIN,16));
        courseCode.setForeground(Color.GRAY);
        code.setBounds(20,190,560,50);
        code.setFont(new Font("SansSerif",Font.PLAIN,20));
        code.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
        this.add(courseCode);
        this.add(code);

        //Credit hours
        creditHours.setBounds(20,245,200,45);
        creditHours.setFont(new Font("SansSerif",Font.PLAIN,16));
        creditHours.setForeground(Color.GRAY);
        ch.setBounds(20,285,560,50);
        ch.setFont(new Font("SansSerif",Font.PLAIN,20));
        ch.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
        this.add(creditHours);
        this.add(ch);

        //instructor name
        instructorName.setBounds(20,340,200,45);
        instructorName.setFont(new Font("SansSerif",Font.PLAIN,16));
        instructorName.setForeground(Color.GRAY);
        name.setBounds(20,383,560,50);
        name.setFont(new Font("SansSerif",Font.PLAIN,20));
        name.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
        this.add(instructorName);
        this.add(name);

        //submit button
        Submit.setBounds(190,500,200,50);
        Submit.setLayout(new BorderLayout());
        Submit.setBackground(new Color(46,87,146));
        submitLbl.setFont(new Font("SansSerif",Font.PLAIN,20));
        submitLbl.setForeground(Color.WHITE);
        Submit.add(submitLbl,BorderLayout.CENTER);
        Submit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Course c;

                String n=name.getText();
                if (add.isSelected()&&!(close.isSelected())&&system.getProfessor(n)!=null
                        &&(system.getProfessor(n).getCh())+Integer.parseInt(ch.getText())<=9) {
                    c=new Course(code.getText(), Integer.parseInt(ch.getText()), name.getText());
                    c.offer();
                    system.addCourse(c);
                    system.getProfessor(n).setCh(c.getCh());
                    System.out.println(system.getProfessor(n));
                    name.setText(null);
                    code.setText(null);
                    ch.setText(null);
                    close.setSelected(false);
                    add.setSelected(false);
                }
                if(close.isSelected()&&!(add.isSelected())&&system.getProfessor(n)!=null){
                    if(system.getCourse(code.getText())!=null) {
                        system.getCourse(code.getText()).close();
                        System.out.println(system.getCourse(code.getText()));
                        System.out.println(system.getProfessor(n));
                        name.setText(null);
                        code.setText(null);
                        ch.setText(null);
                        close.setSelected(false);
                        add.setSelected(false);

                    }


                }

                if(add.isSelected()&&(system.getProfessor(n).getCh()+Integer.parseInt(ch.getText()))>9){
                    JOptionPane optionPane=new JOptionPane("Error");
                    optionPane.showMessageDialog(null,"Professor reached the maximum number " +
                            "of courses per semester");

                }

                if(add.isSelected()&&close.isSelected()
                        ||system.getProfessor(n)==null||
                        code.getText().isEmpty()||name.getText().isEmpty()||ch.getText().isEmpty()) {
                    JOptionPane optionPane=new JOptionPane("Error");
                    optionPane.showMessageDialog(null,"Please fill the form");
                }
            }
        });
        this.add(Submit);

        //open and close radio buttons
        add.setBounds(360,450,100,45);
        close.setBounds(480,450,100,45);
        add.setBorderPainted(false);
        close.setBorderPainted(false);

        this.add(add);
        this.add(close);







    }
    public void close(){
        this.dispose();
    }
}
