package day17;

import java.util.Scanner;

class Ex06
{
	int[] answer= {1,3,4,2,5}; //시험 답
	int[] hdg= new int[5]; // 학생 답
	
	int count=0; //맞은 수
	int score=0; //성적
}
public class omr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ex06 e=new Ex06();
		
		System.out.println("답 입력");
		for(int i=0; i<e.hdg.length; i++)
		{
			System.out.println((i+1) + "번");
			int num=sc.nextInt();
			e.hdg[i]=num;
		}
		//answer
		System.out.print("answer = {");
		for(int i=0; i<e.answer.length; i++)
		{
			System.out.print(e.answer[i] + " ");
		}
		System.out.println("}");
		//hgd
		System.out.print("hgd = {");
		for(int i=0; i<e.hdg.length; i++)
		{
			System.out.print(e.hdg[i]+ " ");
		}
		System.out.println("}");
		//ox
		int count=0;
		System.out.print("errata = {");
		for(int i=0; i<e.hdg.length; i++)
		{
			if(e.answer[i]==e.hdg[i])
			{
				System.out.print(" o ");
				count++;
			}
			else
			{
				System.out.print(" x ");
			}
		}
		System.out.println("}");
		//score
		System.out.print("score=" + (count*20) + "점");
			
		
		
		
		
		
		
		
	}

}
