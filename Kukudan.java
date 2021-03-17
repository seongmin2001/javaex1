class Kukudan
{
   public static void main(String[] args)
   {  
      int a,b;
      int sum = 0; 
      a = 1;
      while(a < 10){
         if ((a % 2 == 1)) {
            b = 1;
            while(b < 10){
           
               System.out.println(a+" * "+b + " = " + a*b);
               sum = sum + a*b;  
               b++;
            }
 	     b=1;
         }
                     a++;
      } 
                        System.out.println(sum);
   }
   
}  
/*      
   for(int i=1; i<=9; i++){
         for(int j=1; j<=9; j++){
            System.out.println( i + " * " + j + " = " + i*j );	
         }
            System.out.println();
      }
*/

