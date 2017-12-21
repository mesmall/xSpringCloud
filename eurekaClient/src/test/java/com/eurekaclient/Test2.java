package com.eurekaclient;

import com.utils.HttpRequest;

/**
 * Created by lizhen on 2017/12/20.
 */
public class Test2 {
    @org.junit.Test
    public void test2(){
        String  url = "http://localhost:2102/";
        String str = null;

        for (int i=0;i<100000;i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int x = (int)(Math.random()*100);
            int t = x%10;
            if(t==1)
                str =  HttpRequest.sendGet(url+"add","");
            if(t==2)
                str =  HttpRequest.sendGet(url+"add","");
            if(t==3)
                str =  HttpRequest.sendGet(url+"add","");
            if(t==4)
                str =  HttpRequest.sendGet(url+"add","");
            if(t==5)
                str =  HttpRequest.sendGet(url+"login","");
            if(t==6)
                str =  HttpRequest.sendGet(url+"login","");
            if(t==7)
                str =   HttpRequest.sendGet(url+"consumer","");
            if(t==8)
                str =  HttpRequest.sendGet(url+"consumer","");
            if(t==9)
                str =  HttpRequest.sendGet(url+"sum","");
            if(t==0)
                str =  HttpRequest.sendGet(url+"logout","");
            System.out.println(i+":i/10="+t+":"+str);
        }
    }
}
