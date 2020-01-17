package com.example.asn1;

public class Question {
    private String qName;
    private boolean res;
    public Question(String name ,boolean val) {
        qName=name;
        res=val;
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName;
    }

    public boolean isRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = res;
    }
}
