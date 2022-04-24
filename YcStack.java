package project9;



public class YcStack {
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

	//�棺ֻ�ܴ浽ջ�����
	public void push(int date) {
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
	
	//ȡ����ջ��ȡ
	public int pop() {
		if(index==0) {
			throw new RuntimeException("��ջ��");
		}
		index=index-1;
		return array[index];
	}
	
	//͵������ȡջ����ֵ
	public int peek() {
		if(index==0) {
			throw new RuntimeException("��ջ��");
			
		}
		return array[index-1];
	}

}
