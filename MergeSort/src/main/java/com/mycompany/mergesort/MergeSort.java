/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mergesort;

/**
 *
 * @author great computer
 */
public class MergeSort {
   void merge(int arr[], int left, int mid, int right) {
int l = mid - left + 1;
int r = right - mid;
 int leftArray[] = new int[l]; // New array for Left elements
  int rightArray[] = new int[r]; // New array for right elements

 for (int i = 0; i < l; ++i) { // Copying elements in leftArray
 leftArray[i] = arr[left + i];
 }


 for (int j = 0; j < r; ++j) { // Copying elements in leftArray
 rightArray[j] = arr[mid + 1 + j];
 }

 int i = 0, j = 0;
 int k = left;
 while (i < l && j < r) { // Copying the smaller element in
 if (leftArray[i] <= rightArray[j]) {
 arr[k] = leftArray[i];
 i++;
 } else {
 arr[k] = rightArray[j];
 j++;
}
 k++;
 }
 while (i < l) { // Copying any remainnig left

 arr[k] = leftArray[i];
 i++;
 k++;
 }
 while (j < r) { // Copying any remainnig right
 arr[k] = rightArray[j];
 j++;
 k++;
 }
   }

 void sort(int arr[], int left, int right) {
 if (left < right) { // Continue recursion if th

int mid = (left + right) / 2; // Index middle elemnt of array
sort(arr, left, mid); // Recursive call left
 sort(arr, mid + 1, right); // Recursive call right
 merge(arr, left, mid, right); // Mergin the left and right array
 }
 }

 public static void main(String args[]) {
 int arr[] = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};
 MergeSort ob = new MergeSort(); // Creating Object of MergeSort
 ob.sort(arr, 0, arr.length - 1); // Calling the method
 // Printing the output
 System.out.println("Sorted array");
 for (int i = 0; i < arr.length; i++) {
 System.out.println(arr[i] + "");
 }
 }
 }