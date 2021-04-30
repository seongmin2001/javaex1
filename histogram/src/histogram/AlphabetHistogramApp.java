package histogram;

import java.util.Scanner;

//1. 알파벳을 입력 받음 
//2. 종결문자를 입력 받는다 
//3. 종결문자를 통해 각문자의 개수를 세고(공백문자 제외) 
//4. 히스토그램을 그림
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
		System.out.println("\n히스토그램을 그립니다.");
		for(int i=0; i<histoData.length; i++) {
			System.out.print((char)('A'+i));
			System.out.print("(" + histoData[i] + ")\t");
			
			for(int j=0; j<histoData[i]; j++)
				System.out.print('-');
			System.out.println();
		}
	}
	
	private String readString() {
		System.out.println("알파벳을 입력하세요.");
		System.out.println("입력이 종료되면, 종결문자(;)를 입력하고, 엔터를 입력하세요.");
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