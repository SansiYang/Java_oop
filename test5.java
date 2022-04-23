package project8_oop;

public class test5 {

	public static void main(String[] args) {
		// 数组 ：顺序结构 元素类型相同
		// 数组长度确定后不能更改
		int[] x = new int[10];
		int[] y = new int[] { 1, 2 };

		YcArrayList yal = new YcArrayList();

		for (int i = 0; i < 5; i++) {
			yal.add(i + 100);
		}

		// yal.add(999);
		// yal.add(9999);

		// 输出动态数组中的每个元素
		for (int i = 0; i < yal.size(); i++) {
			System.out.println(yal.get(i));
		}
		/*
		 * int result=yal.remove(1); System.out.println("删除了："+result); for(int
		 * i=0;i<yal.size();i++) { System.out.println(yal.get(i)); }
		 * System.out.println("删除后，动态数组的长度为："+yal.size()+"，容量"+yal.capacity());
		 */

		// yal.insert(4,y);
		int[] h = yal.slice(1, 2);

		for (int i = 0; i < yal.size(); i++) {
			System.out.print(yal.get(i) + "\t");
		}
		System.out.println();
		for (int i = 0; i < h.length; i++) {
			System.out.print(h[i] + "\t");
		}
		System.out.println();
		System.out.println(yal.size());
		System.out.println(yal.capacity());

	}

}
