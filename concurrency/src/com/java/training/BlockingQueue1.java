package com.java.training;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlockingQueue queue = new LinkedBlockingQueue();

		Thread producer = new Thread(new BlockingProducer(queue));
		Thread consumer = new Thread(new BlockingConsumer(queue));

		producer.start();
		consumer.start();
	}

}
