package upgrade;
//이 코드는 명령 프롬프트에서 실행 가능
import java.io.Console;

public class Chapter15_ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console();

		System.out.println("이름:");
		String name = console.readLine();
		System.out.println("직업:");
		String job = console.readLine();
		System.out.println("비밀번호:");
		char[] pass = console.readPassword();
		String strPass = new String(pass);

		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}
}
