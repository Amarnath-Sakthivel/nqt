package com.wipro.javapractice;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class nqt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		int[] weight = new int[items];
		int[] values = new int[items];
		for (int i = 0; i < items; i++) {
			System.out.println("weight: "+(i+1));
			weight[i]=sc.nextInt();
			System.out.println("values: "+(i+1));
			values[i]=sc.nextInt();
		}
		HashSet<Integer> weightHashSet=new LinkedHashSet<Integer>();
		HashSet<Integer> valuesHashSet=new LinkedHashSet<Integer>();
		System.out.println("____________________________________________________");
		for(int i=0;i<items;i++) {
			for(int j=i+1;j<items;j++) {
				weightHashSet.add(weight[i]+weight[j]);
				valuesHashSet.add(values[i]+values[j]);
			}
		}
		System.out.println("Maximum total value in the knapsack: "+Collections.max(valuesHashSet));
	}

}
