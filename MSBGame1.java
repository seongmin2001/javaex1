//함수 만들기
import java.util.Scanner;
class RSPGame{
   
   public static void ScrPrint( String sMsg ) {           //non static 오류 <- 클래스 만들면 static 지움 
      System.out.println(sMsg);
   }
   public static int MyRandom (int nStart, int nCount){
      int nResult = (int)(Math.random() * nCount ) + nStart;
      return nResult;
   }
   public static void CurrDisplay (int nMy2, int  nCom2 ) {
      if(nMy2 == 1){
         ScrPrint("나 " + " 가위");
      }
      if(nMy2 == 2){
         ScrPrint("나 " + " 바위");
      }
      if(nMy2 == 3){
         ScrPrint("나 " + " 보");
      }
      if(nCom2 == 1){
         ScrPrint("컴퓨터 " + " 가위");
      }
      if(nCom2 == 2){
         ScrPrint("컴퓨터 " + " 바위");
      }
      if(nCom2 == 3){
         ScrPrint("컴퓨터 " + " 보");
      }
   }
   
	//가위 : 1, 바위 : 2, 보 : 3
	//1.나 입력, 컴퓨터 랜덤 값으로 입력 받음
	//2.나랑 컴퓨터랑 비교
	//3.출력   
   public static void main(String[] args){
      Scanner MyScan = new Scanner(System.in);
      int nMy = 0;
      int nCom = 0; 
      String sAttacker = "";
      int AttackResult = 0;
      int nWhile;
      //loop 시작
      nWhile = 1;
      while(nWhile == 1){
         ScrPrint("가위바위보!~~~");
         nMy = MyScan.nextInt();
         nCom = MyRandom(1, 3);//1~3까지 랜덤
         CurrDisplay(nMy,nCom);
         switch(nCom-nUser) {
            case -2: case 1:
               ScrPrint("컴퓨터 이김"); nWhile = 0; break;
            case -1: case 2:
               ScrPrint("사용자 이김"); nWhile = 0; break;
            case 0:
               ScrPrint("비김 다시내세요"); break;
         }
      }
      //loop 끝
      while(nWhile == 1){
         ScrPrint("묵찌빠!~~~");
         nUser = myScan.nextInt();
         nCom = MyRandom(1,3);
         switch(nCom-nUser) {
            case -2: case 1:
               ScrPrint("컴퓨터 이김"); sAttacker = "C"; break;
            case -1: case 2:
               ScrPrint("사용자 이김");  sAttacker = "U"; break;
            case 0:
               if(sAttacker.equals("C")) ScrPrint("컴퓨터 승");
               else ScrPrint("사용자 승 ");
               nWhile = 0; 
               break;
         }
      }
      }
      //1.
      //loop 끝
      //if 비기면 전에 공격자 승
      //아니면 계속 돌아감

      //화면에 표시:
      //비교해서 결과 표시: 누가 이겼다/비겼다
   }
}

      /*switch(nCom-nUser) {
           case -2: case 1:
              ScrPrint("컴퓨터 승"); break;
           case -1: case 2:
              ScrPrint("컴퓨터 승"); break;
           case 0:
              ScrPrint("컴퓨터 승"); break;
      */