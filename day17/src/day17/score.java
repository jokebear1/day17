package day17;

import java.util.Scanner;

class Ex04
{
	int[] ids= {1001, 1002, 1003, 1004, 1005};
	int[] scores= new int[5];
}
public class score {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ex04 e=new Ex04();
		
		//����1
		for(int i=0; i<e.scores.length; i++)
		{
			System.out.println((i+1)+"��° ���� �Է�");
			int num= sc.nextInt();
			e.scores[i]=num;
		}
		System.out.println("scores�迭�� 1~100������ ���� 5������");
		for(int i=0; i<e.scores.length; i++)
		{
			System.out.print(e.scores[i]+" ");
		}
		System.out.println();
		
		
	   //����2
		int sum=0; //����
		int avr=0; // ���
	   for(int i=0; i<e.scores.length; i++)
	   {
		   sum+=e.scores[i];
		   avr=(sum/5);
		   
	   }
		System.out.println("���� : "+sum);
		   System.out.println("��� : "+avr);
		System.out.println();
		
		
		//����3
		int count=0;//�հ��� ��
		for(int i=0; i<e.scores.length; i++)
		{
			if(e.scores[i]>=60)
			{
				count++;
			}
		}
		System.out.println("������ 60�� �̻��̸� �հ�, �հݻ� �� ���");
		System.out.println(count + "��");
		System.out.println();
		
		
		//����4
		System.out.println("�ε����� �޾� ���� ���");
		System.out.print("�ε��� �Է� : ");
		int idx=sc.nextInt(); //�ε���
		for(int i=0; i<e.scores.length; i++)
		{
			if(e.scores[idx]==e.scores[i])
			{
				System.out.println("���� : " + e.scores[i] + "��");
			}
		}
		System.out.println();
		
		
		//����5
		System.out.println("������ �Է¹޾� �ε��� ���");
		System.out.print("���� �Է� : ");
		int aa=sc.nextInt();//����
	    idx=0; //�ε���
		for(int i=0; i<e.scores.length; i++)
		{
			if(aa==e.scores[i])
				
			{
				idx=i;
				System.out.println("�ε��� : " + idx);
			}
		}
		System.out.println();
		
		
		//����6
		System.out.println("�й��� �Է¹޾� �������");
		System.out.print("�й� �Է� : ");
		int id=sc.nextInt();
	    idx=0;
		for(int i=0; i<e.ids.length; i++)
		{
			if(e.ids[i]==id)
			{
				idx=i;
				System.out.println("���� : " + e.scores[idx]);
			}
		}
		System.out.println();
		
		
		//����7
		System.out.println("�й��Է¹޾Ƽ������(���� �й� ����)");
		System.out.print("�й��Է� : ");
		id=sc.nextInt();
		int check=-1;
		for(int i=0; i<e.ids.length; i++)
		{
			if(id==e.ids[i])
			{
				check=1;
				System.out.println("���� : " + e.scores[idx]);
			}
			else if(check==-1)
			{
				System.out.println("�й�����X");
			}
		}
		System.out.println();
		
		//8
		System.out.println("1���л��� �й��� ���� ���");
		idx=0;
		int max=e.scores[0];
		for(int i=0; i<e.scores.length; i++)
		{
			if(e.scores[i]>e.scores[max]) 
			{
				idx=i;
				max=e.scores[i];
				
			}
				
		}
		System.out.println(e.ids[idx] + "��/ " + max + "��");
		
		
		
		
	}

}
