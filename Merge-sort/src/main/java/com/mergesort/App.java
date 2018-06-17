package com.mergesort;

/**
 * Hello world!
 *
 */
public class App 
{
    public void sort(int[] a, int low, int high) 
    {
        int n= high - low;         
        if (n <= 1) 
            return; 
        int mid = low + n/2; 
        // recursively sort 
        sort(a, low, mid); 
        sort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[n];
        int i = low, j = mid;
        for (int k = 0; k < n; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < n; k++) 
            a[low + k] = temp[k];  
	}
	public int[] mergeSort(int[] array)
	{
		 sort(array,0,array.length);
                 return array;
		 
	}
}

