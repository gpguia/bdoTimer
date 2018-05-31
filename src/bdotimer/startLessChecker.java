/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdotimer;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Guilherme
 */
public class startLessChecker extends Thread{
    sTimer st01,st02,st03,st04,st05;
    JLabel l;
    JTextField tf,tf01,tf02,tf03,tf04,tf05;
    boolean run;
    
    
    public startLessChecker(){
        run = false;
    }
    
    public startLessChecker(sTimer st01,sTimer st02,sTimer st03,sTimer st04,sTimer st05, JLabel l, JTextField tf, JTextField tf01,JTextField tf02,JTextField tf03,JTextField tf04,JTextField tf05){
        this.st01 = st01;
        this.st02 = st02;
        this.st03 = st03;
        this.st04 = st04;
        this.st05 = st05;
        this.l = l;
        this.tf = tf;
        this.tf01 = tf01;
        this.tf02 = tf02;
        this.tf03 = tf03;
        this.tf04 = tf04;
        this.tf05 = tf05;
        run = true;
    }
    @Override
    public void run(){
        while(run){
            if(st01.isRunnig() && !st02.isRunnig() && !st03.isRunnig() && !st04.isRunnig() && !st05.isRunnig()){
                int m,s;
                m = st01.getMin();s = st01.getSec();
                tf.setText(tf01.getText());
                if(s<10 && m>=10){
                l.setText("00:"+m+":"+"0"+s);
                }else if(s >= 10 && m >= 10){
                    l.setText("00:"+m+":"+s);
                }else if(m < 10 && s>=10){
                    l.setText("00:"+"0"+m+":"+s);
                }else if(m >= 10 && s >= 10){
                    l.setText("00:"+m+":"+s);
                }else if(s < 10 && m < 10){
                    l.setText("00:" + "0" + m + ":0" + s);
                }
            }else if(st02.isRunnig() && !st01.isRunnig() && !st03.isRunnig() && !st04.isRunnig() && !st05.isRunnig()){
                int m,s;
                m = st02.getMin();s = st02.getSec();
                tf.setText(tf02.getText());
                if(s<10 && m>=10){
                l.setText("00:"+m+":"+"0"+s);
                }else if(s >= 10 && m >= 10){
                    l.setText("00:"+m+":"+s);
                }else if(m < 10 && s>=10){
                    l.setText("00:"+"0"+m+":"+s);
                }else if(m >= 10 && s >= 10){
                    l.setText("00:"+m+":"+s);
                }else if(s < 10 && m < 10){
                    l.setText("00:" + "0" + m + ":0" + s);
                }
            }else if(st03.isRunnig() && !st01.isRunnig() && !st02.isRunnig() && !st04.isRunnig() && !st05.isRunnig()){
                int m,s;
                m = st03.getMin();s = st03.getSec();
                tf.setText(tf03.getText());
                if(s<10 && m>=10){
                l.setText("00:"+m+":"+"0"+s);
                }else if(s >= 10 && m >= 10){
                    l.setText("00:"+m+":"+s);
                }else if(m < 10 && s>=10){
                    l.setText("00:"+"0"+m+":"+s);
                }else if(m >= 10 && s >= 10){
                    l.setText("00:"+m+":"+s);
                }else if(s < 10 && m < 10){
                    l.setText("00:" + "0" + m + ":0" + s);
                }
            }else if(st04.isRunnig()){
                int m,s;
                m = st04.getMin();s = st04.getSec();
                tf.setText(tf04.getText());
                if(s<10 && m>=10){
                l.setText("00:"+m+":"+"0"+s);
                }else if(s >= 10 && m >= 10){
                    l.setText("00:"+m+":"+s);
                }else if(m < 10 && s>=10){
                    l.setText("00:"+"0"+m+":"+s);
                }else if(m >= 10 && s >= 10){
                    l.setText("00:"+m+":"+s);
                }else if(s < 10 && m < 10){
                    l.setText("00:" + "0" + m + ":0" + s);
                }
            }else if(st05.isRunnig()){
                int m,s;
                m = st05.getMin();s = st05.getSec();
                tf.setText(tf05.getText());
                if(s<10 && m>=10){
                l.setText("00:"+m+":"+"0"+s);
                }else if(s >= 10 && m >= 10){
                    l.setText("00:"+m+":"+s);
                }else if(m < 10 && s>=10){
                    l.setText("00:"+"0"+m+":"+s);
                }else if(m >= 10 && s >= 10){
                    l.setText("00:"+m+":"+s);
                }else if(s < 10 && m < 10){
                    l.setText("00:" + "0" + m + ":0" + s);
                }
            }else if(st01.isRunnig() && st02.isRunnig() && !st03.isRunnig() && !st04.isRunnig() && !st05.isRunnig()){
                if(st01.m < st02.m){
                    int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st02.getMin();s=st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }
            }else if(st01.isRunnig() && st03.isRunnig()){
                if(st01.m < st03.m){
                    int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st03.getMin();s=st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }
            }else if(st01.isRunnig() && st04.isRunnig()){
                if(st01.m < st04.m){
                    int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st04.getMin();s=st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st05.isRunnig()){
                if(st01.m < st05.m){
                    int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s=st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st02.isRunnig() && st03.isRunnig()){
                if(st02.m < st03.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st03.getMin();s=st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st02.isRunnig() && st04.isRunnig()){
                if(st02.m < st04.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st04.getMin();s=st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st02.isRunnig() && st05.isRunnig()){
                if(st02.m < st05.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s=st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st03.isRunnig() && st04.isRunnig()){
                if(st03.m < st04.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st04.getMin();s=st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st03.isRunnig() && st05.isRunnig()){
                if(st03.m < st05.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s=st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st04.isRunnig() && st05.isRunnig()){
                if(st04.m < st05.m){
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s=st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st02.isRunnig() && st03.isRunnig()){
                if(st01.m < st02.m && st01.m < st03.m){
                  int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st02.m < st01.m && st02.m < st03.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st02.isRunnig() && st04.isRunnig()){
                if(st01.m < st02.m && st01.m < st03.m){
                  int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st02.m < st01.m && st02.m < st03.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st02.isRunnig() && st05.isRunnig()){
                if(st01.m < st02.m && st01.m < st03.m){
                  int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st02.m < st01.m && st02.m < st03.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st03.isRunnig() && st04.isRunnig()){
                if(st01.m < st03.m && st01.m < st03.m){
                  int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st03.m < st01.m && st03.m < st04.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st03.isRunnig() && st05.isRunnig()){
                if(st01.m < st03.m && st01.m < st05.m){
                  int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st03.m < st01.m && st03.m < st05.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st04.isRunnig() && st05.isRunnig()){
                 if(st01.m < st04.m && st01.m < st05.m){
                  int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st04.m < st01.m && st04.m < st05.m){
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st02.isRunnig() && st03.isRunnig() && st04.isRunnig()){
                if(st02.m < st03.m && st02.m < st04.m){
                  int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st03.m < st02.m && st03.m < st04.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st02.isRunnig() && st03.isRunnig() && st05.isRunnig()){
                if(st02.m < st03.m && st02.m < st05.m){
                  int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st03.m < st02.m && st03.m < st05.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st02.isRunnig() && st04.isRunnig() && st05.isRunnig()){
                if(st02.m < st04.m && st02.m < st05.m){
                  int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st04.m < st02.m && st04.m < st05.m){
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st03.isRunnig() && st04.isRunnig() && st05.isRunnig()){
                if(st03.m < st04.m && st03.m < st05.m){
                  int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st04.m < st03.m && st04.m < st05.m){
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st02.isRunnig() && st03.isRunnig() && st04.isRunnig()){
                if(st01.m < st02.m && st01.m < st03.m && st01.m < st04.m){
                    int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st02.m < st01.m && st02.m < st03.m && st02.m < st04.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st03.m < st01.m && st03.m < st02.m && st03.m < st04.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st02.isRunnig() && st03.isRunnig() && st05.isRunnig()){
                if(st01.m < st02.m && st01.m < st03.m && st01.m < st05.m){
                    int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st02.m < st01.m && st02.m < st03.m && st02.m < st05.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st03.m < st01.m && st03.m < st02.m && st03.m < st05.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st02.isRunnig() && st04.isRunnig() && st05.isRunnig()){
                if(st01.m < st02.m && st01.m < st04.m && st01.m < st05.m){
                    int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st02.m < st01.m && st02.m < st04.m && st02.m < st05.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st04.m < st01.m && st04.m < st02.m && st04.m < st05.m){
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st01.isRunnig() && st03.isRunnig() && st04.isRunnig() && st05.isRunnig()){
                if(st01.m < st03.m && st01.m < st04.m && st01.m < st05.m){
                    int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st03.m < st01.m && st03.m < st04.m && st03.m < st05.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st04.m < st01.m && st04.m < st03.m && st04.m < st05.m){
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else if(st02.isRunnig() && st03.isRunnig() && st04.isRunnig() && st05.isRunnig()){
                if(st02.m < st03.m && st02.m < st04.m && st02.m < st05.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st03.m < st02.m && st03.m < st04.m && st03.m < st05.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st04.m < st02.m && st04.m < st03.m && st04.m < st05.m){
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }

            }else{
                if(st01.m < st02.m && st01.m < st03.m && st01.m < st04.m && st01.m < st05.m){
                    int m,s;
                    m = st01.getMin();s = st01.getSec();
                    tf.setText(tf01.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st02.m < st01.m && st02.m < st03.m && st02.m < st04.m && st02.m < st05.m){
                    int m,s;
                    m = st02.getMin();s = st02.getSec();
                    tf.setText(tf02.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st03.m < st01.m && st03.m < st02.m && st03.m < st04.m && st03.m < st05.m){
                    int m,s;
                    m = st03.getMin();s = st03.getSec();
                    tf.setText(tf03.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else if(st04.m < st01.m && st04.m < st02.m && st04.m < st03.m && st04.m < st05.m){
                    int m,s;
                    m = st04.getMin();s = st04.getSec();
                    tf.setText(tf04.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }else{
                    int m,s;
                    m = st05.getMin();s = st05.getSec();
                    tf.setText(tf05.getText());
                    if(s<10 && m>=10){
                    l.setText("00:"+m+":"+"0"+s);
                    }else if(s >= 10 && m >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(m < 10 && s>=10){
                        l.setText("00:"+"0"+m+":"+s);
                    }else if(m >= 10 && s >= 10){
                        l.setText("00:"+m+":"+s);
                    }else if(s < 10 && m < 10){
                        l.setText("00:" + "0" + m + ":0" + s);
                    }
                }
            }
            try{
                Thread.sleep(999);
            } catch (InterruptedException ex) {
                Logger.getLogger(startLessChecker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void close(){
        run = false;
        l.setText("00:00:00");
    }
    public boolean isRunning(){
        return run;
    }
}
