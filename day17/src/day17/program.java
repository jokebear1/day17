package day17;

import java.util.Scanner;

class Ex05
{
	String name = "";
	int[] ids= {1001, 1002, 1003, 1004, 1005};
	int[] arScore= {92, 38, 87, 100,11};
}
public class program {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Ex05 mega=new Ex05();
		
		while(true)
		{	//�޴�
			System.out.println("===" + mega.name + "===");
			System.out.println("1. ������ ����Ȯ��");
			System.out.println("2. 2���л� ����Ȯ��");
			System.out.println("3. �õ��л� ����Ȯ��");
			System.out.println("4. ����Ȯ���ϱ�");
			System.out.println("5. ����");
			System.out.print("�޴� ���� ");
			int sel=sc.nextInt();
			
			if(sel==1) //1
			{

				System.out.print("������ ���� : ");
				for(int i=0; i<mega.arScore.length; i++)
				{
					System.out.print(mega.arScore[i] + " ");
				}System.out.println();
			}
			
			
			else if(sel==2) //2
			{
				int max=mega.arScore[0];
				for(int i=0; i<mega.arScore.length; i++)
				{
					if(max<mega.arScore[i])
					{
						max=mega.arScore[i];
					}
				}
				System.out.println("1���л��Ǽ����� "+max+"��");
				System.out.println();
			}
			
			
			else if(sel==3) //3
			{
				int min=mega.arScore[0];
				for(int i=0; i<mega.arScore.length; i++)
				{
					if(min>mega.arScore[i])
					{
						min=mega.arScore[i];
					}	
				}
				System.out.println("�õ��л��Ǽ����� "+min+"��");
				System.out.println();
			}
			
			
			else if(sel==4)//4
			{
				System.out.print("�й��Է� : ");
				int id=sc.nextInt();
				int idx=0;
				{
					for(int i=0; i<mega.ids.length; i++)
					{
						if(id==mega.ids[i]) 
						{
							idx=i;
							System.out.println(id + "�� ������ " + mega.arScore[idx]);
						}
					}
				}System.out.println();
			}
			
			
			else if(sel==5) //5
			{
				System.out.println("����");
				break;
			}
			
		}
	
	}

}
