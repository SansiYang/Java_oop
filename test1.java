package project9;

public class test1 {

	public static void main(String[] args) {
		//�������صĲ���
		//��ͬһ�������ж����������
		//1.������ͬ
		//2.�����ββ�ͬ(���� �����ͣ�˳��)
		
		
		//�������������ֵ
		int a=max(1,2);
		System.out.println(a);
		
		double b=max(1.2,1.34);
		System.out.println(b);
		
		//һ��int��һ��double��
		double c=max(12,1.2);
		System.out.println(c);  //�õ���duble�͵ĺ�����int����ʽת��Ϊdouble��
		
		//println������͵����أ�ʲô���͵����ݶ��������
		
		int []x=new int[] {1,2,3};
		System.out.println(max(x));
		
		System.out.println(max(1.2f,2));//�� f ��ʾ��ǰ�� 1.2 ��һ��float���ͣ�����ƥ�䷽�� max(float x,int y);
		System.out.println(max(1,2.1f));//�� f ��ʾ��ǰ�� 2.1 ��һ��float���ͣ�����ƥ�䷽�� max(int x,float y);

	}
	
	public static double max(int x,float y) {
		System.out.print("����õ���"+"int x,float y");
		return x>y?x:y;
	}
	public static double max(float x,int y) {
		return x>y?x:y;
	}
	
	//�������壺  Ȩ��  ����ֵ����  ���������β��б�
	public static int max(int x,int y) {
		return x>y?x:y;
	}
	
	public static double max(double x,double y) {
		return x>y?x:y;
	}
	
	public static int max(int[]arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
