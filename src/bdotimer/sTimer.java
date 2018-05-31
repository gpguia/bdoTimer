/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdotimer;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
/**
 *
 * @author Guilherme
 */
public class sTimer {
    int m,s;
    Timer timer;
    TimerTask task;
    JLabel l;
    boolean timerCheck;
    
    public sTimer(JLabel l,int m, int s){
        this.m = m;
        this.s = s;
        this.l = l;
        this.setTimer();
        timerCheck = false;
    }
    
    public sTimer(JLabel l){
        m = 13;
        s = 0;
        this.l = l;
        this.setTimer();
        timerCheck = false;
    }
    
    private void setTimer(){
        timer = new Timer();
        task = new TimerTask(){
            @Override
            public void run() {
                if(s == 0){
                    s = 59;
                    if(m > 0)
                        m--;
                }
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
                s--;
                
                if(m==0 && s==0){
                    l.setText("<html><font color='red'>00:00:00</font></html>");
                    timerCheck =  false;
                    Toolkit.getDefaultToolkit().beep();
                    timer.cancel();
                    Toolkit.getDefaultToolkit().beep();
                }
            }
            
        };
    }
    
    public boolean isRunnig(){
        return timerCheck;
    }
    
    public void stop(){
        timer.cancel();
        l.setText("00:00:00");
    }
    
    public int getSec(){
        return s;
    }
    public int getMin(){
        return m;
    }
    
    public void start(){
        this.timerCheck = true;
        timer.scheduleAtFixedRate(task, 1000,1000);
    }
}
