package com.wsq.homemoney;

/**
 * @author 86199
 * 家庭收支记账软件
 * 属性：
 *  String 收支
 *  double 账户总金额
 *  double 收支金额
 *  String 说明
 */
public class Utility {
    private String inOut;
    private double allMoney;
    private double oneMoney;
    private String tips;

    public Utility() {
    }

    public Utility(String inOut, double allMoney, double oneMoney, String tips){
        this.inOut = inOut;
        this.allMoney = allMoney;
        this.oneMoney = oneMoney;
        this.tips = tips;
    }

    public String getInOut() {
        return inOut;
    }

    public void setInOut(String inOut) {
        this.inOut = inOut;
    }

    public double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }

    public double getOneMoney() {
        return oneMoney;
    }

    public void setOneMoney(double oneMoney) {
        this.oneMoney = oneMoney;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
