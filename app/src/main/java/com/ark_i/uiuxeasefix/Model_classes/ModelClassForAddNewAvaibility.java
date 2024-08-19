package com.ark_i.uiuxeasefix.Model_classes;

public class ModelClassForAddNewAvaibility {
    ModelClassForAddNewAvaibility(){}






    public ModelClassForAddNewAvaibility(String dayname, String checkboxfroday, String checkboxforall) {
        this.dayname = dayname;
    }

    public String getDayname() {
        return dayname;
    }

    public void setDayname(String dayname) {
        this.dayname = dayname;
    }



    String dayname;

}
