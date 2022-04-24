package project9;



public class YcStack {
	// 常量变量
		final int LENGTH = 5;

		// 初始化数组，长度为5
		private int[] array = new int[LENGTH];

		// 索引标识，它用于指定 数组当前存到第几个元素上了
		private int index = 0;

		// 获取这个动态数组的实际存在的元素个数
		public int size() {
			return index;
		}

		// 获取动态数组的容量
		public int capacity() {
			return array.length;
		}

	//存：只能存到栈的最后
	public void push(int date) {
		if (index >= array.length) {
			System.out.println("动态数组已满，开始自扩容。。。");
			// 产生新的数组，长度是原数组的两倍
			int[] newArray = new int[array.length * 2];
			// 将原数组的数据复制到新数组中
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}

		array[index] = date;
		index++;
	}
	
	//取：从栈顶取
	public int pop() {
		if(index==0) {
			throw new RuntimeException("空栈！");
		}
		index=index-1;
		return array[index];
	}
	
	//偷看：获取栈顶的值
	public int peek() {
		if(index==0) {
			throw new RuntimeException("空栈！");
			
		}
		return array[index-1];
	}

}
