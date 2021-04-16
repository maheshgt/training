package com.java.training;

import java.util.concurrent.BlockingQueue;

public class BlockingConsumer implements Runnable{

	private final BlockingQueue queue;

    public BlockingConsumer (BlockingQueue queue) {
        this.queue = queue;
    }
  
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Consumer: "+ queue.take());
            } catch (InterruptedException ex) {
            	ex.printStackTrace();
            }
        }
    }


}
