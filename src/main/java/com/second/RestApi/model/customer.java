package com.second.RestApi.model;

public class customer {
    private int Cust_Id;
    private String Cust_Name;
    private String Cust_Address;
    private String Cust_PhoneNo;

    public customer() {

    }

    public customer(int Cust_Id, String Cust_Name, String Cust_Address, String Cust_PhoneNo){
        this.Cust_Id = Cust_Id;
        this.Cust_Name = Cust_Name;
        this.Cust_Address = Cust_Address;
        this.Cust_PhoneNo = Cust_PhoneNo;
    }

    public void setCust_Id(int cust_Id) {
        Cust_Id = cust_Id;
    }

    public void setCust_Name(String cust_Name) {
        Cust_Name = cust_Name;
    }
    public void setCust_Address(String cust_Address) {
        Cust_Address = cust_Address;
    }

    public void setCust_PhoneNo(String cust_PhoneNo) {
        Cust_PhoneNo = cust_PhoneNo;
    }



    public String getCust_PhoneNo() {
        return Cust_PhoneNo;
    }
    public String getCust_Address() {
        return Cust_Address;
    }

    public String getCust_Name() {
        return Cust_Name;
    }

    public int getCust_Id() {
        return Cust_Id;
    }
}
