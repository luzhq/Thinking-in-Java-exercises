/**
 * 斐波拉切数列（1 1 2 3 5 8 ...）
 * 输入 5 输出 1 1 2 3 5
 * 输入 22 输出 1 1 2 3 5 8 13 21
 *
 */
public class Page75exe9 {

	public static void main(String[] args) {		
		
		System.out.print("请输入数字：   ");
		Scanner scanner = new Scanner(System.in);
		Integer inputNum = scanner.nextInt();
		
		int count = 1;
		int prefixNum = 1;
		int suffixNum = 1;
		while(true){
			if(count == 1 || count == 2){
				System.out.println(suffixNum);
			}else{
				int newSuffixNum = prefixNum + suffixNum;
				prefixNum = suffixNum;
				suffixNum = newSuffixNum;
				if(suffixNum > inputNum){
					break;
				}else {
					System.out.println(suffixNum);
				}
			}
			
			scanner.close();
			count ++;
		}
	}
}
