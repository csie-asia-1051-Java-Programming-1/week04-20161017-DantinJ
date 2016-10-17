package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021034 周宇晟
 */

public class ex02_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char a = 'Y';
		while (a=='Y')
		{
			System.out.print("輸入兩數");
			int x = scn.nextInt();
			int y = scn.nextInt();
			for (int i=1;i<=y;i++)
			{
				for (int e=1;e<=x;e++)
				{
					System.out.print(e+"*"+i+"="+(e*i)+"	");
				}
				System.out.print("\n");
			}
			System.out.print("Y=繼續;n=停止");
			char b = scn.next().charAt(0);
			a=b;
		}
	}

}
