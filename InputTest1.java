class InputTest1
{
	public static void main(String[] args) throws Exception
	{
		int nlnput = 0;
		String sMsg = "입력한 숫자는 ";

		System.out.println("입력하세요~~");
		nlnput = System.in.read();
		System.out.println(sMsg + nlnput);	
	}
}