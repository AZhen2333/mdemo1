package cn.quancheng.mdemo1.model;

public class Customer {
    private int id;
    private String name; // 用户名称
    private String tontact; // 联系人
    private String telephone; // 电话号码
    private String email; // 邮箱
    private String remark; // 备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTontact() {
        return tontact;
    }

    public void setTontact(String tontact) {
        this.tontact = tontact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
