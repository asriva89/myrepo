package com.nokia.training;

public class ReverseArray {
	void reverse(int arr[], int d) {
		int n = arr.length;
		rotate(arr, 0, d - 1);
		rotate(arr, d, n - 1);
		rotate(arr, 0, n - 1);
	}

	 void rotate(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
	 ReverseArray x=new ReverseArray();
		x.reverse(a, 2);//passs by value;here memory location of a is passed as value hence the object is changed after the call
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

	}

}
