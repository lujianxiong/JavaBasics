package �ַ���ͳ��;
//�ڶ�ʮ���� �ַ���ͳ�ƣ�
//�������Ľṹ�����
//ͳ����ĸn��o�ĸ���
public class StringCount extends StringUtil{
	private int ncount;
	private int ocount;
	
	public StringCount(String content){
		super(content);
		this.countChar();   //���췽��ͳ��
	}
	public void countChar(){
		char[] data = super.getContent().toCharArray();   //���ø����content
		for(int x=0;x<data.length;x++){
			if(data[x] == 'n'|| data[x] == 'N'){
				this.ncount++;
			}
			if(data[x] == 'o'|| data[x] == 'O'){
				this.ocount++;
			}
		}
	}
	public int getNCount(){
		return this.ncount;
	}
	public int getOCount(){
		return this.ocount;
	}
	public String getInfo(){
		return "��ĸn�ĸ�����"+this.ncount+"����ĸo�ĸ�����"+this.ocount;
	}
}
