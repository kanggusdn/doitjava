package upgrade;

public class Chapter14_AutoCloseObj implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
	}
}
