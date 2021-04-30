package myproject;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(100);
		v.add(2);
		v.add(3);
		v.add(0,99);
		v.add(1);
	
		System.out.println("���� ���� ��� ��ü ��: " + v.size());
		System.out.println("������ ���� �뷮: " + v.capacity());
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("������ �ִ� ���� ��: " + sum);
		System.out.println();
	}
}
