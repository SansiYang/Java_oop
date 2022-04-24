package project9;

public class Product {
	private int id;
	private String name;
	private double price;
	private int num;
	
	
	public Product(int id, String name, double price, int num) {
		super();
		//this.idָ���� Product �����е� id ���ԣ��ұߵ� id ��ָ���췽���е��β�id�������������
		this.id = id;
		this.name = name;
		this.price = price;
		this.num = num;
	}


	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//�޲εĹ��췽��Ҫ�Լ�д
	public Product() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	

}
