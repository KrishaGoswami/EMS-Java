package employee.managment.system;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener {
    JButton view, add, update, remove;
    Home(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/homepage4.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(788,443, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120,630);
        add(image);
        JLabel heading = new JLabel("Employee Managment System");
        heading.setBounds(400,20,400,40);
        heading.setFont(new Font("Serif",Font.BOLD,30));
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(200, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Employees");
        view.setBounds(400, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(600, 80, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(800,80, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
                
                
        setSize(1120,630);
        setLocation(250,100);
        setVisible(true);
    }

        @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }
    public static void main(String[] args){
        new Home();
    }
    
}
