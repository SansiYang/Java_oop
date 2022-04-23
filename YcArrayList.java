package project8_oop;

public class YcArrayList {

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

	// 存
	public void add(int date) {
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

	// 根据indexposition这个索引 到 array数组中取对应position下标的值，但要注意position不越界
	public int get(int position) {
		if (position < 0 || position >= index) {
			System.out.println(position + "越界，没有这个下标。");
			throw new RuntimeException("数组下标越界");
		}
		return array[position];
	}

	// 删除指定位置position的元素
	public int remove(int position) {
		if (position < 0 || position >= index) {
			System.out.println(position + "越界，没有这个下标。");
			throw new RuntimeException("数组下标越界");
		}
		int result = array[position];
		// 1.将position+1后面的值依次向前覆盖。
		for (int i = position + 1; i < index; i++) {
			array[i - 1] = array[i];
		}
		// 2.index--
		index--;
		return result;
	}

	// 需求：
	// 在指定位置position开始插入一个数组y
	public void insert(int position, int[] y) {
		// 检测要插入的数组的长度，如果比剩余的长度长就扩充数组
		if (array.length - index < y.length) {
			System.out.println("数组内存不够，开始扩容。。。");
			// 新建一个数组newarray[]，大小是原数组的两倍
			int newarray[] = new int[index + y.length];
			// 将array[]的值赋给newarray[]
			for (int i = 0; i < array.length; i++) {
				newarray[i] = array[i];
			}
			array = newarray;
		}
		System.out.println("数组内存足够，开始插入数组。。。");
		// 将原数组中下标从（index-1）开始的后面的元素移到下标为(index+y.length-1)之后
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

	// 切片 从指定的position开始，切num个元素
	public int[] slice(int position, int num) {
		int[] cut = new int[num]; // 用来接收切去的元素的数组
		int[] result = new int[index - num]; // 用来接收结果的数组
		// 判断是否有position或者num个元素
		if (position >= index) {
			System.out.println("没有从：" + position + "开始的元素。。。。");
		}
		if (num > index) {
			System.out.println("没有" + num + "个元素可以切。。。");
		}
		// 接收被切去的数组
		int x = 0;
		int y=0;
		int z=0;
		/*if (num == index - position) {
			for (int i = position - 1; i <= position + num - 1; i++) {
				cut[x] = array[i];
				x++;
				index--;
				System.out.println("被切去的数组为：");
				for(int j=0;j<=cut.length;i++) {
					System.out.print(cut[i]+"\t");
				}
			}
		}else {
			for (int i = position; i < position + num ; i++) {
				cut[y] = array[i];
				y++;
				index--;
				System.out.println("被切去的数组为：");
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
