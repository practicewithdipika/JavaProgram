package ProgrammingQues;

public class FindMaxAndMinNumberFromArray {

	public static void main(String[] args) {
		int num[]= {10, 2, 80, 4, 76, 100, 21, -6};
		
		int minNum = num[0];
		int maxNum= num[0];
		
		for(int i=1; i<num.length;i++) {
			if(num[i]<num[0]) {
				minNum=num[i];
			}
			else if(num[i]<num[0]) {
				maxNum= num[i];
				
				
			}
		}
		
		System.out.println("Max number of given Array is:"+ maxNum);
		System.out.println("Min number of given Array is:"+ minNum);

	}

}
