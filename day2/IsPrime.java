package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
				int count=0;
		
		for(int i=2; i<num;i++) {
			
			
			if(num%i==0)
			{
				System.out.println( i+ " is not prime number");
				count++;
				break;
			}
			else
			{
				System.out.println(i+ "is not prime number");
			}
			

	}

}
}
