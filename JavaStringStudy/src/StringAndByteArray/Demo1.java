package StringAndByteArray;
//��ʮ�ڣ��ַ������ֽ�����
public class Demo1 {
	public static void main(String[] args) {
		String str = "helloworld";
		//ʹ����ͨ������getBytes()���ַ���ת��Ϊ�ֽ�����
		byte data[] = str.getBytes();
		for(int i=0;i<data.length;i++){
			data[i]-=32;
		}
		System.out.println(new String(data));
		System.out.println(new String(data,0,5));
	}

}
