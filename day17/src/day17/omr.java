package day17;

import java.util.Scanner;

class Ex06
{
	int[] answer= {1,3,4,2,5}; //���� ��
	int[] hdg= new int[5]; // �л� ��
	
	int count=0; //���� ��
	int score=0; //����
}
public class omr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ex06 e=new Ex06();
		
		System.out.println("�� �Է�");
		for(int i=0; i<e.hdg.length; i++)
		{
			System.out.println((i+1) + "��");
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
		System.out.print("score=" + (count*20) + "��");
			
		
		
		
		
		
		
		
	}

}
