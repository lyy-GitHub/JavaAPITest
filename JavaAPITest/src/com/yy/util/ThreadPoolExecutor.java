package com.yy.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		for(int i=0;i<10;i++){
			executor.submit(new ThreadTask(i));
		}
		System.out.println("10 tasks dispatched successfully");
	}

}
class ThreadTask implements Runnable{
	private final int employeeid;
	public ThreadTask(int employeeid){
		this.employeeid=employeeid;
	}
	@Override
	public void run() {
		System.out.println("当前线程"+employeeid+"write code");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
