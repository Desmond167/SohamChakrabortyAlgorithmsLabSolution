package assignment.session.service;

public class Services {
	
	public void payApproach(int[] arr, int amount) {
		MergeSort obj = new MergeSort();
		int[] sortedArr = obj.getSortedArray(arr);
		
		int sum = 0;
		int[] counter = new int[sortedArr.length];
			
			try {
				for(int i=0; i<sortedArr.length; i++) {
				  if(amount>=sortedArr[i]) {
					  counter[i] = amount / sortedArr[i];
					  amount = amount - counter[i] * sortedArr[i];
					  
				  }
				}
				
				if (amount != 0) {
					System.out.println("Exact amount cannot be given");
				}
				else {
					System.out.println("Your payment approach:");
					for(int i=0; i<sortedArr.length; i++) {
						if (counter[i] != 0) {
							System.out.println(sortedArr[i]+":"+counter[i]);
						}
					}
				}
			}
			catch(ArithmeticException e) {
			  System.out.println(e + "'0' found.. Computation not possible");
			}
			

	}

}
