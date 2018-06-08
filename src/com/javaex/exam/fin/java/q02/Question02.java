package com.javaex.exam.fin.java.q02;

import java.util.ArrayList;
import java.util.List;

public class Question02 {
	public int getAnswer(int toNum) {
		//	TODO: 이곳에 해답을 작성합니다.

		List<Integer> arr = new ArrayList<Integer>();
		int count=1;
		int result = 0;
		int arrsize = 0;
		
		for(int i=1;i<=toNum;i++) {
			if(toNum % i == 0) {
				arr.add(i);
			}
		}
		
		System.out.println(arr.toString());
		
		//////////////////////////////////////
		//받아온 약수로 최소공배수를 구하는 알고리즘을 생각하지 못했습니다.
		//////////////////////////////////////
		
		arrsize = arr.size();
		for(int i=0;i<100000;i++) {
			
			if(arr.get(arrsize)%i!=0) {
				continue;
			}else if(arr.get(arrsize)%i==0) {
				
				continue;
			}
			
		}
		

		return 0;
	}
}
