package com.sapient;
public class TickTock implements Runnable {

    private static final int N = 10;
    private Thread thread;
    private static Object object = new Object();

    public TickTock(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    public void run(){
        for(int i=0; i<N; i++){
            synchronized (object) {
                System.out.println(thread.getName());
                object.notify();
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
	    public static void main(String args[]) {
	    	TickTock message1 = new TickTock("Tick");
	    	TickTock message2 = new TickTock("Tock");
		}
}