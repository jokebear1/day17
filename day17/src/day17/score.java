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
		
		//문제1
		for(int i=0; i<e.scores.length; i++)
		{
			System.out.println((i+1)+"번째 정수 입력");
			int num= sc.nextInt();
			e.scores[i]=num;
		}
		System.out.println("scores배열에 1~100점사이 정수 5개저장");
		for(int i=0; i<e.scores.length; i++)
		{
			System.out.print(e.scores[i]+" ");
		}
		System.out.println();
		
		
	   //문제2
		int sum=0; //총점
		int avr=0; // 평균
	   for(int i=0; i<e.scores.length; i++)
	   {
		   sum+=e.scores[i];
		   avr=(sum/5);
		   
	   }
		System.out.println("총점 : "+sum);
		   System.out.println("평균 : "+avr);
		System.out.println();
		
		
		//문제3
		int count=0;//합격자 수
		for(int i=0; i<e.scores.length; i++)
		{
			if(e.scores[i]>=60)
			{
				count++;
			}
		}
		System.out.println("성적이 60점 이상이면 합격, 합격생 수 출력");
		System.out.println(count + "명");
		System.out.println();
		
		
		//문제4
		System.out.println("인덱스를 받아 성적 출력");
		System.out.print("인덱스 입력 : ");
		int idx=sc.nextInt(); //인덱스
		for(int i=0; i<e.scores.length; i++)
		{
			if(e.scores[idx]==e.scores[i])
			{
				System.out.println("성적 : " + e.scores[i] + "점");
			}
		}
		System.out.println();
		
		
		//문제5
		System.out.println("성적을 입력받아 인덱스 출력");
		System.out.print("성적 입력 : ");
		int aa=sc.nextInt();//성적
	    idx=0; //인덱스
		for(int i=0; i<e.scores.length; i++)
		{
			if(aa==e.scores[i])
				
			{
				idx=i;
				System.out.println("인덱스 : " + idx);
			}
		}
		System.out.println();
		
		
		//문제6
		System.out.println("학번을 입력받아 성적출력");
		System.out.print("학번 입력 : ");
		int id=sc.nextInt();
	    idx=0;
		for(int i=0; i<e.ids.length; i++)
		{
			if(e.ids[i]==id)
			{
				idx=i;
				System.out.println("성적 : " + e.scores[idx]);
			}
		}
		System.out.println();
		
		
		//문제7
		System.out.println("학번입력받아성적출력(없는 학번 제외)");
		System.out.print("학번입력 : ");
		id=sc.nextInt();
		int check=-1;
		for(int i=0; i<e.ids.length; i++)
		{
			if(id==e.ids[i])
			{
				check=1;
				System.out.println("성적 : " + e.scores[idx]);
			}
			else if(check==-1)
			{
				System.out.println("학번존재X");
			}
		}
		System.out.println();
		
		//8
		System.out.println("1등학생의 학번과 성적 출력");
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
		System.out.println(e.ids[idx] + "번/ " + max + "점");
		
		
		
		
	}

}
