package com.johnmelodyme.ssd;

/*JOHN MELODY MELISSA*/

public class Data {
    private String productsserialnumber;
    private String clientname;
    private String clientphonenumber;
    private String agentname;
    private String agentphonenumber;
    private String purchasedate;

    public Data() {
    }

    public Data(String productsserialnumber, String clientname, String clientphonenumber,  String agentname, String agentphonenumber , String purchasedate) {
        this.productsserialnumber = productsserialnumber;
        this.clientname = clientname;
        this.clientphonenumber = clientphonenumber;
        this.agentname = agentname;
        this.agentphonenumber = agentphonenumber;
        this.purchasedate = purchasedate;
    }

    public String getProductsserialnumber() {
        return productsserialnumber;
    }

    public void setProductsserialnumber(String productsserialnumber) {
        this.productsserialnumber = productsserialnumber;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getClientphonenumber() {
        return clientphonenumber;
    }

    public void setClientphonenumber(String clientphonenumber) {
        this.clientphonenumber = clientphonenumber;
    }


    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public String getAgentphonenumber() {
        return agentphonenumber;
    }

    public void setAgentphonenumber(String agentphonenumber) {
        this.agentphonenumber = agentphonenumber;
    }

    public String getPurchasedate(){
        return purchasedate;
    }

    public void setPurchasedate(String purchasedate){
        this.purchasedate = purchasedate;
    }
}

