package MappingTransformation2;
//�ӷ�����Ϣ
public class SubItem {
	private long sid;
	private String title;
	private Item item;
	
	public SubItem(long sid,String title){
		this.sid=sid;
		this.title=title;
	}
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getInfo(){
		return "��������Ϣ��iid:"+this.sid+"��title:"+this.title;
	}
}
