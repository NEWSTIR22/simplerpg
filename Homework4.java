package Home;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
	
	public static void main(String[] args) {
		//• 有個一維陣列如下:
		//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		//	(提示:陣列,length屬性)
	
		int i;
		int j;
		int avg =0;

		int[] number3 = new int[10];
		int[] number1 ={29, 100, 39, 41, 50, 8, 66, 77, 95, 15};

		
		for(i = 0; i < number1.length; i++) {
			avg += number1[i]; 
			

		}System.out.println("平均值" + avg / 10);

	
		for(j = 0 ; j<number3.length ;j++) {
			number1[j] +=0;
			

			if(number1[j] >= (avg / 10)){

		
			System.out.println(number1[j]);
			}
			else {}
			
		}
		
		
		
		
		
		//• 請建立一個字串,經過程式執行後,輸入結果是反過來的
		//  例如String s = “Hello World”,執行結果即為dlroW olleH
		//  (提示:String方法,陣列)

		String hw = "Hello World";
		int number4 = hw.length();
		while( 0 < number4 ){
			number4--;
			char wh = hw.charAt(number4);
			System.out.print(wh+"\t");
			}System.out.println();
		  
			
			
			
			
		//• 有個字串陣列如下 (八大行星):
		//  {"mercury", "venus", "earth", "mars", "jupiter", "saturn", 
		//   "uranus", "neptune"}
		//  請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		//  (提示:字元比對,String方法)
			
		char ka = 'a';
		char ke = 'e';
		char ki = 'i';
		char ko = 'o';
		char ku = 'u';
		int  kka= 0;

		int m;
		int n=0;
		String q="";
		String array2[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		  
		for(m = 0 ; m < array2.length; m++) {
			q += array2[m];
				
		} 
			
		int allnumber = q.length();
		while(n<allnumber) {
			char number8 = q.charAt(n++);
			  
			if(ka==number8||ke==number8||ki==number8||ko==number8||ku==number8) {
				kka++;	  
				}
			
				}System.out.println(kka+"個母音");
			
				
				
				
				
		//• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個
		//	____________________________________
		//	其員工編號與身上現金列表如下:                
		//	員工編號  25     32    8     19    27  
		//	身上現金  2500   800   500   1000  1200
		//	____________________________________
		//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
		//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
		//	員工編號: 25 19 27 共 3 人!」
	
		String[] staff = {"25","32","8","19","27"};
		int[] money =    {2500,800,500,1000,1200};
		Scanner sa = new Scanner(System.in);
		int choice;
		int x;
		int y=0;
		int z=0;
		
		for(x=0; x<staff.length;x++) {
			
		}
		
		for(x=0; x<money.length;x++) {	
				
		}
		
		choice = sa.nextInt();
		x=0;
		System.out.print("「有錢可借的員工編號："+"\t");
		
		while( y<money.length) {
			
			if( choice <= money[x]) {
				System.out.print(staff[x]+"\t");
				x++;
				y++;
				z++;

			}
			
			else {
				x++;
				y++;
				
			}
			
		}System.out.println("共"+ z +"人");

		
		
		
		
		//• 請設計一隻程式由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,
		//	它會顯示是該年的第幾天
		//	例:輸入 1984 9 8 三個號碼後,程式會顯示「西元1984年,第250天」
		//	(提示1:Scanner,陣列)
		//	(提示2:需將閏年條件加入)
		//	(提示3:輸入月份如為2月,則日期不該超過29天)
		
		Scanner sb = new Scanner(System.in);
		int[] choice1 = {sb.nextInt(), sb.nextInt(), sb.nextInt()};
		
		int number = 0;
		int a = 0;
		
		int[] date1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] date2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
		if( choice1[1] == 0  || choice1[1] > 12 || choice1[2] > 31 ){
			
			System.out.println("請重新輸入日期");	
			
			
		}else if( choice1[0] / 4 != 0 ){
			for( a = 0; a < choice1[1]-1; a++) 
				number += date1[a];
			
			System.out.println("西元" + choice1[0] + "年,第" + (number+choice1[2]) + "天");
		
			
		}else if( choice1[0] / 4 == 0 ) {
			for( a = 0; a < choice1[1]-1; a++)
				number += date2[a];
			
			System.out.println("西元" + choice1[0] + "年,第" + (number+choice1[2]) + "天");
			
		}
		
		
		
		
		
		
		//•	班上有8位同學,他們進行了6次考試結果如下:
		//	請算出每位同學考最高分的次數
		//	(提示:二維陣列)
	
		//	1號   2號　3號　 4號   5號    6號    7號    8號
		//	10  35  40  100 90  85  75  70 
		//	37  75  77  89  64  75  70  95
		//	100 70  79  90  75  70  79  90
		//	77  95  70  89  60  75  85  89 
		//	98  70  89  90  75  90  89  90
		//	90  80  100 75  50  20  99  75
		
		int[][] score = {
				{ 10,  35, 40, 100, 90, 85, 75, 70 },
				{ 37,  75, 77,  89, 64, 75, 70, 95 },
				{ 100, 70, 79,  90, 75, 70, 79, 90 },
				{ 98,  70, 89,  90, 75, 90, 89, 90 },
				{ 90,  80, 100, 75, 50, 20, 99, 75 }};
	
		int[][] score2 = {
				{ 10,  35, 40, 100, 90, 85, 75, 70 },
				{ 37,  75, 77,  89, 64, 75, 70, 95 },
				{ 100, 70, 79,  90, 75, 70, 79, 90 },
				{ 98,  70, 89,  90, 75, 90, 89, 90 },
				{ 90,  80, 100, 75, 50, 20, 99, 75 }};
	
		int [] student ={ 0, 0, 0, 0, 0 ,0 ,0 ,0 };
		int i1 = 0;
		int i2 = 0;
		
		
		for( i1 = 0; i1 < score.length; i1++) { //兩個分數迴圈
			
			for(i2= 0; i2 < score[i1].length; i2++) {
			score[i1][i2] += 0; 
			score2[i1][i2] += 0;
			
			}
			
		}
	
	
		
		i1 = 0;
		while( i1 < score.length ) { //將其中一個分數迴圈排序
			Arrays.sort(score[i1]);
			i1++;
		}
	
		
	
		i1 = 0;
		i2 = 0;
		while( i1 < score.length ) {
			
			if( score[i1][7] != score2[i1][i2] ) { //同排比對
				i2++;
			
			}
			
			else{ //索引值對應到學生，++是次數，清空學生索引值
				i1++;
				student[i2]++;
				i2 = 0;
				
			}
	
		}System.out.println("1號："+student[0]+"\n2號："+student[1]+"\n3號："+student[2]+"\n4號："+student[3]+"\n5號："+student[4]+"\n6號："+student[5]+"\n7號："+student[6]+"\n8號："+student[7]);
			
		
	}

	
}
	


		


	
	
	
	
	
	
	
	
	
