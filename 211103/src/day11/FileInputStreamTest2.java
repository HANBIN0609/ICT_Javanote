package day11;
import java.io.*;
/*FileInputStream
 * - 1byte 기반 스트림
 * - 노드 스트림(파일과 노드 연결함)
 */
public class FileInputStreamTest2 {

	public static void main(String[] args) 
	throws FileNotFoundException, IOException{
		String file 
		= "C:\\Users\\ict01-15\\eclipse-workspace2\\hbinjava\\src\\day11\\InputStreamTest.java";
		// 데이터소스: 파일 === FileInputStream 
		
		FileInputStream fis = new FileInputStream(file);
		// 파일과 노드 연결
		
		int n = 0, count = 0, total = 0;
		byte[] data = new byte[1024];
		// 파일데이터를 byte배열에 담아서 읽고 콘솔에 출력해보세요.
		
		// 파일의 끝을 만나면 -1을 반환한다.
		while((n=fis.read(data)) != -1) {
			System.out.write(data, 0, n);
			count++; // 반복문 횟수
			total += n; // 파일크기
		}//while-----
		System.out.println("총 "+total+"bytes");
		fis.close();
		System.out.close();
	}

}
