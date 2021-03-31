class RandomTest{
   public static void main(String[] args){

      //1~45 중에 6개의 임의번호를 추출
      //중복되는 번호는 없음
      //화면에 표시

      int nRandom;
      nRandom = (int)(Math.random() * 3) + 1;
      System.out.println("Random=" + nRandom);
   }
}

      //Math.random() :         0 <= X < 1 :실수
      //		             0 ~ 0.999999
      //Math.random() * 3 :     0 <= X < 3 :실수
      //                                0 ~ 2.99999
      //(Math.random() * 3) +1 :     0 <= X < 3 :실수
      //                                0 ~ 2.99999
      //(int)(Math.random() * 3) +1 :     1,2,3 정수