package GUI;

import javax.swing.*;
import javax.swing.*;
import Faculty.*;
import Faculty.Class;
import Users.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReserveClassroomForm extends JFrame {
        private JLabel Day;
        private JTextField day;

        private JLabel Time;
        private JTextField time;
        private JPanel Submit;
        private JLabel toplbl;
        private JLabel submitLbl;


        public ReserveClassroomForm() {
            //initialize components
            Day = new JLabel("Reservation day");
            day = new JTextField();
            Submit = new JPanel();
            toplbl = new JLabel("Classrooms Management");
            Time = new JLabel("Reservation Time");
            time = new JTextField();
            submitLbl = new JLabel("Reserve", SwingConstants.CENTER);
            this.setDefaultCloseOperation(3);
            this.setTitle("Classrooms Management");
            this.setMinimumSize(new Dimension(600, 600));
            this.setLocation(700, 200);
            this.setResizable(false);
            this.setLayout(null);
            this.setBackground(Color.WHITE);

            //top label
            toplbl.setBounds(150,70,450,70);
            toplbl.setFont(new Font("SansSerif",Font.PLAIN,25));
            toplbl.setForeground(Color.GRAY);
            this.add(toplbl);

            //Reservation day
            Day.setBounds(20,150,200,45);
            Day.setFont(new Font("SansSerif",Font.PLAIN,16));
            Day.setForeground(Color.GRAY);
            day.setBounds(20,190,560,50);
            day.setFont(new Font("SansSerif",Font.PLAIN,20));
            day.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
            this.add(Day);
            this.add(day);

            // Reservation Time
            Time.setBounds(20,340,200,45);
            Time.setFont(new Font("SansSerif",Font.PLAIN,16));
            Time.setForeground(Color.GRAY);
            time.setBounds(20,383,560,50);
            time.setFont(new Font("SansSerif",Font.PLAIN,20));
            time.setBorder(BorderFactory.createBevelBorder(2,Color.GRAY,Color.WHITE));
            this.add(Time);
            this.add(time);

            //Reserve button
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
                    String d=day.getText();
                    int t=Integer.parseInt(time.getText());
                    String reservedClass=Class.reserve(d,t);
                    JOptionPane optionPane=new JOptionPane("Reservation");
                    optionPane.showMessageDialog(null,"Classroom "+reservedClass+" is reserved");
                }
            });


        }



}
