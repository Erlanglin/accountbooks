package com.accounts.sixzerotwo.sixzerotwo.util;


import com.accounts.sixzerotwo.sixzerotwo.dao.BossDao;
import com.accounts.sixzerotwo.sixzerotwo.entity.Boss;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/4/1/001.
 */
public class keepAccounts {

    @Autowired
    public static BossDao bossDao;

    public static void main(String args[]){
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("查账:0,记账:1,清账:2");
        System.out.println("+++++++++++++++++++++++++");
        while( true ){
            System.out.print("请选择:");
            Scanner n = new Scanner(System.in);
            int choice = n.nextInt();
            if (choice == 0){
                checkAccounts();
            }
            else if(choice == 1){
                System.out.println("+++++++++记账++++++++++++");
            }
            else if(choice == 2){
                System.out.println("++++++++++清账+++++++++++");
            }
            else{
                System.out.println("++++++++++输入有误+++++++++++");
            }
        }
    }

    public static void checkAccounts(){
        List<Boss> list = bossDao.queryAll(0, 1000);
        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
