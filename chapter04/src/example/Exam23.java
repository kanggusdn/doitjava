package example;

import java.util.Scanner;
import java.util.Random;

public class Exam23 {
	public static void main(String[] args) {
	    Random random = new Random(); 
	    int ans =  (int)(Math.random() * 100) +1;
	    int MAX_OPPORTUNITIES = 7;
	    int num = 0; 
	    boolean isCorrect = false; 
	    for (int i = 0; i < MAX_OPPORTUNITIES; i++) { 
	      Scanner scan = new Scanner(System.in); 
	      System.out.printf("��ǻ�Ͱ� ���� ������ ���ڸ� ���߼���. \n�߻��� ���ڴ�? "); 
	      num = scan.nextInt(); 
	      if (ans == num) { 
	        System.out.printf("%dȸ������ ������ ���߾����ϴ�. %n", (i+1)); 
	        isCorrect = true; 
	        } else if (num > ans) { 
	        //System.out.println("�Է��� ���ڰ� ���亸�� ū ���Դϴ�."); 
	        System.out.println("High"); 
	        isCorrect = false; 
	        } else { 
	        //System.out.println("�Է��� ���ڰ� ���亸�� ���� ���Դϴ�."); 
	        System.out.println("Low"); 
	        isCorrect = false; 
	     } 
	  } 
	    
	  if(!isCorrect) { 
	    System.out.println("�ƽ����ϴ�. ������"+MAX_OPPORTUNITIES+"�� �õ��� ������ ���߽��ϴ�."); 
	 }
	}
} 
