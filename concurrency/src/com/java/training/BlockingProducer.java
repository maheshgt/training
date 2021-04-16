package com.java.training;

import java.util.concurrent.BlockingQueue;

public class BlockingProducer implements Runnable{

	private final BlockingQueue queue;

	public BlockingProducer(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Producer: " + i);
				queue.put(i);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
