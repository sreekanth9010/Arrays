package arraysAssignments;

public class Salary {
	
	public  double[] findDetails(double[] salary) {
        //Implement your code here and change the return value accordingly
		
		double count=0;
		
		double average=0;
		double sum=0;
		double less=0;
		for(int i=0;i<salary.length;i++)
		{
			sum+=salary[i];
		}
		average =sum/salary.length;
		
		for(int i=0;i<salary.length;i++)
		{
			if(salary[i]>average)
			{
				count++;
			}
			else if(salary[i]<average)
			{
				less++;
			}
		}
		
		double[] d = {average,count,less};
		
        return d;  
        }
}
