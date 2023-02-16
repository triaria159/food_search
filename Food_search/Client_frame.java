package Food_search;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client_frame extends JFrame implements ActionListener{
    //배치
    CardLayout card=new CardLayout();
    Login_form login=new Login_form();
    Join_form join=new Join_form();
    public Client_frame()
    {
    	setResizable(false);
		setTitle("\uB9DB\uC9D1 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 432);
		
        setLayout(card);
        
        //화면추가
        add("LOGIN",login);
        add("JOIN",join);
        
        
        setSize(700, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        login.b2.addActionListener(this);
        join.b3.addActionListener(this);
    }
 
 
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login.b2)
        {
            card.show(getContentPane(), "JOIN");
        }
        else if(e.getSource()==join.b3)
        {
            card.show(getContentPane(), "LOGIN");
            
        }
    }
 
}
