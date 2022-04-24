package project9;

public class test2_Product {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.setId(1);
		System.out.print(p1.getId());
		p1.setName("²æ×Ó");
		System.out.println(p1.getName());

		Product p2=new Product(2,"µ¶×Ó"	,12);
		System.out.print(p2.getId());
		System.out.println(p2.getName());
	}

}
