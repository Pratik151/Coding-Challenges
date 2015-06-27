
public class Doors{

	
	public static void main(String args[])
	{
		//DoorState is boolean array that holds the state of open door. If door is open then it is 'true' and if it is closed then it is 'false'
		//Default value of boolean variable is false, So the array is initialized with 'false' i.e door is closed.
		boolean[] DoorState = new boolean[101];
		for(int i=1;i<101;i++)
			for(int j=1;j<101;j++)
				if(j%i ==0)
				{
					if(DoorState[j])
						DoorState[j]=false;
					else
						DoorState[j]=true;
				}
		System.out.print("The Open Doors are :");
		for(int i=1;i<101;i++)
			if(DoorState[i]==true)
				System.out.print(i+" ");
		
	}
}