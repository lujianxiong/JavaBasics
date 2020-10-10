package 第11_12_13_14节_综合案例一_反射与简单Java类;

import java.util.Date;
//公司类
public class Company {
    private String name;
    private Date createdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
