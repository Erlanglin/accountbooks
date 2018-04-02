package com.accounts.sixzerotwo.util;


import com.accounts.sixzerotwo.dao.BossDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/4/1/001.
 */
public class KeepAccounts {

    @Autowired
    public static BossDao bossDao;
    public static void main(String args[]) {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("查账:0,记账:1,清账:2");
        System.out.println("+++++++++++++++++++++++++");
        String a="bossId", b="consumersId", c="activityName", d="monetary", e="activityTime", f="updateTime";
        List accounts=new ArrayList();
        accounts.add(a);
        accounts.add(b);
        accounts.add(c);
        accounts.add(e);
        accounts.add(f);

        while (true) {
            System.out.print("请选择:");
            Scanner n = new Scanner(System.in);
            int choice = n.nextInt();
            if (choice == 0) {
                checkAccounts("E:\\workspace\\accountbooks\\accounts.txt");
            } else if (choice == 1) {
                System.out.println("+++++++++记账++++++++++++");
                writeAccounts(accounts);
            } else if (choice == 2) {
                System.out.println("++++++++++清账+++++++++++");
            } else {
                System.out.println("++++++++++输入有误+++++++++++");
            }
        }
    }

    //读出文件
    public static void checkAccounts(String fileName) {
        try {
            File file = new File(fileName);
            // 读取文件，并且以utf-8的形式写出去
            BufferedReader bufread;
            String read;
            bufread = new BufferedReader(new FileReader(file));
            while ((read = bufread.readLine()) != null) {
                System.out.println(read);
            }
            bufread.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
   // Accounts(accountsId,bossId,consumersId,activityName,monetary,activityTime,updateTime)
    public static void writeAccounts(List accounts) {
        int consumerList[] = {1, 2, 3, 4, 5, 12, 13, 14, 15, 123, 124, 125, 135, 145, 1234, 1235, 1245, 1345, 12345, 23, 24, 25,
                234, 235, 245, 2345, 34, 35, 345, 45};
        Scanner n = new Scanner(System.in);
        System.out.println("请选择付款人员：1:Lin,2:Chen,3:Deng,4:Li,5:Wu");
        System.out.print("请选择:");
        int bossId = n.nextInt();
        accounts.add(bossId);

        System.out.println("请选择参与活动的人员：1:Lin,2:Chen,3:Deng,4:Li,5:Wu");
        System.out.print("请选择:");
        int consumerId = n.nextInt();
        List consumers = new ArrayList();
        for(int i = 0;i < consumerList.length;i++){
            if(consumerId == consumerList[i]){
                int wanWei=consumerId/10000;
                int qianWei=consumerId%10000/1000;
                int baiWei=consumerId%1000/100;
                int shiWei=consumerId%100/10;
                int geWei=consumerId%10;
                if(wanWei != 0){
                    consumers.add(wanWei);
                }
                if(qianWei != 0){
                    consumers.add(qianWei);
                }
                if(baiWei != 0){
                    consumers.add(baiWei);
                }
                if(shiWei != 0){
                    consumers.add(shiWei);
                }
                if(geWei != 0){
                    consumers.add(geWei);
                }

                for(int j = 0;j < consumers.size();j++){
                    System.out.print("consumers:"+consumers.get(j));
                }

                System.out.println();
            }
        }
        accounts.add(consumerId);

        System.out.print("请输入消费金额:");
        int monetary = n.nextInt();
        int moneyEvery = monetary/(consumers.size());
        System.out.println("monetary:"+monetary+"  "+"moneyEvery"+ moneyEvery);
        accounts.add(monetary);

        System.out.print("请输入消费活动:");
        String activityName =n.next();
        accounts.add(activityName);

        String activityTime = "2018-4-2";
        accounts.add(activityTime);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        accounts.add(df.format(System.currentTimeMillis()));

        for(int i = 0;i < accounts.size();i++){
            System.out.println("accounts:"+accounts.get(i));
        }
    }


    public static void writeAccountsToTxt(String file, String conent) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true)));
            out.write(conent+"\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
