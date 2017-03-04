package com.ywdeng.basic.sort;

/**
 * @author ywdeng
 * @date 2017年3月3日
 * @Title: Quicksort.java
 * @Description: 
 */
/**
 * @author ywdeng
 * 快速排序算法
 */
public class Quicksort {
  public static void main(String[] args) {
	int []A={8,3,9,6,1,4,5};
  quickSort(A, 0, A.length-1); 
  for (int i : A) {
	System.out.println(i);
}
	
}
  public static void quickSort(int[]A, int l,int r){
	  //递归时的临界条件
	  if(l<r){
	  int mind=A[r];
	  int i=l,j=r;
	  while(i<j){
		  while(i<j&&A[i]<mind)
		     i++;
		  //使用比mind大的元素来填之前的坑
		  if(i<j)
		     A[j--]=A[i];
		  while(i<j&&A[j]>mind)
			  j--;
		  //条件必须要有
		  if(i<j)
			//在填好坑之后指针向下移动一位
		   A[i++]=A[j];
	  }
	  A[i]=mind;
	 //注意中间元素不能再参与进来比较
	 quickSort(A, l, i-1);
	 quickSort(A, i+1, r);
  }
  }
}
