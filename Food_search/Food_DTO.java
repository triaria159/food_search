package Food_search;


public class Food_DTO {
	private String NAME;
	private String SID;
	private String NUMBER;
	private String ADDRESS;
	private String DISTANCE;
	private String MAIN;
	private String UID;
	private String NICKNAME;
	private int PRICE;
	private int POINT;
	private int GENDER;
	private int TYPE;
	private double SUM;
	
	public Food_DTO() {
		
	}
	
	public Food_DTO(String NAME, String SID, String NUMBER, String ADDRESS, String DISTANCE, String MAIN, String UID, String NICKNAME, 
			int PRICE, int POINT, int GENDER, int TYPE, double SUM) {
		super();
		this.NAME = NAME;
		this.NUMBER = NUMBER;
		this.ADDRESS = ADDRESS;
		this.DISTANCE = DISTANCE;
		this.MAIN = MAIN;
		this.PRICE = PRICE;
		this.POINT = POINT;
		this.UID = UID;
		this.GENDER = GENDER;
		this.NICKNAME = NICKNAME;
		this.SUM = SUM;
	}
	
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}
	
	public String getSID() {
		return SID;
	}
	public void setSID(String SID) {
		this.SID = SID;
	}
	
	public String getNUMBER() {
		return NUMBER;
	}
	public void setNUMBER(String NUMBER) {
		this.NAME = NUMBER;
	}
	
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String ADDRESS) {
		this.ADDRESS = ADDRESS;
	}
	
	public String getDISTANCE() {
		return DISTANCE;
	}
	public void setDISTANCE(String DISTANCE) {
		this.DISTANCE = DISTANCE;
	}
	
	public String getMAIN() {
		return MAIN;
	}
	public void setMAIN(String MAIN) {
		this.MAIN = MAIN;
	}
	
	public String getUID() {
		return UID;
	}
	public void setUID(String UID) {
		this.UID = UID;
	}
	
	public String getNICKNAME() {
		return NICKNAME;
	}
	public void setNICKNAME(String NICKNAME) {
		this.NICKNAME = NICKNAME;
	}
	
	public int getPRICE() {
		return PRICE;
	}
	public void setPRICE(int PRICE) {
		this.PRICE = PRICE;
	}
	
	public int getPOINT() {
		return POINT;
	}
	public void setPOINT(int POINT) {
		this.POINT = POINT;
	}
	
	public int getGENDER() {
		return GENDER;
	}
	public void setGENDER(int GENDER) {
		this.GENDER = GENDER;
	}
	
	public int getTYPE() {
		return TYPE;
	}
	public void setTYPE(int TYPE) {
		this.TYPE = TYPE;
	}
	
	public double getSUM() {
		return SUM;
	}
	public void setSUM(double SUM) {
		this.SUM = SUM;
	}
}
