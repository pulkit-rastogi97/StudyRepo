import java.util.Random;


public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] med = new Medicine[10];
		int n;
		for(int i = 0; i<10; i++)
		{
			Random rand = new Random();
			n=rand.nextInt(4-1)+1;
			switch(n)
			{
			case 1: med[i]= new Tablet();
					med[i].displayLabel();
					break;
			case 2: med[i]= new Syrup();
					med[i].displayLabel();
					break;
			case 3: med[i]= new Ointment();
					med[i].displayLabel();
					break;
			}
		}
	}
}
