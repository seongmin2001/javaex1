class RandomTest{
   public static void main(String[] args){

      //1~45 �߿� 6���� ���ǹ�ȣ�� ����
      //�ߺ��Ǵ� ��ȣ�� ����
      //ȭ�鿡 ǥ��

      int nRandom;
      nRandom = (int)(Math.random() * 3) + 1;
      System.out.println("Random=" + nRandom);
   }
}

      //Math.random() :         0 <= X < 1 :�Ǽ�
      //		             0 ~ 0.999999
      //Math.random() * 3 :     0 <= X < 3 :�Ǽ�
      //                                0 ~ 2.99999
      //(Math.random() * 3) +1 :     0 <= X < 3 :�Ǽ�
      //                                0 ~ 2.99999
      //(int)(Math.random() * 3) +1 :     1,2,3 ����