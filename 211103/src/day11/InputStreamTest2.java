package day11;
import java.io.*;
/* System.out
 * - PrintStream타입
 * - 1byte기반 스트림
 * - 콘솔과 노드 연결하는 노드 스트림
 * - 주요 메소드
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
