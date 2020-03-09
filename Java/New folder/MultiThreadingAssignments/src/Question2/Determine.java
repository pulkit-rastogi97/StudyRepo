package Question2;

public class Determine implements Runnable {
	Store st;
	public Determine(Store st){
		this.st=st;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
		synchronized(st){
			if(st.getI()<0){
				System.out.println(" Negative = "+st.getI());
			}
			else if(st.getI()>0 && st.getI()%2==0){
				System.out.println(" Even Positive "+st.getI());
			}
			else{
				System.out.println(" Odd Positive "+st.getI());
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
