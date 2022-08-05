import java.util.Random;

public class TestDemo {

	int addPositive(int a, int b) {
	int d=0;
if( a > 0 && b>0) {
	
	d=a+b;
	}
else {
	throw new IllegalArgumentException
	("Both parameters must be positive!");
		
		
	}
	return d; 
	}
	int getRandomInt() {
		Random random=new Random();
		return random.nextInt(10) +1;
	}
	int randomNumberSquared() {
		return getRandomInt()*getRandomInt();
		
	}
	
}
