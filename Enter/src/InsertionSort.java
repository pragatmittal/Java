package io.github.jiangdequan;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner( System.in);
        System.out.println("enter no of elements");
        int n=scan.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the elements");

        for (int i = 0; i < n; i++) {
         arr[i]=scan.nextInt();   
        }
        for( int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=temp;
                

            }
            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
