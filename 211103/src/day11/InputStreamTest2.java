package day11;
import java.io.*;
/* System.out
 * - PrintStreamŸ��
 * - 1byte��� ��Ʈ��
 * - �ְܼ� ��� �����ϴ� ��� ��Ʈ��
 * - �ֿ� �޼ҵ�
 *   print()/println()
 *   public void write(int b)
 */

public class InputStreamTest2 {

	public static void main(String[] args) throws IOException{
		
		int n = 0, count = 0;
		
		while((n = System.in.read()) != -1) {
			//System.out.println((char)n);
			System.out.write(n);
			count++;
		}
		System.out.println("Total: "+count+"bytes");
		System.in.close();
		System.out.close();
	}

}
