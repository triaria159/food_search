package Food_search;
import javax.swing.*;
import java.awt.*; 

public class Login_form extends JPanel {
	JLabel title=new JLabel("로그인", JLabel.CENTER);
    JLabel la1, la2;
    JTextField tf;
    JPasswordField pf;
    JButton b1, b2;
    public Login_form()
    {
    	title.setFont(new Font("함초롬돋움", Font.BOLD, 40));
    
        setLayout(null);
        title.setBounds(0, 15, 700, 55);
        add(title);
    	
        
        la1=new JLabel("아이디",JLabel.RIGHT);
        la1.setBounds(200, 135, 80, 30);
        tf=new JTextField();
        tf.setBounds(300, 135, 150, 30);
        
        add(la1);add(tf);
        
        la2=new JLabel("비밀번호",JLabel.RIGHT);
        la2.setBounds(200, 170, 80, 30);
        pf=new JPasswordField();
        pf.setBounds(300, 170, 150, 30);
        
        add(la2); add(pf);
        
        b1=new JButton("로그인");
        b2=new JButton("회원가입");
        JPanel p=new JPanel();
        p.add(b1);
        p.add(b2);
        p.setOpaque(false);
        p.setBounds(350, 300, 235, 35);
        add(p);
    }
   
}