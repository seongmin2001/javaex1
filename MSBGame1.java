//�Լ� �����
import java.util.Scanner;
class RSPGame{
   
   public static void ScrPrint( String sMsg ) {           //non static ���� <- Ŭ���� ����� static ���� 
      System.out.println(sMsg);
   }
   public static int MyRandom (int nStart, int nCount){
      int nResult = (int)(Math.random() * nCount ) + nStart;
      return nResult;
   }
   public static void CurrDisplay (int nMy2, int  nCom2 ) {
      if(nMy2 == 1){
         ScrPrint("�� " + " ����");
      }
      if(nMy2 == 2){
         ScrPrint("�� " + " ����");
      }
      if(nMy2 == 3){
         ScrPrint("�� " + " ��");
      }
      if(nCom2 == 1){
         ScrPrint("��ǻ�� " + " ����");
      }
      if(nCom2 == 2){
         ScrPrint("��ǻ�� " + " ����");
      }
      if(nCom2 == 3){
         ScrPrint("��ǻ�� " + " ��");
      }
   }
   
	//���� : 1, ���� : 2, �� : 3
	//1.�� �Է�, ��ǻ�� ���� ������ �Է� ����
	//2.���� ��ǻ�Ͷ� ��
	//3.���   
   public static void main(String[] args){
      Scanner MyScan = new Scanner(System.in);
      int nMy = 0;
      int nCom = 0; 
      String sAttacker = "";
      int AttackResult = 0;
      int nWhile;
      //loop ����
      nWhile = 1;
      while(nWhile == 1){
         ScrPrint("����������!~~~");
         nMy = MyScan.nextInt();
         nCom = MyRandom(1, 3);//1~3���� ����
         CurrDisplay(nMy,nCom);
         switch(nCom-nUser) {
            case -2: case 1:
               ScrPrint("��ǻ�� �̱�"); nWhile = 0; break;
            case -1: case 2:
               ScrPrint("����� �̱�"); nWhile = 0; break;
            case 0:
               ScrPrint("��� �ٽó�����"); break;
         }
      }
      //loop ��
      while(nWhile == 1){
         ScrPrint("�����!~~~");
         nUser = myScan.nextInt();
         nCom = MyRandom(1,3);
         switch(nCom-nUser) {
            case -2: case 1:
               ScrPrint("��ǻ�� �̱�"); sAttacker = "C"; break;
            case -1: case 2:
               ScrPrint("����� �̱�");  sAttacker = "U"; break;
            case 0:
               if(sAttacker.equals("C")) ScrPrint("��ǻ�� ��");
               else ScrPrint("����� �� ");
               nWhile = 0; 
               break;
         }
      }
      }
      //1.
      //loop ��
      //if ���� ���� ������ ��
      //�ƴϸ� ��� ���ư�

      //ȭ�鿡 ǥ��:
      //���ؼ� ��� ǥ��: ���� �̰��/����
   }
}

      /*switch(nCom-nUser) {
           case -2: case 1:
              ScrPrint("��ǻ�� ��"); break;
           case -1: case 2:
              ScrPrint("��ǻ�� ��"); break;
           case 0:
              ScrPrint("��ǻ�� ��"); break;
      */