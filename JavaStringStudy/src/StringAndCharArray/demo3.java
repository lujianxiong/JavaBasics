package StringAndCharArray;
//�ھŽڣ��ַ������ַ����飺�ж�ĳһ���ַ����е������Ƿ�ȫ�����������
public class demo3 {
	public static void main(String[] args) {
		String str = "heloworld";
		System.out.println(isNumber(str)? str+"���������":str+"�������������");
		System.out.println(isNumber("123")? "123"+"���������":"123"+"�������������");

	}

	//�ж��ַ����Ƿ������������
	public static boolean isNumber(String str){
		//is��ͷ�ķ����������صĶ���boolֵ
		char[] result = str.toCharArray(); //���ַ�����Ϊ�ַ�����
		for(int i =0;i<result.length;i++){//�����ж�
			//����ǵ�����,��Ϊ�ǵ����ַ�
			if(result[i]<'0' || result[i]>'9'){
				return false;
			}
		}
		return true;
		
	}
}
