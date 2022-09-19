/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;
import static java.lang.Thread.sleep;

/**
 *
 * @author USER
 */
public class thread1 {
    public static void main(String[] args) {
 // TODO code application logic here
 Thread t1=new Proses1();
 Thread t2=new Proses2();

 t1.start();
 t2.start();
 }
}
class Proses1 extends Thread{
 public void run(){
 try{
 sleep(300);
 }catch (InterruptedException e){
 e.printStackTrace();}
 System.out.println("Proses 1 Berjalan");
 }
}
class Proses2 extends Thread{
 public void run(){
 System.out.println("Proses 2 Berjalan");
 }
    
}
