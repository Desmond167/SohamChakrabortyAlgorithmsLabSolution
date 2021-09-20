package assignment.session.service;

public class MergeSort {
	
	void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left +1;
		int n2 = right - mid;
		
		int arrL[] = new int[n1];
		int arrR[] = new int[n2];
		
		for(int i=0; i<n1; ++i) {
			arrL[i] = arr[left + i];
		}
		for(int j=0; j<n2; ++j) {
			arrR[j] = arr[mid + 1 + j];
		}
		
		int i=0, j=0;
		
		int k = left;
		while (i < n1 && j < n2) {
			if(arrL[i] >= arrR[j]) {
				arr[k] = arrL[i];
				i++;
			}
			else {
				arr[k] = arrR[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			arr[k] = arrL[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			arr[k] = arrR[j];
			j++;
			k++;
		}
	}
	
	void sort(int[] arr, int left, int right) {
		
		if(left < right) {
			int mid = left + (right-left)/2;
			
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	public int[] getSortedArray(int[] arr) {
		
		sort(arr, 0, arr.length-1);
		
		return arr;
	}
	

	


}
