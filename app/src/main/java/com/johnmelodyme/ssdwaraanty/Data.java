package com.johnmelodyme.ssdwaraanty;

public class Data {
    String productsserialnumber;
    String clientname;
    String clientphonenumber;
    String purchasedate;
    String agentname;
    String agentphonenumber;

    public Data(String serial){
    }

    // CONSTRUCTORS ::
    public Data(String productsserialnumber,
                String clientname,
                String clientphonenumber,
                String purchasedate,
                String agentname,
                String agentphonenumber) {
        this.productsserialnumber = productsserialnumber;
        this.clientname = clientname;
        this.clientphonenumber = clientphonenumber;
        this.purchasedate = purchasedate;
        this.agentname = agentname;
        this.agentphonenumber = agentphonenumber;
    }

    // GETTERS::

    public String getProductsserialnumber() {
        return productsserialnumber;
    }

    public String getClientname() {
        return clientname;
    }

    public String getClientphonenumber() {
        return clientphonenumber;
    }

    public String getPurchasedate() {
        return purchasedate;
    }

    public String getAgentname() {
        return agentname;
    }

    public String getAgentphonenumber() {
        return agentphonenumber;
    }
}

