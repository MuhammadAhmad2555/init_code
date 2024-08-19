package com.ark_i.uiuxeasefix.Model_classes;

public class ModelClassForAvability {

    public ModelClassForAvability(String dayname,String timeFrom, String timeTo, String forstate, String buttonstate) {
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        this.forstate = forstate;
        this.buttonstate = buttonstate;
        this.dayname = dayname;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public String getForstate() {
        return forstate;
    }

    public void setForstate(String forstate) {
        this.forstate = forstate;
    }

    public String getButtonstate() {
        return buttonstate;
    }

    public void setButtonstate(String buttonstate) {
        this.buttonstate = buttonstate;
    }

    String timeFrom;
    String timeTo;
    String forstate;
    String buttonstate;



    public String getDayname() {
        return dayname;
    }

    public void setDayname(String dayname) {
        this.dayname = dayname;
    }

    String dayname;

}
