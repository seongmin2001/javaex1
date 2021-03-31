import java.util.Scanner;
class ZeroGame{
	public static void main(String[] args){
		int nUser=0; int nNewUser = 0; int nCom = 0;
		Scanner sc = new Scanner(System.in);		

		//결과 비교해서 표현
		//loop 시작
		//int nwhileCont = 1;
		while(true){
		   nCom = (int)(Math.random() * (nNewUser+1) ) + 0;
		   System.out.println("제로 게임 시작~");
		   System.out.println("참가인원을 입력하세요, 단,최대 9명 ~");
		   nNewUser = sc.nextInt();
		
		   if(nNewUser > 9){
		      System.out.println("최대 인원이 넘었습니다. 다시 입력하세요.");
		      continue; // while문으로 이동
		   }		   
		   
		   //loop 시작
		   int nWhileUser = 1;
		   while(nWhileUser == 1){
		      System.out.println("일어날 인원을 입력하세요~");
		      nUser =  sc.nextInt();
		      if(nNewUser < nUser){
		         continue;// while문으로 이동
		      }
		      else{
		         nWhileUser = 0;
		      }
		   }
		   //loop 끝
		   if(nCom == nUser){
		      System.out.println("컴퓨터 값은 " + nCom +" 컴퓨터 승~");
		   }
		   else {
		      System.out.println("컴퓨터 값은 " + nCom +" 컴퓨터 패배~");
		   }

		   System.out.println("계속 하시겠습니까? Yes: 1; No:2 ");
		   int nValue = sc.nextInt();
		   if(nValue == 2){
		      break;
		   }
		}
		//loop 끝
	}
}