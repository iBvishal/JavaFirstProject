package number;

public class NumberRunner implements number{

	public int checkPrime(int x) {
		for(int i=2;i*i<x;i++) {
			if(x%i==0)	return 0;
		}
		return 1;
	}

	public boolean checkAmstrong(int x) {
		int temp = x, digits = 0, result = 0;
		while(temp > 0) {
			digits++;
			temp/=10;
		}
		temp = x;
		while(temp != 0) {
			result = (int) (result + Math.pow(temp % 10, digits));
			temp = temp/10;	
		}
		 return (result == x);
	}

	public boolean CheckPolindrom(int x) {
		int temp = x, pal = 0;
		while(temp > 0) {
			pal = (pal*10) + (temp%10);
			temp /= 10;
		}
		return (pal==x);
	}
	
}