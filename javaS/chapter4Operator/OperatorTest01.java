/*
	�����
	����java����������֮�����������
		+	���
		-	���
		*	�˻�
		/	��
		%	��������ȡģ��
		
		++	�Լ�1
		--	�Լ�1
		
	ע�⣺һ�����ʽ�����ж�������������������ȼ�����ȷ���ļ�С���ţ����ȼ��õ�������
			û�б�Ҫȥר�ż�������������ȼ���
*/
public class OperatorTest01{
	public static void main(String[] args){
		System.out.println("ceshi");
		
		int i = 10;
		int j = 3;
		
		System.out.println(i + j); // 13;
		System.out.println(i - j); //7
		System.out.println(i * j); //30
		System.out.println(i / j); //3
		System.out.println(i % j); //1
		
		//����һ������k �����Ҹ�ֵ�Լ�1��
		int k =10;
		
		//++ ��������Գ����ڱ������桾��Ŀ�������
		k ++;
		
		//��ӡ����k
		System.out.println("++�ں������������" + k); //11
		
		//����++�����ڱ���ǰ����ӡ����y
		int y = 10;
		++ y ;
		System.out.println("++��ǰ�����������" + y);
		
		//С�᣺
		//		++��������Գ����ڱ���ǰ��Ҳ���Գ����ڱ����������Ǳ���ǰ���Ǳ�����ֻҪ++���������
		//		�ñ�����ֵһ�����Լ�1��
		
		//++ �����ڱ�����
		// ����������ֵ���㣬�ٶԱ����б����ֵ�Լ�1��
		int a = 100;
		int b = a ++;
		System.out.println("��++�����ڱ�����--");
		System.out.println("����ı���a��ֵ�ǣ�" + a); //101 
		System.out.println("����ı���b��ֵ�ǣ�" + b); //100
		
		//++ �����ڱ���ǰ
		//�����Ƚ����Լ�1���㣬Ȼ���ٽ��и�ֵ������
		int c = 100;
		int d = ++ c ;
		
		System.out.println("��++�����ڱ���ǰ--");
		System.out.println("����ı���c��ֵ�ǣ�" + c); // 101
		System.out.println("����ı���d��ֵ�ǣ�" + d); // 101
		
		int xx =500;
		System.out.println(xx);
		
		int e = 100;
		System.out.println(e ++); // 100
		System.out.println(e); // 101
		
		int s = 100;
		System.out.println(++ s); //101
		System.out.println(s);    //101
		
		System.out.println("-------------------------------");
		
		
		
		System.out.println("��һ����" + -- s); //100 ;
		System.out.println("�ڶ�����" + s ++); // 100
		System.out.println("��������" + s --); // 
		System.out.println("���ĸ���" + s --); //
		System.out.println("�������" + s --); //
		System.out.println("��������" + s);
		
	}
}