class RangeByte 
{
	public static void main(String[] args) 
	{
		//1byte�� 8bit�� �����ȴ�
		//1bit�� ǥ���� �� �ִ� ���� ������ 0,1 �� �����̴�
		//2bit�� �ִٸ�
		//     0 0        0
		//     0 1        1
		//     1 0        2
		//     1 1        3

		//1byte(8���� bit)�߿� �� ���ʿ� �ִ� bit�� �������� �������
		//�Ǻ��ϴ� ��ȣ��Ʈ�� ����ϰ�
		//������ 7���� ��Ʈ�� ���ڸ� ǥ���Ѵ�
		//���� ǥ���� �� �ִ� ���� ������ ������ ����
		//���� 2�� 7��~ ��� 2�� 7��-1���� ǥ�� ����(-128~127)

		byte data;
        data= -128;
			System.out.println(data);
		data=(byte)(data-1);//underflow
		System.out.println(data);

		/*data=127;
		System.out.println(data);
		data=(byte)(data+1);//overflow
		System.out.println(data);*/
	}
}
/*
C:\javaStudy\day0928>java RangeByte
127
-128--> �̷��� �귯���ļ� �����ϰ� ���� ���� ���� ������ ���� ����
'�����÷ο�'(overflow)��� �θ���

*/