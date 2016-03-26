package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {

	/** 定义装苹果的篮子 */

	public static final int max = 10000;

	public static class Basket {
		// 篮子,能够容纳3个苹果
		BlockingQueue<String> basket = new ArrayBlockingQueue<String>(10);

		// 生产苹果,放入篮子
		public void produce(String content) throws InterruptedException {
			// put方法放入一个苹果,若basket满了,等到basket有位置
			basket.put(content);
		}

		// 消费苹果,从篮子中取走
		public String consume() throws InterruptedException {
			// take方法取出一个苹果,若basket为空,等到basket有苹果为止
			return basket.take();
		}
	}

	// 测试方法
	public static void testBasket() {
		final Basket basket = new Basket();// 建立一个装苹果的篮子
		// 定义苹果生产者
		class Producer implements Runnable {
			public void run() {
				try {

					for (int j = 0; j < max; j = j + 100) {
						for (int i = j; i < j + 100; i++) {
							if (i == max) {
								break;
							}
							// 生产苹果
							// System.out.println("生产者准备生产苹果: "+
							// System.currentTimeMillis());
							basket.produce(String.valueOf(i));
							// System.out.println("生产者生产苹果完毕: "+
							// System.currentTimeMillis());
							// 休眠300ms
							Thread.sleep(100);
							System.out.println("生产苹果:" + i);
						}

					}

				} catch (InterruptedException ex) {
				}
			}
		}

		// 定义苹果消费者
		class Consumer implements Runnable {
			public void run() {
				try {
					while (true) {
						// 消费苹果
						System.out.println("消费者准备消费苹果: " + basket.consume());
						
						// 休眠1000ms
						 Thread.sleep(1000);
					}
				} catch (InterruptedException ex) {
				}
			}
		}
		ExecutorService service = Executors.newFixedThreadPool(6);
		Consumer producer1 = new Consumer();
		Consumer producer2 = new Consumer();
		Consumer producer3 = new Consumer();
		Consumer producer4 = new Consumer();
		Consumer producer5 = new Consumer();
		Producer producer = new Producer();
		service.submit(producer1);
		service.submit(producer2);
		service.submit(producer3);
		service.submit(producer4);
		service.submit(producer5);
		service.submit(producer);
		// 程序运行5s后,所有任务停止
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException ex) {
		// }
		
		 try {
			service.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		service.shutdownNow();
		System.out.println("all thread complete");
	}

	public static void main(String[] args) {
		BlockingQueueTest.testBasket();

	}
}
