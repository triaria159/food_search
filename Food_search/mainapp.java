package Food_search;
import java.sql.*;
import java.awt.*;
public class mainapp {
	public static void main(String[] args) {
		
		boolean login = true;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Client_frame fra = new Client_frame();
					Food_GUI frame = new Food_GUI();
					
					fra.setVisible(login);
					frame.setVisible(false);
					
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
