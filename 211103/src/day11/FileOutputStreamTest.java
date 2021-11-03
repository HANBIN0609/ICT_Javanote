package day11;
import java.io.*;
/*[실습] 키보드로 입력받아 쓴 내용을 파일(result.txt)에 저장해보자.
 * 1) 데이터 소스 : 키보드 ================> System.in
 * 2) 데이터 목적지 : 파일(result.txt)=====> FileOutputStream
 */
public class FileOutputStreamTest {

	public static void main(String[] args) 
	throws IOException
	{
		System.out.println("입력하세요. 입력한 내용은 result.txt에 저장됩니다.");
		String file = "src/day11/result.txt";
		int n = 0, count = 0;
		
		// 파일과 노드 연결 스트림 생성
		FileOutputStream fos = new FileOutputStream(file, true);
		// true값을 주면 append(덧붙이기) 함
		// 기존 파일 내용에 이어붙임
		
		while((n=System.in.read())!= -1)  {
			fos.write(n);
			fos.flush(); // 스트림에 남아있는 데이터를 밀어내기 해줌
			count++;
		}// while-----
		
		System.out.println(count+"바이트 씀");
		fos.close();
		System.in.close();
		System.out.close();
	}

}
