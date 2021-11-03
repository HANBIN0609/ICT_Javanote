package day11;
import java.io.*;
/* 1) smile.png 이미지 파일을 copy.png파일로 복사합시다.
 * 데이터 소스 : 파일(smile.png) =====> FileInputStream
 * 데이터 목적지 : 파일(copy.png)======> FileOutputStream
 * 
 * 단, 배열에 담아서 읽고 쓰세요
 */
public class ImageCopy {

	public static void main(String[] args)
	throws FileNotFoundException, IOException{
		
		int n = 0, total = 0;
		String spng = "C:\\Users\\ict01-15\\eclipse-workspace2\\hbinjava\\src\\day11\\molang.gif";
		String cpng = "src/day11/copy.gif";
		
		byte[] data = new byte[100000]; // 달걀판
		
		FileInputStream fis = new FileInputStream(spng);
		FileOutputStream fos = new FileOutputStream(cpng);
		
		while((n = fis.read(data)) != -1) {
			fos.write(data, 0, n);
			fos.flush();
			total += n;
		}
		
		System.out.println("파일 복사 완료. "+total+"바이트 복사");
		fis.close();
		fos.close();
		System.out.close();
	}

}
