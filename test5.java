package project8_oop;

public class test5 {

	public static void main(String[] args) {
		// ���� ��˳��ṹ Ԫ��������ͬ
		// ���鳤��ȷ�����ܸ���
		int[] x = new int[10];
		int[] y = new int[] { 1, 2 };

		YcArrayList yal = new YcArrayList();

		for (int i = 0; i < 5; i++) {
			yal.add(i + 100);
		}

		// yal.add(999);
		// yal.add(9999);

		// �����̬�����е�ÿ��Ԫ��
		for (int i = 0; i < yal.size(); i++) {
			System.out.println(yal.get(i));
		}
		/*
		 * int result=yal.remove(1); System.out.println("ɾ���ˣ�"+result); for(int
		 * i=0;i<yal.size();i++) { System.out.println(yal.get(i)); }
		 * System.out.println("ɾ���󣬶�̬����ĳ���Ϊ��"+yal.size()+"������"+yal.capacity());
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
