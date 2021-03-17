class example{
   public static void main(String[] args)
String sValue = "1233213";
char chTemp;
int nCount = 0;
for(int k=0; k < sValue.length(); k++) {
   chTemp = sValue.charAt(k);
   if ( chTemp =='3') {
         nCount = nCount + 1;
      }
   }
   System.out.println("3ÀÇ °¹¼ö´Â " + nCount);
}