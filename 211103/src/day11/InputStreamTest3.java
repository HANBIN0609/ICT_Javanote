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

public class InputStreamTest3 {

	public static void main(String[] args) throws IOException{
		
		int n = 0, count = 0, total = 0;
		// 데이터를 1바이트 단위로 이동하는 것이 아니라
		// 배열(달걀판)에 담아서 이동시켜보자
		
		byte[] data = new byte[6]; // 달걀판
		
		while((n = System.in.read(data)) != -1) {
			//System.out.println((char)n);
			//n: 읽은 바이트 수 (달걀판에 담은 달걀 개수)
			System.out.write(data, 0, n);
			count++; // 반복문 횟수
			total += n; // 읽은 바이트 수
		}
		System.out.println("Total: "+total+"bytes");
		System.in.close();
		System.out.close();
	}

}
