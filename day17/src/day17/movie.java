package day17;

import java.util.Scanner;

class Ex07
{
	int[] seat= new int[7];
	int money=0;
	
}
public class movie {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ex07 e=new Ex07();
		
		while(true) {
		System.out.println("[MEGA MOVIE]");
		System.out.println("[1] �¼�����");
		System.out.println("[2] �����ϱ�");
		System.out.print("�޴� ����");
		int sel=sc.nextInt();
		
			
		if(sel==1)
		{	//�¼�ǥ��
			System.out.print("seat = ");
			for(int i=0; i<e.seat.length; i++)
			{
				System.out.print(e.seat[i]+ " ");
			}
			System.out.println();
			
			//���ڸ�����
			System.out.print("�¼� ���� : ");
			int choice=sc.nextInt();
			int money=0;
			if(e.seat[choice]==0)
			{
				e.seat[choice]=1;
				e.money++;
			}
			else //����X
			{
				System.out.println("���úҰ�");
			}
			System.out.println();	
		}
		
		
		if(sel==2)//�����&����
		{
				System.out.println("����� : " + (e.money*12000) + "��");
				break;
			
		}
		
	
		
		}
		
	}

}
