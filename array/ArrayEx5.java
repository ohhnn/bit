package bit.basic.array;
//최댓값, 최솟값, 근사값, 편차, 최빈값, 합계, 평균, 개수 ,평균이상 개수, 평균이하갯수
public class ArrayEx5 {
	private int []m=new int[5];
	public ArrayEx5() {
		for(int i =0; i<m.length; i++) {
			m[i]=(int)(Math.random()*100);
		}
	}
	public void print( ) {
		for(int i =0; i < m.length; i++) {
			System.out.printf("%5d",m[i]);
		}
		System.out.println();
		 System.out.println("최댓값:"+maxValue(1));
		 System.out.println("최솟값:"+minValue(1));
	}
	public int nearValue(int order) {
		int target = 10;
		int min = 0;
		for(int i =0; i<m.length; i++) {
			int abs = Math.abs( target-m[i]); 
			
		}
	}
	public int maxValue(int order) {
		sort(0);
		return m[order-1];
	}
	public int minValue(int order) {
		sort(1);
		return m[order-1];
	}
	public void swap(int i, int j) {
		int imsi = 0;
		imsi=m[i];
		m[i]=m[j];
		m[j]=imsi;
	}
	public void sort(int order) {
		for(int i=0; i<m.length-1; i++) {
			for(int j = i+1; j<m.length; j++) {
				if (order ==0) { // 내림차순
					if(m[i] < m[j]) {
						swap(i,j);
					}
				}
				else {
					if(m[i] > m[j]) {
						swap(i,j);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		ArrayEx5 a=new ArrayEx5();
		a.print();
	}

}
