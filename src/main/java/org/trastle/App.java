package org.trastle;

public class App  {   
    public static void main( String[] args ) {

        long counter = 1; // Might as well count this one.

        while(true) {

            System.out.println( "Threads started: " + counter );

            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(10000000);
                    } catch(InterruptedException e) { }        
                }    
            }).start();

            counter ++;
        }
    
    }
}