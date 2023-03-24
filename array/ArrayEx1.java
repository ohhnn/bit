package bit.basic.array;

import java.util.*;

public class ArrayEx1 {
	public void arrayMethod1() {
		int []m = new int[5];//[0] [1] [2] [3] [4] 
		
		for(int i =0; i<m.length; i++) {
			m[i] = (int)(Math.random()*100);
		}
		//System.out.println(Arrays.toString(m));
		for(int i =0; i < m.length; i++) {
			System.out.printf("%5d", m[i]);
		}
		System.out.println();
		for(int i:m) {
			System.out.printf
			("%5d",i);
		}
		System.out.println();
	}
	
	public void arrayMethod2() {
		int [][]m= {{10,20,30},{40,50,60,70,80},{90,91}};
		
//		for (int i=0; i< m.length; i++) {
//			for (int j = 0; j<m[i].length; j++) {
//				System.out.printf("%5d",m[i][j]);
//			}
//			System.out.println
//			();
//		}
//		for(int []i:m) {
//			for(int j:i) {
//				System.out.printf("%5d",j);
//			}
//			System.out.println();
//		}
		for (int[]i:m) {
			System.out.println(Arrays.toString(i));
		}
	}
	public static void main(String[] args) {
		ArrayEx1 a = new ArrayEx1();
		a.arrayMethod2();
	}

}
