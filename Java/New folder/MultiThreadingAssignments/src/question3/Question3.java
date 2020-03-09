package question3;

class Question3 {
	
	public static void main(String[] args) {
		
		FruitsMarket market = new FruitsMarket();
		Producer producer = new Producer(market);
		Consumer consumer = new Consumer(market,1,2,3,4);
		
		Thread t1 = new Thread(producer,"Producer");
		Thread t2 = new Thread(consumer,"Consumer");
		
		t1.start();
		t2.start();
		
	}

}