package histogram;

import java.util.Scanner;

//1. ���ĺ��� �Է� ���� 
//2. ���Ṯ�ڸ� �Է� �޴´� 
//3. ���Ṯ�ڸ� ���� �������� ������ ����(���鹮�� ����) 
//4. ������׷��� �׸�
public class AlphabetHistogramApp {
	private int histoData [] = new int [26];
	
	public AlphabetHistogramApp() {
		for(int i=0; i<histoData.length; i++) {
			histoData[i] = 0;
		}
	}
	public void run() {
		String s = readString();
		makeHistogram(s);
		drawHistogram();
	}
	
	private void makeHistogram(String s) {
		s = s.toUpperCase();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				int index = c - 'A';
			histoData[index]++;

			}
		}
	}
	
	private void drawHistogram() {
		System.out.println("\n������׷��� �׸��ϴ�.");
		for(int i=0; i<histoData.length; i++) {
			System.out.print((char)('A'+i));
			System.out.print("(" + histoData[i] + ")\t");
			
			for(int j=0; j<histoData[i]; j++)
				System.out.print('-');
			System.out.println();
		}
	}
	
	private String readString() {
		System.out.println("���ĺ��� �Է��ϼ���.");
		System.out.println("�Է��� ����Ǹ�, ���Ṯ��(;)�� �Է��ϰ�, ���͸� �Է��ϼ���.");
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			
			if(line.equals(";"))
				break;
			sb.append(line);
		}
		sc.close();
		return sb.toString();
	}
	
	public static void main(String[] args) {
		AlphabetHistogramApp app = new AlphabetHistogramApp();
		app.run();
	}
}












//Scanner sc = new Scanner(System.in);
//String sValue = sc.nextLine();
//String cLast = sc.next();
//boolean nWhile = true;
//int nStrCount = 0;
//String[] s = sValue.split(" ");
//while(nWhile) {
//	if(cLast.equals(";")) {
//		nStrCount = s.length;
//		System.out.println(nStrCount);
//	}
//}