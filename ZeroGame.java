import java.util.Scanner;
class ZeroGame{
	public static void main(String[] args){
		int nUser=0; int nNewUser = 0; int nCom = 0;
		Scanner sc = new Scanner(System.in);		

		//��� ���ؼ� ǥ��
		//loop ����
		//int nwhileCont = 1;
		while(true){
		   nCom = (int)(Math.random() * (nNewUser+1) ) + 0;
		   System.out.println("���� ���� ����~");
		   System.out.println("�����ο��� �Է��ϼ���, ��,�ִ� 9�� ~");
		   nNewUser = sc.nextInt();
		
		   if(nNewUser > 9){
		      System.out.println("�ִ� �ο��� �Ѿ����ϴ�. �ٽ� �Է��ϼ���.");
		      continue; // while������ �̵�
		   }		   
		   
		   //loop ����
		   int nWhileUser = 1;
		   while(nWhileUser == 1){
		      System.out.println("�Ͼ �ο��� �Է��ϼ���~");
		      nUser =  sc.nextInt();
		      if(nNewUser < nUser){
		         continue;// while������ �̵�
		      }
		      else{
		         nWhileUser = 0;
		      }
		   }
		   //loop ��
		   if(nCom == nUser){
		      System.out.println("��ǻ�� ���� " + nCom +" ��ǻ�� ��~");
		   }
		   else {
		      System.out.println("��ǻ�� ���� " + nCom +" ��ǻ�� �й�~");
		   }

		   System.out.println("��� �Ͻðڽ��ϱ�? Yes: 1; No:2 ");
		   int nValue = sc.nextInt();
		   if(nValue == 2){
		      break;
		   }
		}
		//loop ��
	}
}