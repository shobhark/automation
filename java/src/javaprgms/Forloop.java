package javaprgms;

public class Forloop {

	public static void main(String[] args) {
	
	//it will skip current loop pass when the condition satisfied  and continue from next iteration
		for(int i =0; i<=10;i++)
		{
			if (i==5)
				continue;
			System.out.println(i);
		}

	
		//it will break the loop once the condition is satisfied
				for(int i =0; i<=10;i++)
				{
					if (i==5)
						break;
					System.out.println(i);
				}
	}

}
