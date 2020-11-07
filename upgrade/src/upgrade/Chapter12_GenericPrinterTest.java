package upgrade;

public class Chapter12_GenericPrinterTest {
	public static void main(String[] args) {
		Chapter12_GenericPrinter<Chapter12_Powder> powderPrinter = new Chapter12_GenericPrinter<Chapter12_Powder>();
		powderPrinter.setMaterial(new Chapter12_Powder());
		powderPrinter.printing();

//		Chapter12_Powder powder = powderPrinter.getMaterial();
//		System.out.println(powderPrinter);

		Chapter12_GenericPrinter<Chapter12_Plastic> plasticPrinter = new Chapter12_GenericPrinter<Chapter12_Plastic>();
		plasticPrinter.setMaterial(new Chapter12_Plastic());
		plasticPrinter.printing();

//		Chapter12_Plastic plastic = plasticPrinter.getMaterial();
//		System.out.println(plasticPrinter);
	}
}
