package com.wsq.homemoney;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author 86199
 *
 * 家庭收支记账软件
 * 主页面
 * ------------------家庭收支记账软件------------------
 *                     1 收支明细
 *                     2 登记收入
 *                     3 登记支出
 *                     4 退   出
 *
 * 需要使用Scanner类进行输入
 * 需要使用ArrayList对每一次的收支进行存储
 */
public class FamilyAccount {
    public static void main(String[] args) {
        ArrayList<Utility> arrayList = new ArrayList<Utility>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("------------------家庭收支记账软件------------------");
            System.out.println("                    1 收支明细                    ");
            System.out.println("                    2 登记收入                    ");
            System.out.println("                    3 登记支出                    ");
            System.out.println("                    4 退   出                    ");
            System.out.print("                    请选择<1-4>：");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    if(arrayList.size() != 0){
                        System.out.println("------------------当前收支明细记录------------------");
                        System.out.format("%-10s%-12s%-12s%-10s%n", "收支", "账户金额", "收支金额", "说    明");
                        ListIterator<Utility> listIterator = arrayList.listIterator();
                        while(listIterator.hasNext()){
                            Utility utility = listIterator.next();
                            System.out.format("%-10s%-15.2f%-14.2f%-10s%n", utility.getInOut(), utility.getAllMoney(), utility.getOneMoney(), utility.getTips());
                        }
                        System.out.println("-------------------------------------------------");
                    }
                    break;
                case 2:
                case 3:
                    String inOut = (num == 2)?"收入":"支出";
                    System.out.print("本次" + inOut + "金额：");
                    double money = scanner.nextDouble() * ((num == 2)?1:(-1));
                    scanner.nextLine();
                    System.out.print("本次" + inOut + "说明：");
                    String tip = scanner.nextLine();
                    if(arrayList.size() == 0){
                        arrayList.add(new Utility(inOut, money, Math.abs(money), tip));
                    } else {
                        Utility utility = arrayList.get(arrayList.size()-1);
                        arrayList.add(new Utility(inOut, utility.getAllMoney() + money, Math.abs(money), tip));
                    }
                    System.out.println("----------------------登记成功----------------------");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("---------------输入错误，请重新输入！---------------");
                    break;
            }
        }
    }
}
