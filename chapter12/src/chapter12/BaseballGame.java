package chapter12;

import java.util.Random;
	 
public class BaseballGame {
	    static int gameCnt = 0;                
	    static int strCnt = 0;
	    static int ballCnt = 0;
	    static int ball = 0;
	    static int strike = 0;
	    static int number1;                                                            
	    static int number2;
	    static int number3;
	    
	    // 3���� �������� ���� ���� (0~9)
	    public void setNum() {                                                        
	        
	        boolean stop = false;
	        Random random = new Random();
	            
	        while(!stop) {
	            number1 = random.nextInt(10);
	            number2 = random.nextInt(10);
	            number3 = random.nextInt(10);
	            
	            if((number2==number1) || (number2==number3)) {                        //     ���� ���ڰ� ���� ��� �缳��
	                number2 = random.nextInt(10);
	            }else if((number3==number1) || (number3==number2)) {
	                number3 = random.nextInt(10);
	            }else {
	                stop = true;
	            }
	        }
	        System.out.println("******** ���� �߱������� �����մϴ�! ********"); 
	        System.out.println("( 0 ~ 9������ ���� 3���� �Է����ּ���. )");
	        
	    }
	    
	    
	    // user�κ��� 3���� �Է��� �޴� �޼ҵ�
	    public void getNum(int num1, int num2, int num3) {                            
	                    
	        strCnt = cntStrike(num1, num2, num3);
	        ballCnt = cntBall(num1, num2, num3);
	        gameCnt++;
	                
	        System.out.println("(" + gameCnt + "��° �õ�)");
	        System.out.println("�Է��� ���� => "+num1+", "+num2+", "+num3+"\t��� => "+"S: "+ strCnt + " /B: " + ballCnt);
	        System.out.println("-------------------------------------------");
	        
	        checkAns();
	    }
	        
	    
	    // 3���� �Է��� ���ڸ� Ȯ���ϴ� �޼ҵ�
	    public static int cntBall(int a, int b, int c) {                            
	        
	        ball = 0; 
	        
	        if((a == number2) || (a == number3)) 
	            ball++;
	        if((b == number1) || (b == number3)) 
	            ball++;
	        if((c == number1) || (c == number2)) 
	            ball++;
	        
	        return ball;
	    }
	    
	        
	    // 3���� �Է��� �ڸ����� Ȯ���ϴ� �޼ҵ�
	    public static int cntStrike(int a, int b, int c) {                            
	        
	        strike = 0;
	        
	        if((a == number1)) 
	            strike++;
	        if(b == number2) 
	            strike++;
	        if(c == number3) 
	            strike++;
	        
	        return strike;
	    }
	        
	    
	    //    ���� üũ�ϴ� �޼ҵ� 
	    public static void checkAns() {                                                
	            
	        if(gameCnt >= 10) {
	            System.out.println("<<<<<<<<<<<<<< Game OVER !! >>>>>>>>>>>>>>>");                    // gameCnt(���ӽõ�Ƚ��)�� 10ȸ�̻��̸� ���ӿ���
	            System.out.printf("������ %d, %d, %d�����ϴ�.", number1, number2, number3);
	        }else if(strCnt == 3){
	            System.out.println("======= Game WIN!! ������ ���߼̽��ϴ�. =======");            
	            // strCnt�� 3���̸� ���� ���.
	        }
	  }
} //Class Ended