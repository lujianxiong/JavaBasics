package 第3节_AutoCloseable接口;

public class demo1 {
    public static void main(String[] args) throws Exception{
        try(IMessage m = new Message("Daxiong")){
            m.send();    //消息的发送
        }catch (Exception e){

        }
        //m.close();    //关闭连接
    }
}
