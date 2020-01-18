package Home;

public class Homework2 {

	public static void main(String[] args) {
		
		//請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000) 

	     int i1 = 1;
	     int i2 = 0;
	     while( i1 <= 1000 ) {
	    	 i2 += i1;
	    	 i1++;
	    	 }
	     System.out.println(i2 /= 2);
	     
	     
	     
	     
	     
	  //請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈) 
	  
	     int i3 = 1;
	     int i4 = 1;
	     for(i3 = 1 ; i3 <= 10 ; i3++) {
	    	 i4 *= i3;
	    	 }
	  
	     System.out.println(i4);
	     
	     
	     
	     
	     
	  //請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈) 

	     int i5 = 1;
	     int i6 = 1;
	     while(i5 <= 10){
	    	 i6 *= i5;
	    	 i5++;
	    	 }

	     System.out.println(i6);
	  
	  
	  
	  
	  
	  //請設計一隻Java程式，輸出結果為以下：  1 4 9 16 25 36 49 64 81 100 

	     int i7 = 1;
	     int i8 = 1;
	     while(i8 < 100) {
	    	 i8 = i7 * i7;
	    	 i7++;
	    	 System.out.print(i8 +"\t");
	    	 }

	     System.out.println();
	     
	     
	     
	     
	     
	  //阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
	  //請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？ • 
	
	     int iA =0;
	     int iB =0;
	     while(iA < 49 && iB < 49) {
	    	 iA++; 
	    	 if(iA/10 != 4 && iA%10 != 4) 
	    		 System.out.print( iA +"\t");
	    	 
	    	 if(iA/10 != 4 && iA%10 != 4)
	    		 iB++;
	    	 continue;
	    	 }System.out.println();

	    	 System.out.println("總共有" + iB + "個");
	    	 
	    	 
	    	 
	    	 
	    	 
	  //請設計一隻Java程式，輸出結果為以下：
	  //1 2 3 4 5 6 7 8 9 10
	  //1 2 3 4 5 6 7 8 9
	  //1 2 3 4 5 6 7 8
	  //1 2 3 4 5 6 7
	  //1 2 3 4 5 6
	  //1 2 3 4 5
	  //1 2 3 4
	  //1 2 3
	  //1 2
	  //1  

	    int i, j;
	    for (i = 10 ; i >= 0; i--) {
	    	for (j = 1; j <= i; j++)
	    		System.out.print( j + "\t");
		  
	    	System.out.println();
		  
	    }
	    
	    
	    
	    
	    
	  //請設計一隻Java程式，輸出結果為以下： 
	  //A 
	  //BB 
	  //CCC 
	  //DDDD 
	  //EEEEE 
	  //FFFFFF
	 
	    char iC = 65;
	    for(int  iD = 1; iD <= 6; iD++) {
	    	for(int iE = 1; iE <= iD; iE++){
	    		System.out.print(iC);
	    		}
	    	iC++;
	    	System.out.println();
	    	}
	
	
	
	
	
	}
}