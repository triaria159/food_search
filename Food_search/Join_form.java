package Food_search;
import java.awt.*;
import javax.swing.*;

public class Join_form extends JPanel{
   JLabel title=new JLabel("회원가입", JLabel.CENTER);
   JLabel la1, la2, la3, la4, la5, la6, la7, la8, la9, la10, la11;
   JTextField tf1, tf2, tf3, tf4, tf5, tf6;
   JLabel dash=new JLabel("-");
   JButton b2=new JButton("우편번호 검색");
   JPasswordField pf1, pf2;
   JRadioButton rb1, rb2;
   JTextArea ta;
   JButton b1;
   JComboBox telBox = new JComboBox();
   JTextField tf7, tf8;
   JLabel dash2=new JLabel("-");
   JButton b3=new JButton("회원가입");
   JButton b4=new JButton("취소");
 
   //초기화
   public Join_form(){
      la1=new JLabel("ID", JLabel.RIGHT);
      la2=new JLabel("비밀번호", JLabel.RIGHT);
      la3=new JLabel("재입력", JLabel.RIGHT);
      la4=new JLabel("닉네임", JLabel.RIGHT);
      la5=new JLabel("성별", JLabel.RIGHT);
      la6=new JLabel("전화번호", JLabel.RIGHT);
 
      tf1=new JTextField();
      tf2=new JTextField();
      tf3=new JTextField();
      tf4=new JTextField();
 
      pf1=new JPasswordField();
      pf2=new JPasswordField();
 
      rb1=new JRadioButton("남자");
      rb2=new JRadioButton("여자");
      ButtonGroup gb=new ButtonGroup();
      gb.add(rb1);
      gb.add(rb2);
 
      b1=new JButton("중복체크");
 
      title.setFont(new Font("함초롬돋움", Font.BOLD, 40));//HTML:<h1><b>회원가입</b></h1>
 
      //배치
      setLayout(null);
      title.setBounds(10, 15, 700, 55);
      //추가
      add(title);
 
      la1.setBounds(100, 100, 80, 30);
      tf1.setBounds(185, 100, 200, 30);
      b1.setBounds(390, 100, 150, 30);
      add(la1);
      add(tf1);
      add(b1);
 
      la2.setBounds(100, 135, 80, 30);
      pf1.setBounds(185, 135, 200, 30);
      add(la2);
      add(pf1);
 
      la3.setBounds(100, 170, 80, 30);
      pf2.setBounds(185, 170, 200, 30);
      add(la3);
      add(pf2);
 
      la4.setBounds(100, 205, 80, 30);
      tf2.setBounds(185, 205, 200, 30);
      add(la4);
      add(tf2);
 
      la5.setBounds(100, 240, 80, 30);
      rb1.setBounds(185, 240, 95, 30);
      rb2.setBounds(285, 240, 95, 30);
      add(la5);
      add(rb1);
      add(rb2);
 
      telBox.addItem("010");
      telBox.addItem("011");
      
      la6.setBounds(100, 275, 80, 30);
      telBox.setBounds(185, 275, 100, 30);
      tf3.setBounds(290, 275, 100, 30);
      dash2.setBounds(395, 275, 20, 30);
      tf4.setBounds(420, 275, 100, 30);
      add(la6);add(telBox);add(tf3);add(dash2);add(tf4);
 
      JPanel p2=new JPanel();
      p2.add(b3); p2.add(b4);       
      p2.setBounds(300, 350, 485, 35);
      add(p2);
      
     
      p2.setOpaque(false);
      rb1.setOpaque(false);
      rb2.setOpaque(false);
      
   }
}
