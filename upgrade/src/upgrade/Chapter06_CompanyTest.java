package upgrade;

public class Chapter06_CompanyTest {
	public static void main(String[] args) {
		Chapter06_Company myCompany1 = Chapter06_Company.getInstance();
		Chapter06_Company myCompany2 = Chapter06_Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}
}
