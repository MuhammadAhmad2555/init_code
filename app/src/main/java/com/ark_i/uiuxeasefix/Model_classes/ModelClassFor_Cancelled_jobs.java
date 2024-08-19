package com.ark_i.uiuxeasefix.Model_classes;

public class ModelClassFor_Cancelled_jobs {
    ModelClassFor_Cancelled_jobs(){};


    public ModelClassFor_Cancelled_jobs(String fromDestination, String toDestination, String status, String numBags, String numberofPeople, String idk, String departsdatetime, String type) {
        FromDestination = fromDestination;
        ToDestination = toDestination;
        Status = status;
        NumBags = numBags;
        this.numberofPeople = numberofPeople;
        Idk = idk;
        Departsdatetime = departsdatetime;
        Type = type;
    }

    public String getNumberofPeople() {
        return numberofPeople;
    }

    public void setNumberofPeople(String numberofPeople) {
        this.numberofPeople = numberofPeople;
    }

    public String getIdk() {
        return Idk;
    }

    public void setIdk(String idk) {
        Idk = idk;
    }

    public String getDepartsdatetime() {
        return Departsdatetime;
    }

    public void setDepartsdatetime(String departsdatetime) {
        Departsdatetime = departsdatetime;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getFromDestination() {
        return FromDestination;
    }

    public void setFromDestination(String fromDestination) {
        FromDestination = fromDestination;
    }

    public String getToDestination() {
        return ToDestination;
    }

    public void setToDestination(String toDestination) {
        ToDestination = toDestination;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getNumBags() {
        return NumBags;
    }

    public void setNumBags(String numBags) {
        NumBags = numBags;
    }

    String numberofPeople;
    String Idk;
    String Departsdatetime;
    String Type;

    String FromDestination;
    String ToDestination;
    String Status;
    String NumBags;



}
