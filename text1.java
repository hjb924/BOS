public class Test1 {
	public static void main(String[] args) {
		System.out.println("请输入数字：");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String binaryString = Integer.toBinaryString(n);
		System.out.println(binaryString);
		Test1 test1 = new Test1();
		int x = test1.returnint1(n);
		System.out.println(x);
		
	}
	public int returnint1(int n) {
		int num =0;
		while (n!=0) {
			n= n&(n-1);
			num+=1;
		}
		//System.out.println(num);
		return num;
		
	}

}
