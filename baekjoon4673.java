import java.util.*;

public class Main{
	
	public static void self_number(int n)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> self_number = new ArrayList<>();
		
		for(int i = 1, sum=0; i< n; i++)
		{
			sum = i + ((i%10000)/1000) + ((i%1000)/100) + ((i%100)/10) + ((i%10)/1);	//���� �ѹ� ���� n�� n�� ���ڸ� ���ڸ� ���� ��
			if(!arr.contains(sum))
			{//arr�� ���� ���� ���� ������ �ִ´�.
				arr.add(sum);
			}
			if(!arr.contains(i) && !self_number.contains(i))
			{
				self_number.add(i);
			}
		}
		for(int i = 0;i<self_number.size();i++)
			System.out.println(self_number.get(i));
		
	}
	
	public static void main(String []args) {
			 self_number(10000);
	}
}