package SubString;
//��ʮ��� �ַ����Ľ�ȡ��
//�۲��ַ����Ľ�ȡ
public class Stringdemo2 {
	public static void main(String[] args) {
		//�ַ����ṹ�����û�id-photo-����.��׺��
		//����ʵ�ַ����ַ����е������ṹ��
		String str = "amdin-photo-Da_xiong.jpg";
		int beginIndex = str.indexOf("-", str.indexOf("photo"))+1;
		int endIndex = str.lastIndexOf(".");
		System.out.println(str.substring(beginIndex, endIndex));
	}

}
