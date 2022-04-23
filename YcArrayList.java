package project8_oop;

public class YcArrayList {

	// ��������
	final int LENGTH = 5;

	// ��ʼ�����飬����Ϊ5
	private int[] array = new int[LENGTH];

	// ������ʶ��������ָ�� ���鵱ǰ�浽�ڼ���Ԫ������
	private int index = 0;

	// ��ȡ�����̬�����ʵ�ʴ��ڵ�Ԫ�ظ���
	public int size() {
		return index;
	}

	// ��ȡ��̬���������
	public int capacity() {
		return array.length;
	}

	// ��
	public void add(int date) {
		if (index >= array.length) {
			System.out.println("��̬������������ʼ�����ݡ�����");
			// �����µ����飬������ԭ���������
			int[] newArray = new int[array.length * 2];
			// ��ԭ��������ݸ��Ƶ���������
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}

		array[index] = date;
		index++;
	}

	// ����indexposition������� �� array������ȡ��Ӧposition�±��ֵ����Ҫע��position��Խ��
	public int get(int position) {
		if (position < 0 || position >= index) {
			System.out.println(position + "Խ�磬û������±ꡣ");
			throw new RuntimeException("�����±�Խ��");
		}
		return array[position];
	}

	// ɾ��ָ��λ��position��Ԫ��
	public int remove(int position) {
		if (position < 0 || position >= index) {
			System.out.println(position + "Խ�磬û������±ꡣ");
			throw new RuntimeException("�����±�Խ��");
		}
		int result = array[position];
		// 1.��position+1�����ֵ������ǰ���ǡ�
		for (int i = position + 1; i < index; i++) {
			array[i - 1] = array[i];
		}
		// 2.index--
		index--;
		return result;
	}

	// ����
	// ��ָ��λ��position��ʼ����һ������y
	public void insert(int position, int[] y) {
		// ���Ҫ���������ĳ��ȣ������ʣ��ĳ��ȳ�����������
		if (array.length - index < y.length) {
			System.out.println("�����ڴ治������ʼ���ݡ�����");
			// �½�һ������newarray[]����С��ԭ���������
			int newarray[] = new int[index + y.length];
			// ��array[]��ֵ����newarray[]
			for (int i = 0; i < array.length; i++) {
				newarray[i] = array[i];
			}
			array = newarray;
		}
		System.out.println("�����ڴ��㹻����ʼ�������顣����");
		// ��ԭ�������±�ӣ�index-1����ʼ�ĺ����Ԫ���Ƶ��±�Ϊ(index+y.length-1)֮��
		int num1 = index - 1;
		int num2 = index + y.length - 1;
		for (int i = 1; i <= index - position; i++) {
			array[num2] = array[num1];
			num1--;
			num2--;
		}
		for (int i = 0; i < y.length; i++) {
			array[position] = y[i];
			position++;
			index++;
		}

	}

	// ��Ƭ ��ָ����position��ʼ����num��Ԫ��
	public int[] slice(int position, int num) {
		int[] cut = new int[num]; // ����������ȥ��Ԫ�ص�����
		int[] result = new int[index - num]; // �������ս��������
		// �ж��Ƿ���position����num��Ԫ��
		if (position >= index) {
			System.out.println("û�дӣ�" + position + "��ʼ��Ԫ�ء�������");
		}
		if (num > index) {
			System.out.println("û��" + num + "��Ԫ�ؿ����С�����");
		}
		// ���ձ���ȥ������
		int x = 0;
		int y=0;
		int z=0;
		/*if (num == index - position) {
			for (int i = position - 1; i <= position + num - 1; i++) {
				cut[x] = array[i];
				x++;
				index--;
				System.out.println("����ȥ������Ϊ��");
				for(int j=0;j<=cut.length;i++) {
					System.out.print(cut[i]+"\t");
				}
			}
		}else {
			for (int i = position; i < position + num ; i++) {
				cut[y] = array[i];
				y++;
				index--;
				System.out.println("����ȥ������Ϊ��");
				for(int j=0;j<cut.length;j++) {
					System.out.print(cut[j]+"\t");
				}
			}*/
			for(int r=0;r<=position-1;r++) {
				result[z]=array[r];
				z++;
			}
			for(int k=position+num;k<array.length;k++) {
				result[z]=array[k];
				z++;
			}
		//}
		return result;
	}

}
