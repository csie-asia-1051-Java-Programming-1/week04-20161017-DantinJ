package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021034 周宇晟
 */

public class ex01_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a=0;
		int x=0;
		while(a!=-1)
		{
			int b = scn.nextInt();
			if(b!=-1)
			{
			x=x+b;
			}
			a=b;
		}
		System.out.print(x);
	}

}
