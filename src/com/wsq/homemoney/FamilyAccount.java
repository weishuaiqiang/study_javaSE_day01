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
            System.out.println("                    请选择<1-4>：                    ");
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
                    System.out.print("本次收入金额：");
                    double inMoney = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("本次收入说明：");
                    String inTip = scanner.nextLine();
                    String in = "收入";
                    if(arrayList.size() == 0){
                        arrayList.add(new Utility(in, inMoney, inMoney, inTip));
                    } else {
                        Utility utility = arrayList.get(arrayList.size()-1);
                        arrayList.add(new Utility(in, utility.getAllMoney() + inMoney, inMoney, inTip));
                    }
                    System.out.println("----------------------登记成功----------------------");
                    break;
                case 3:
                    System.out.print("本次支出金额：");
                    double outMoney = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("本次支出说明：");
                    String outTip = scanner.nextLine();
                    String out = "支出";
                    if(arrayList.size() == 0){
                        arrayList.add(new Utility(out, outMoney, outMoney, outTip));
                    } else {
                        Utility utility = arrayList.get(arrayList.size()-1);
                        arrayList.add(new Utility(out, utility.getAllMoney() - outMoney, outMoney, outTip));
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
