class Re369{
   public static void main(String[] args){
      System.out.println("369 Start~");
      int nCount = 0;
      //loop 시작
      for(int k=1; k<1000; k++){
         int nNo = k;
         String sNo = "";
         sNo = nNo + "";
         int nLen = sNo.length(); //5
   
         nCount = 0;
         5
         1 2 3 4
         0 1 2 3
         for(int i=0; i<nLen; i++){
            String sTemp = sNo.substring(i,i+1);//24996;
            if(sTemp.equals("3")||sTemp.equals("6")||sTemp.equals("9")){
               nCount++;
            }
         }
         System.out.print(sNo);  
         for(int j=0; j<=nCount; j++){
            System.out.print("짝");
         }
      }   //loop 끝
   }
}
      //sTemp1 = sNo.substring(0,1);
      //2 + "" ="2" 문자 ->숫자
      //3 6 9 체크
      //1335 133 5 13 3 1 3
      //134679
      
      //int nNo = 1234567;   
      
      
      //sNo.substring(0,1) //2
      //sNo.substring(1,2) //4
      //sNo.substring(2,3) //9
      //sNo.substring(3,4) //9
        sNo.substring(4,5)