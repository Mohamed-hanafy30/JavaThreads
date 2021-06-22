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
public class RunnableThread implements Runnable{
	String name;

	public RunnableThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i + " " + name);
		}
		System.out.println("Done " + name);
	}
	
	

}
