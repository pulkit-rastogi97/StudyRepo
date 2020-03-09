
public class Consumer implements Runnable {
	Fruits fr;
	int demand1;
	int demand2;
	int demand3;
	int demand4;
	
	public Consumer(Fruits fr,int demand1,int demand2,int demand3,int demand4){
		this.fr=fr;
		this.demand1=demand1;
		this.demand2=demand2;
		this.demand3=demand3;
		this.demand4=demand4;
		new Thread(this).start();
	}

	@Override
	public void run() {
		while(demand1>0 || demand2>0 || demand3>0 || demand4>0){
		synchronized(fr){
			if(fr.getApple()>=demand1){
			System.out.println("Demand 1 Complete "+fr.getApple());
			}else{
				System.out.println("Demand 1 left ="+(demand1-(fr.getApple())));
			}if(fr.getGrape()>=demand2)
			{System.out.println("Demand 2 Complete "+fr.getGrape());
			}else{
				System.out.println("Demand 2 left ="+(demand2-(fr.getGrape())));}
			if(fr.getOrange()>=demand3){
			System.out.println("Demand 3 Complete "+fr.getOrange());
			}else{
				System.out.println("Demand 3 left ="+(demand3-(fr.getOrange())));}
			if(fr.getWatermelon()>=demand4){
			System.out.println("Demand 4 Complete "+fr.getWatermelon());
			}else{
				System.out.println("Demand 4 left ="+(demand4-(fr.getWatermelon())));
			}
			try {
				demand1-=fr.getApple();
				demand2-=fr.getGrape();
				demand3-=fr.getOrange();
				demand4-=fr.getWatermelon();
							
				
				fr.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fr.notify();
		}
	}
	}
	
}
