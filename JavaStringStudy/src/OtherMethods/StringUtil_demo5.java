package OtherMethods;
//ʵ������ĸ��д�����ࣨʹ�ø���String�෽����
//�˴������պ�ʵ�ʿ����бض�Ҫʹ�õĳ���
public class StringUtil_demo5 {
	public static String initcap(String str){
		//static����ķ�������ͨ������ֱ�ӵ��ã�����ʵ��������
		if(str == null ||"".equals(str)){
			return str;
		}
		if(str.length() == 1){ //ע��������length()
			return str.toUpperCase();
		}
		return str.substring(0, 1).toUpperCase()+str.substring(1);
	}

}
