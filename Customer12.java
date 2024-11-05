// Source code is decompiled from a .class file using FernFlower decompiler.
class Customer12 {
    private int cId;
    private String cName;
    private String cEmail;
    private int phone;
    private String password;

    Customer12() {
    }

    public void setCustomerDetails(int var1, String var2, String var3, int var4, String var5) {
        this.cId = var1;
        this.cName = var2;
        this.cEmail = var3;
        this.phone = var4;
        this.password = var5;
    }

    public int getcId() {
        return this.cId;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPhone() {
        return this.phone;
    }

    public String getcEmail() {
        return this.cEmail;
    }

    public String getcName() {
        return this.cName;
    }
}
