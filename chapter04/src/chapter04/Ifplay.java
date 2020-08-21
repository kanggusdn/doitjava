package chapter04;

public class Ifplay {
	public static void main(String[] args) {
		 int point = 90;
		 char Grade = 0;
		 if(point >= 90) {
			 Grade = 'A';
		 } else if(point > 80) {
			 Grade = 'B';
		 } else if(point > 70) {
			 Grade = 'C';
		 } else if(point > 60) {
			 Grade = 'D';
		 }
		 System.out.println(point + "점의 등급은 " + Grade + "입니다.");
		 }
		 
	}
