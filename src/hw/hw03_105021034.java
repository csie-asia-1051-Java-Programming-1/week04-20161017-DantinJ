package hw;
import java.util.Scanner;
public class hw03_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int p=0;
		int n=0;
		int zero=0;
		int a=0;
		while  (a!=999)  
		{
			 System.out.print("�п�J���\n"+"��J999������\n");
			 a=scn.nextInt();
			 if(a>0){
				 p=p+1;
			 }else if(a<0){
				 n=n+1;
				 
			 }else if (a==0){
				 zero=zero+1;
			 }
			 	
		}
		System.out.println(p-1+"�ӥ���"+n+"�ӭt��"+zero+"��0");
	}

}
