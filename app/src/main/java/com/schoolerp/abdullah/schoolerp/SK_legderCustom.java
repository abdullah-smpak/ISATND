package com.schoolerp.abdullah.schoolerp;

/**
 * Created by sony on 12/26/2017.
 */

public class SK_legderCustom {


    String legType;
    String legNum;
    String legDate;
    String legAmn;
    String Balance;

    public String getLegType() {
        return legType;
    }

    public String getLegNum() {
        return legNum;
    }

    public String getLegDate() {
        return legDate;
    }

    public String getLegAmn() {
        return legAmn;
    }

    public String getBalance() {
        return Balance;
    }

    public SK_legderCustom(String legType, String legNum, String legDate, String legAmn, String balance) {

        this.legType = legType;
        this.legNum = legNum;
        this.legDate = legDate;
        this.legAmn = legAmn;
        Balance = balance;
    }

}
