import java.util.*;
public class ThreeSumMax4105056004 extends ThreeSumMax
{


	
	public static void main(String[] args) 
	{
		Random ran = new Random();
		int b[] = new int[100];
		for(int i = 0; i < b.length; i++)
		{
			b[i] = ran.nextInt(10);
		}
		ThreeSumMax4105056004 t = new ThreeSumMax4105056004();
		//for(int i = 0; i < b.length;i++)
		//	System.out.print(b[i] + " ");
		//System.out.println("\n我的" + t.T_Max(b));
		//System.out.println("你的" + t.T_Max1(b));
	}
	
	


	public int T_Max(int[] A) 
	{
		//this.a = A;
		int ans;
		int f,s,t;
		
		f = -2147483648;
		s = -2147483648;
		t = -2147483648;
		
		for(int i  = 0; i < A.length; i++)
		{
			//System.out.println("\n" + f + " " + s + " " + t);
			if(A[i] > t)
			{
				t = A[i];
				if(A[i] > s)
				{
					t = s;
					s = A[i];
					if(A[i] > f)
					{
						s = f;
						f = A[i];
					}
				}
			}
			
		}
		
		//System.out.println("\n" + f + " " + s + " " + t);
		return f+s+t;
	}
	
	

}
