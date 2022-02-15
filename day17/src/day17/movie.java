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
		System.out.println("[1] 좌석예매");
		System.out.println("[2] 종료하기");
		System.out.print("메뉴 선택");
		int sel=sc.nextInt();
		
			
		if(sel==1)
		{	//좌석표시
			System.out.print("seat = ");
			for(int i=0; i<e.seat.length; i++)
			{
				System.out.print(e.seat[i]+ " ");
			}
			System.out.println();
			
			//빈자리선택
			System.out.print("좌석 선택 : ");
			int choice=sc.nextInt();
			int money=0;
			if(e.seat[choice]==0)
			{
				e.seat[choice]=1;
				e.money++;
			}
			else //선택X
			{
				System.out.println("선택불가");
			}
			System.out.println();	
		}
		
		
		if(sel==2)//매출액&종료
		{
				System.out.println("매출액 : " + (e.money*12000) + "원");
				break;
			
		}
		
	
		
		}
		
	}

}
