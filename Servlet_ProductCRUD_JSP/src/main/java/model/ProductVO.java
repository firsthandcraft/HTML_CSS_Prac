package model;
/* create table p_PRODUCT(
 * pno number primary key not null,
 * pname varchar2(20) not null,
 * pmaker varchar2(20) not null,
 * pprice varchar2(20) not null,
 * pdetail varchar2(2000) 
 * )
 * 
 * create sequence s_pno nocache;
 * 
 *  select * from p_PRODUCT;
 * */
public class ProductVO {
	private int pno;
	private String pname;
	private String pmaker;
	private String pprice;
	private String pdetail;
	
	//생성자 = 초기화 역할
	//매개변수 에 맞게 할당해야한다. 
	// 하나라도 공백이 있으면 에러 남
	// 공백이 생길때 \
	//해당하는 생성자에 맞게 생성하기 위해 
	// 필수 상세 ,선택, 입력란에 맞게 넘기기 위해 
	//생성자 overloading
	
	//전부
	public ProductVO(int pno, String pname, String pmaker, String pprice, String pdetail) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pmaker = pmaker;
		this.pprice = pprice;
		this.pdetail = pdetail;
	}
	
	//pprice pdetail 뺀것 
	public ProductVO(int pno, String pname, String pmaker) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pmaker = pmaker;
	}
	
	//pno뺀것
	public ProductVO(String pname, String pmaker, String pprice, String pdetail) {
		super();
		this.pname = pname;
		this.pmaker = pmaker;
		this.pprice = pprice;
		this.pdetail = pdetail;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPmaker() {
		return pmaker;
	}

	public void setPmaker(String pmaker) {
		this.pmaker = pmaker;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public String getPdetail() {
		return pdetail;
	}

	public void setPdetail(String pdetail) {
		this.pdetail = pdetail;
	}

	@Override
	public String toString() {
		return "ProductVO [pno=" + pno + ", pname=" + pname + ", pmaker=" + pmaker + ", pprice=" + pprice + ", pdetail="
				+ pdetail + "]";
	}
	
	
}
