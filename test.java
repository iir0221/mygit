package com.bjsxt.thread.info;
/**
 *
  Thread.currentThread()	 :当前线程
  setName():设置名称
  getName():获取名称
  isAlive():判断状态

 * @author Administrator
 */
public class InfoDemo01 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		MyThread it =new MyThread();
		Thread proxy =new Thread(it,"挨踢+加入一些文字");
		proxy.setName("test");
		System.out.println(proxy.getName());
		System.out.println(Thread.currentThread().getName()); //main
		//加入一行
		proxy.start();
		System.out.println("启动后状态:"+proxy.isAlive());
		Thread.sleep(200);
		//第二次加入一行
		it.stop();
		Thread.sleep(100);
		System.out.println("停止后状态:"+proxy.isAlive());
	}

}
