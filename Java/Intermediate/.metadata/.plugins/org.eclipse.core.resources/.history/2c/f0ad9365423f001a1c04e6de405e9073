
public class Determine implements Runnable {
	Storage st;
	public Determine(Storage st){
		this.st=st;
		new Thread(this).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
		synchronized(st){
			if(st.getI()<0){
				System.out.println("-ve"+st.getI());
			}
			else if(st.getI()>0 && st.getI()%2==0){
				System.out.println("+ve even"+st.getI());
			}
			else{
				System.out.println("+ve odd"+st.getI());
			}
			try {
				st.wait(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			st.notify();
		}
		}
	}

}
