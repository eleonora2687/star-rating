package star.rating;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class FrameRegistration extends JFrame implements ActionListener {

    private Container c;
    private JLabel title, name, surname, type, res, username, pwd;
    private JTextField firstName, lastName, userName, passWord;
    private JRadioButton user, provider;
    private ButtonGroup typegp;
    private JCheckBox term;
    private JButton sub;
    FrameRegistrationTest frameRegistrationTest;


    public FrameRegistration() {
        frameRegistrationTest = new FrameRegistrationTest();

        setTitle("Registration Form");
        setBounds(300, 90, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(260, 30);
        c.add(title);

        name = new JLabel("First Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(120, 20);
        name.setLocation(240, 100);
        c.add(name);

        firstName = new JTextField();
        firstName.setFont(new Font("Arial", Font.PLAIN, 15));
        firstName.setSize(190, 20);
        firstName.setLocation(350, 100);
        c.add(firstName);

        surname = new JLabel("Last Name");
        surname.setFont(new Font("Arial", Font.PLAIN, 20));
        surname.setSize(120, 20);
        surname.setLocation(240, 150);
        c.add(surname);

        lastName = new JTextField();
        lastName.setFont(new Font("Arial", Font.PLAIN, 15));
        lastName.setSize(190, 20);
        lastName.setLocation(350, 150);
        c.add(lastName);

        username = new JLabel("Username");
        username.setFont(new Font("Arial", Font.PLAIN, 20));
        username.setSize(120, 20);
        username.setLocation(240, 200);
        c.add(username);

        userName = new JTextField();
        userName.setFont(new Font("Arial", Font.PLAIN, 15));
        userName.setSize(190, 20);
        userName.setLocation(350, 200);
        c.add(userName);


        pwd = new JLabel("Password");
        pwd.setFont(new Font("Arial", Font.PLAIN, 20));
        pwd.setSize(120, 20);
        pwd.setLocation(240, 250);
        c.add(pwd);

        passWord = new JTextField();
        passWord.setFont(new Font("Arial", Font.PLAIN, 15));
        passWord.setSize(190, 20);
        passWord.setLocation(350, 250);
        c.add(passWord);


        type = new JLabel("Type");
        type.setFont(new Font("Arial", Font.PLAIN, 20));
        type.setSize(100, 20);
        type.setLocation(240, 320);
        c.add(type);

        user = new JRadioButton("User");
        user.setFont(new Font("Arial", Font.PLAIN, 15));
        user.setSelected(true);
        user.setSize(75, 20);
        user.setLocation(350, 320);
        c.add(user);

        provider = new JRadioButton("Provider");
        provider.setFont(new Font("Arial", Font.PLAIN, 15));
        provider.setSelected(false);
        provider.setSize(90, 20);
        provider.setLocation(425, 320);
        c.add(provider);

        typegp = new ButtonGroup();
        typegp.add(user);
        typegp.add(provider);


        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(240, 370);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(330, 420);
        sub.addActionListener(this);
        c.add(sub);


        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(270, 500);
        c.add(res);


        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {

        String str = userName.getText();
        frameRegistrationTest.addUsername(str);


    }
}





class Registration {

    public static void main(String[] args) throws Exception
    {
        FrameRegistration frame = new FrameRegistration();


    }
}
