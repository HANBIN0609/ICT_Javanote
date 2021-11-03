package day11;
import java.io.*;
/* System.in
 * - InputStream타입
 * - 1byte 기반 스트림
 * - Node 스트림 => 키보드와 노드 연결하는 스트림
 * - 주요 메소드:
 * 	 public int read() : 바이트 입력을 리턴하고 입력이 종료(ctrl+c >>> 윈도우, ctrl+d >>> 리눅스)
 * 						 -1을 반환한다.
 */
public class InputStreamTest {

	public static void main(String[] args) throws IOException { // IO작업할 떄 항상 익셉션이 나므로 예외처리 해야함
		
		int input = 0;
		int count = 0;
		while(true) {
			input = System.in.read();
			System.out.println("input: "+((char)input));
			count++;
			if(input == 'x') break;
		}// while-----
		System.out.println(count+"bytes 입력받음");
		System.in.close();
		System.out.close();
	}

}
