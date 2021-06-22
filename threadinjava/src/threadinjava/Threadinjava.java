/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadinjava;

/**
 *
 * @author Kimo Store
 */

import threadinjava.RunnableThread;
import threadinjava.SimpleThread;
public class Threadinjava {

    /**
     * @param args the command line arguments
     */

        	public static void main(String[] args) {
		new SimpleThread("Thread 1").start();
		new SimpleThread("Thread 2").start();
		
		new Thread(new RunnableThread("Thread Runnable")).start();
	}
    
    
}
