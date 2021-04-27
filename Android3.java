//1.입금자를 입력
//2.입금액 입력
//3.최대 입금액은 100,000,000 ,최대 입금 횟수 5회
//4.5회가되면 총 입금횟수랑 입금액, 평균금액을 계산하고 종료
import java.text.DecimalFormat;
import java.util.Scanner;

public class Android3 {
	
	public static void ScrPrint(String s){
		System.out.println(s);
	}
	public static String DecimalComma(double dNum) {
		DecimalFormat formatter = new DecimalFormat("###,###,###");
		return formatter.format(dNum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean nWhile = true;
		int nInputCount = 0; //입금횟수 세줌
		int nMoney = 0;
		int nSumMoney = 0;
		double nAverMoney = 0;
		ScrPrint("입금자를 입력하세요.");
		String Inputer = sc.nextLine();
		while(nWhile) {
				ScrPrint("입금액을 입력하세요.");
				nMoney = sc.nextInt();
				nSumMoney += nMoney;
				nInputCount++;
				if(nInputCount == 5) {
					break;
				}
				if(nMoney > 100000000) {
					ScrPrint("최대 금액을 넘었습니다. 다시 입력하세요.");
					continue;
				}
				System.out.println(DecimalComma(nMoney) + " 원을 입력하였습니다");
				ScrPrint("추가로 입력하시겠습니까?");
				int nSelect = sc.nextInt();
				if(nSelect == 1) {
					continue;
				} else break;
		}
		nAverMoney = (float)(nSumMoney/nInputCount);
		double dTemp = nAverMoney - (int)nAverMoney;
		System.out.println("입금자 : " + Inputer + ", 총 입금횟수: " + nInputCount + "회"
							+ ", 입금액: " + DecimalComma(nSumMoney) +"원" + ", 평균금액: " + DecimalComma(nAverMoney) + String.format("%.2f", dTemp).substring(1,4) + "원");
	}
}
//String.format("%.2f", nAverMoney)
//(double)Math.round(nAverMoney*100)/100.0)
