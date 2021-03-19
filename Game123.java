package basic;

import java.util.Random;
import java.util.Scanner;

public class Game123 {
	public static String StrInt(int data){
		String value = "";
		if(data == 0) {
			value = "가위";
		}
		else if(data == 1) {
			value = "바위";
		}else
			value = "보";
		return value;
	} //string -> int

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Random rand = new Random(); //0:가위 1:바위 2:보 랜덤
	while(true) {
	int c1 = rand.nextInt(3); //0~2만큼 랜덤 뽑음
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("입력 >> ");
		String user = sc.nextLine();
		
			if(user.equals("가위")) {
				user = StrInt(0);
				
			}
			if(user.equals("바위")) {
				user = StrInt(1);
			}
			if(user.equals("보")){
				user = StrInt(2);
			}
			if(c1 == 0) { 
				System.out.println("가위");
			}
			if(c1 == 1) {
				System.out.println("바위");
			}
			if (c1 == 2) {
				System.out.println("보");
			}
			
			
			System.out.println("나는 "+ user + " 컴퓨터는 "+ StrInt(c1) +"를 냈습니다.");
			
			if(user == StrInt(0) && c1 == 2||user == StrInt(1) && c1 == 0||user == StrInt(2) && c1 == 1) {
				System.out.println("이겼다");
			}
			else if(user == StrInt(0) && c1 == 0||user == StrInt(1) && c1 == 1||user == StrInt(2) && c1 == 2) {
				System.out.println("비겼다");
			}else {
				System.out.println("졌다");
			}
		}
	}	
}