package Food_search;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class Food_GUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JPanel contentPane;
	
	private JTextField S_IDTF;
	private JTextField U_IDTF;
	private JTextField NAMETF;
	private JTextField NUMBERTF;
	private JTextField ADDRESSTF;
	private JTextField DISTANCETF;
	private JTextField PRICETF;
	private JTextField MAINTF;
	private JTextField POINTTF;
	private JTextField TYPETF;
	private JTextField NICKNAMETF;
	private JTextField GENDERTF;
	private JTextField PASSWORDTF;
	
	JButton cancelButton,searchButton, setButton, Pr_sortButton, P_sortButton, insertButton, deleteButton, updateButton;
	
	
	public Food_GUI() {
		setResizable(false);
		setTitle("\uB9DB\uC9D1 \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] columnNames={"이름", "주소", "거리", "전화번호", "평점", "메뉴", "가격"};
		String[][] rowData={};
		
		DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames);
		table=new JTable(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"\uC774\uB984",  "\uC8FC\uC18C", "\uAC70\uB9AC","\uC804\uD654\uBC88\uD638", "\ud3c9\uc810" , "\uba54\ub274", "\uac00\uaca9"
				}
			));
		table.setShowGrid(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setCellRenderer(dtcr);  
		tcm.getColumn(1).setCellRenderer(dtcr);  
		tcm.getColumn(2).setCellRenderer(dtcr);  
	    tcm.getColumn(3).setCellRenderer(dtcr);
	    tcm.getColumn(4).setCellRenderer(dtcr);
	    tcm.getColumn(5).setCellRenderer(dtcr);
	    tcm.getColumn(6).setCellRenderer(dtcr);
		
	    JScrollPane pane_table=new JScrollPane(table);
		pane_table.setSize(571, 252);
		pane_table.setLocation(206, 86);
		table.setBounds(200, 96, 554, 228);
		
		getContentPane().add(pane_table, BorderLayout.CENTER);
			
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 5, 755, 383);
		contentPane.add(panel_2);
		
		cancelButton = new JButton("\ub9e4\uc7a5\uac80\uc0c9");
		cancelButton.setBounds(10, 10, 90, 30);
		cancelButton.setFont(new Font("굴림", Font.PLAIN, 13));
		panel_2.setLayout(null);
		panel_2.add(cancelButton);
		
		setButton = new JButton("\uc124\uc815");
		setButton.setBounds(110, 10, 90, 30);
		setButton.setFont(new Font("굴림", Font.PLAIN, 13));
		panel_2.setLayout(null);
		panel_2.add(setButton);
		
		Pr_sortButton = new JButton("\uac00\uaca9\u2193");
		Pr_sortButton.setBounds(580, 40, 75, 30);
		Pr_sortButton.setFont(new Font("굴림", Font.PLAIN, 13));
		panel_2.setLayout(null);
		panel_2.add(Pr_sortButton);
		
		P_sortButton = new JButton("\ud3c9\uc810\u2193");
		P_sortButton.setBounds(670, 40, 75, 30);
		P_sortButton.setFont(new Font("굴림", Font.PLAIN, 13));
		panel_2.setLayout(null);
		panel_2.add(P_sortButton);
		
		searchButton = new JButton("\uac80\uc0c9");
		searchButton.setBounds(50, 300, 90, 30);
		searchButton.setFont(new Font("굴림", Font.PLAIN, 13));
		panel_2.setLayout(null);
		panel_2.add(searchButton);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 201, 383);
		panel_2.add(panel);
		
		JLabel nameLabel = new JLabel("\uC774\uB984");
		nameLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		nameLabel.setBounds(11, 94, 57, 15);
		panel.add(nameLabel);
		
		JLabel numberLabel = new JLabel("\uac00\uaca9");
		numberLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		numberLabel.setBounds(11, 134, 57, 15);
		panel.add(numberLabel);
		
		JLabel addressLabel = new JLabel("\uC8FC\uC18C");
		addressLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		addressLabel.setBounds(11, 174, 57, 15);
		panel.add(addressLabel);
		
		JLabel distanceLabel = new JLabel("\uAC70\uB9AC");
		distanceLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		distanceLabel.setBounds(11, 214, 57, 15);
		panel.add(distanceLabel);
		
		NAMETF = new JTextField();
		NAMETF.setColumns(10);
		NAMETF.setBounds(62, 90, 116, 21);
		panel.add(NAMETF);
		
		NUMBERTF = new JTextField();
		NUMBERTF.setColumns(10);
		NUMBERTF.setBounds(62, 130, 116, 21);
		panel.add(NUMBERTF);
		
		ADDRESSTF = new JTextField();
		ADDRESSTF.setColumns(10);
		ADDRESSTF.setBounds(62, 170, 116, 21);
		panel.add(ADDRESSTF);
		
		DISTANCETF = new JTextField();
		DISTANCETF.setColumns(10);
		DISTANCETF.setBounds(62, 210, 116, 21);
		panel.add(DISTANCETF);
		
		setButton.addActionListener(this);
		searchButton.addActionListener(this);
		Pr_sortButton.addActionListener(this);
		cancelButton.addActionListener(this);
		P_sortButton.addActionListener(this);
		
		displayAllStore(0,null);
	}
	

	public void displayAllStore(int mode, String temp) {
		List<Food_DTO> searchList=null;
		if(mode == 0) {
			searchList=Food_DAO.getDAO().selectAllStoreList();
		} else if(mode==1) {
			searchList=Food_DAO.getDAO().selectNamesearch(temp);
		} else  if(mode==2) {
			searchList=Food_DAO.getDAO().selectDistancesearchList(temp);
		}
		
		if (searchList.isEmpty()) {
			JOptionPane.showMessageDialog(this, "저장된 맛집정보가 없습니다.");
			return;
		}
		
		DefaultTableModel model=(DefaultTableModel)table.getModel(); 
		
		for (int i = model.getRowCount(); i >0; i--) {
			model.removeRow(0);
		}	
		
		for(Food_DTO storemanage:searchList) {
			Vector<Object> rowData=new Vector<Object>();
			rowData.add(storemanage.getNAME());
			rowData.add(storemanage.getADDRESS());
			rowData.add(storemanage.getDISTANCE());
			rowData.add(storemanage.getNUMBER());
			rowData.add(storemanage.getMAIN());
			rowData.add(storemanage.getPRICE());
			rowData.add(storemanage.getSUM());
			model.addRow(rowData);
		}
	}
	
	public void createSTORE() throws SQLException {
		String name=NAMETF.getText(); 
		
		if (name.equals("")) { 
			JOptionPane.showMessageDialog(this, "이름을 반드시 입력해 주세요");
			NAMETF.requestFocus();
			return;
		}
		
		String nameReg="[가-힣]{2,7}";//정규표현식
		if(!Pattern.matches(nameReg, name)) {
			JOptionPane.showMessageDialog(this, "이름은 2~5 범위의 한글만 입력해 주세요.");
			NAMETF.requestFocus();
			return;
		}
		
		String NUMBER=NUMBERTF.getText();
		
		if (NUMBER.equals("")) {
			JOptionPane.showMessageDialog(this, "전화번호를 반드시 입력해 주세요");
			NUMBERTF.requestFocus();
			return;
		}
		
		String NUMBERReg="\\d{2,3}-\\d{3,4}-\\d{4}";
		if(!Pattern.matches(NUMBERReg, NUMBER)) {
			JOptionPane.showMessageDialog(this, "전화번호를 형식에 맞게 입력해 주세요.");
			NUMBERTF.requestFocus();
			return;
		}
		
		String distance=DISTANCETF.getText();
		
		if (distance.equals("")) {
			JOptionPane.showMessageDialog(this, "거리를 반드시 입력해 주세요");
			DISTANCETF.requestFocus();
			return;
		}
		
		String address=ADDRESSTF.getText(); //유효성 검사 안해줘도 있어야 함 
		String main=MAINTF.getText();
		if (main.equals("")) {
			JOptionPane.showMessageDialog(this, "메뉴를 반드시 입력해 주세요");
			MAINTF.requestFocus();
			return;
		}
		
		
		Food_DTO CRE=new Food_DTO();
		CRE.setNAME(name);
		CRE.setADDRESS(address);
		CRE.setDISTANCE(distance);
		CRE.setNUMBER(NUMBER);
		CRE.setMAIN(main);
		
		
		int rows=Food_DAO.getDAO().insertINFO(CRE);
		
		JOptionPane.showMessageDialog(this, rows+"개의 맛집 정보를 저장하였습니다.");
		
		displayAllStore(0,null);
		//initDisplay();
		
	}
	
	public void deleteSTORE() throws SQLException {
		String sid=S_IDTF.getText(); 
		
		if (sid.equals("")) {
			JOptionPane.showMessageDialog(this, "이름을 반드시 입력해 주세요");
			S_IDTF.requestFocus();
			return;
		}
				
		int rows=Food_DAO.getDAO().deleteINFO(sid);
		
		if(rows>0) {
			JOptionPane.showMessageDialog(this,rows+"개의 맛집정보를 삭제하였습니다.");
			displayAllStore(0,null);
		} else {
			JOptionPane.showMessageDialog(this, "삭제하고자 하는 이름의 맛집정보가 없습니다.");
		}
		
	}
	
	public void updateSTORE() throws SQLException {
		
		String name=NAMETF.getText();
		
		if(name.equals("")) {
			JOptionPane.showMessageDialog(this, "이름을 반드시 입력해 주세요.");
			NAMETF.requestFocus();
			return;
		}
		
		String nameReg="[가-힣]{2,7}";
		if(!Pattern.matches(nameReg, name)) {
			JOptionPane.showMessageDialog(this, "이름은 2~5 범위의 한글만 입력해 주세요.");
			NAMETF.requestFocus();
			return;
		}
		
		String number=NUMBERTF.getText();
		
		if(number.equals("")) {
			JOptionPane.showMessageDialog(this, "전화번호를 반드시 입력해 주세요.");
			NUMBERTF.requestFocus();
			return;
		}
		
		String numberReg="\\d{2,3}-\\d{3,4}-\\d{4}"; 
		if(!Pattern.matches(numberReg, number)) {
			JOptionPane.showMessageDialog(this, "전화번호를 형식에 맞게 입력해 주세요.");
			NUMBERTF.requestFocus();
			return;
		}
		
		String address=ADDRESSTF.getText();
		
		if(address.equals("")) {//입력값이 없는 경우
			JOptionPane.showMessageDialog(this, "주소를 반드시 입력해 주세요.");
			ADDRESSTF.requestFocus();//입력촛점을 이동하는 메소드
			return;
		}
		
		String distance=DISTANCETF.getText();
		
		if (distance.equals("")) {
			JOptionPane.showMessageDialog(this, "거리를 반드시 입력해 주세요");
			DISTANCETF.requestFocus();
			return;
		}
		
		String main=MAINTF.getText();
		if (main.equals("")) {
			JOptionPane.showMessageDialog(this, "메뉴를 반드시 입력해 주세요");
			MAINTF.requestFocus();
			return;
		}
		
		//DTO 인스턴스를 생성하고 컴퍼넌트의 입력값으로 필드값 변경
		Food_DTO lunchmanage = new Food_DTO();
		lunchmanage.setNAME(name);
		lunchmanage.setADDRESS(address);
		lunchmanage.setDISTANCE(distance);
		lunchmanage.setNUMBER(number);
		lunchmanage.setMAIN(main);
		
		//학생정보를 전달하여 STUDENT 테이블에 저장된 기존 학생정보를 변경하는 DAO 클래스의
		//메소드 호출
		int rows=Food_DAO.getDAO().updateINFO(lunchmanage);
		
		JOptionPane.showMessageDialog(this, rows+"명의 학생정보를 변경 하였습니다.");
		
		displayAllStore(0,null);
		//initDisplay();
	}
	
	public void actionPerformed(ActionEvent ev) {
		// 메소드 호출 
		Component c = (Component) ev.getSource();
		if (c == insertButton) {
			try {
				createSTORE();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (c == deleteButton) {
			try {
				deleteSTORE();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (c == updateButton ) {
			try {
				updateSTORE();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (c == cancelButton) {
			String name=NAMETF.getText();
			String distance=DISTANCETF.getText();
			
			if(!name.equals("")) {
				NAMETF.setText("");
				displayAllStore(1,name);

			} else if(!distance.equals("")) {
				DISTANCETF.setText("");
				displayAllStore(2,distance);

			} else {
				displayAllStore(0,null);
			}
		}	
	}
}
