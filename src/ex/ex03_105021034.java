package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021034 周宇晟
 */

public class ex03_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n= scn.nextInt();
		for (int a=1;a<=n;a++ )
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
