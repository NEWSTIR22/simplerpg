package Home;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3  {
	
    // 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三
    // 角形、其它三角形或不是三角形,如圖示結果:
    // (提示:Scanner,三角形成立條件,判斷式if else)
    // (進階挑戰:加入直角三角形的判斷)

	public static void main(String[]args) {
		Scanner sa = new Scanner(System.in);
  
		int x[] = new int[3];
		x[0] = sa.nextInt();
		x[1] = sa.nextInt();
		x[2] = sa.nextInt();
		int p1 = (int)(Math.pow( x[0],2 ));
		int p2 = (int)(Math.pow( x[1],2 ));
		int p3 = (int)(Math.pow( x[2],2 ));
  
		if(( x[0] + x[1] ) <= x[2] || ( x[0] + x[2] ) <= x[1] || ( x[1] +x[2] ) <= x[0] ) {
			System.out.println("不是三角形");
			
		}
  
		else if( p1 + p2 - p3 == 0 || p1 + p3 - p2 == 0 || p2 + p3 - p1 == 0 ) {
			System.out.println("直角三角形");
			
		}
  
		else if( x[0] == x[1] && x[1] == x[2] ){
			System.out.println("正三角形");
			
		}
 
		else if( x[0] == x[1] || x[1] == x[2] ){
			System.out.println("等腰三角形");
			
		}
  
		else if( x[0] != x[1] || x[1] != x[2] ){
			System.out.println("其他三角形");
			
		}
		
		
		
		
		
		
		// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜
		// 錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
		// (提示:Scanner,亂數方法,無窮迴圈)
		// (進階挑戰:產生0~100亂數,每次猜就會提示你是大於
		// 還是小於正確答案)
 
		//練習2-1
		System.out.println("請輸入數字");
		Scanner sb = new Scanner(System.in);
		int right;
		int wrong;
		right = (int)( Math.random() * 10);
		
		outer:
			for(;;) {
				wrong = sb.nextInt();
				
				if( right != wrong ) { 
					System.out.println("猜錯囉"+ wrong);
					continue outer;
					
				}
				
				else {
					System.out.println("答對了!答案就是" + right);
					break;
					
				}
			
			}
		
		
		
		
		//進階挑戰2-2
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字");
		int ran;
		int choice;
		ran = (int)(Math.random() * 100);
		
		outer:
			for(;;) {
				choice = sc.nextInt();
				
				if( ran != choice ){ 
					if( ran > choice ){
						System.out.println("大於");
						
					}
				
					else{
						System.out.println("小於");
					
					}
					
				}else {
					break outer;
				
				}

				
			}System.out.println("答對了!答案就是" + ran);
			
			
			
			
			
			
		// 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,
		// 但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文
		// 可以輸入他不想要的數字,畫面會顯示他可以選擇的號碼與總數,如圖:
		// (提示:Scanner)// (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重覆)

		//練習3-1
		Scanner sd = new Scanner(System.in);
		int choice2;
		choice2 = sd.nextInt();
		int iA = 0;
		int iB = 0;
		   
		while(iA < 49 && iB < 49) {
			iA++;
			
			if(choice2 == 0 && iA<10) {
				System.out.print( iA +"\t");
			}
			
			else if( iA/10 != choice2  &&  iA%10 != choice2 ) {
				System.out.print( iA +"\t");
			}
			
			if(choice2 == 0 && iA<10) {
				iB++;
				continue;
			}
			
			else if(  iA/10 != choice2 && iA%10 != choice2) {
		    	iB++;
		    continue;
		    
		}
		
		}System.out.println();
		System.out.println("總共有" + iB + "個");
		
		
		
		//進階挑戰3-2
		int iC = 0;
		int i = 0;
		int [] number =new int[ 49];
		while( iC < 49 ) {
			iC++; 
			
			if(choice2 == 0 && iA<10) {
				
			}
			else if( iC/10 != choice2 && iC%10 != choice2) {
				i++;
				number[i] =iC; 
				
			}
			
		}
		    
		
		int j = 0;
		int[] choice3 = new int[6];
		 
		while( j < choice3.length ) {
			int idex =  (int)(Math.random() *  49 ) ;
			
			if( number[idex] != 0 ) {
				System.out.println( number[idex] );
				number[idex] = 0;
				j++;
				
			}
		     
		
		}
		
	
	}
	

}
		         
		         
		         
