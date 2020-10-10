package 第24节_UUID类无重复数据;

import java.util.UUID;

public class demo1 {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());   //其实这种直接输出都是默认调用了toString方法
        UUID uuid = UUID.randomUUID();   //UUID.UUIDrandom返回的一定是UUID对象，只有调用toString方法才能正常输出
        System.out.println(uuid.toString());

    }
}
