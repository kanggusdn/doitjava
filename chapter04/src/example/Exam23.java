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
	      System.out.printf("컴퓨터가 만든 임의의 숫자를 맞추세요. \n발생된 숫자는? "); 
	      num = scan.nextInt(); 
	      if (ans == num) { 
	        System.out.printf("%d회수만에 정답을 맞추었습니다. %n", (i+1)); 
	        isCorrect = true; 
	        } else if (num > ans) { 
	        //System.out.println("입력한 숫자가 정답보다 큰 수입니다."); 
	        System.out.println("High"); 
	        isCorrect = false; 
	        } else { 
	        //System.out.println("입력한 숫자가 정답보다 적은 수입니다."); 
	        System.out.println("Low"); 
	        isCorrect = false; 
	     } 
	  } 
	    
	  if(!isCorrect) { 
	    System.out.println("아쉽습니다. 정답을"+MAX_OPPORTUNITIES+"번 시도에 맞추지 못했습니다."); 
	 }
	}
} 
