package basic;

import java.util.Random;
import java.util.Scanner;

public class Game123 {
//	public static String IntToStr(int data) {
//		String sValue = "";
//		if (data == 0) {
//			sValue = "가위";
//		}
//		if (data == 1) {
//			sValue = "바위";
//		}
//		if (data == 2) {
//			sValue = "보";
//		}
//		return sValue;
//		// int -> String
//	}

	public static void main(String[] args) {
		// 게임은 반복된다.
		// 컴퓨터와 나의 가위바위보 게임
		// 컴퓨터는 랜덤하게 가위바위보를 내고, 나는 가위 바위 보 중 하나 입력
		// 결과를 보여준다.
		Scanner sc = new Scanner(System.in);
		System.out.println("202030117 오성민");

		while (true) {
			System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
			System.out.print("입력 >> ");
			String me = sc.nextLine();
			int nMe = 0;
			
			Random rand = new Random();
			int com = rand.nextInt(3); // 0~2까지 랜덤 가위:0 바위:1 보:2
			String sCom = "";
			// 내가 낸게 가위, 바위, 보가 맞는지, 맞으면 0,1,2 를 me 값에 넣음
			if (me.equals("가위")) {
				nMe = 0;
			}
			els if (me.equals("바위")) {
				nMe = 1;
			}
			else {
				nMe = 2;
			}
			// com이 낸게 0,1,2 가 맞으면 가위 바위 보로 출력
			if (com == 0) {
				sCom = "가위";
			}
			else if (com == 1) {
				sCom = "바위";
			}
			else {
				sCom = "보";
			}

			System.out.println("나는 " + me + " 컴퓨터는 " + sCom + "를 냈습니다.");
			// 가위,바위,보 이길 때, 비길 때, 질 떄 경우의수 비교
			if (nMe == 0 && com == 2 || nMe == 1 && com == 0 || nMe == 2 && com == 1) {
				System.out.println("이겼다");
			} else if (nMe == 0 && com == 0 || nMe == 1 && com == 1
					|| nMe == 2 && com == 2) {
				System.out.println("비겼다");
			} else {
				System.out.println("졌다.");
			}
		}
	}
}
