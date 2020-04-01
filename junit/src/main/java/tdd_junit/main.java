package tdd_junit;

public class main implements Access{
	
public String accept(String s)
{   String h="";
	int l=s.length();
	if(l>=2)
	{
		if(s.charAt(0)!='A')
		{
			h=h+s.charAt(0);
			
		}
		if(s.charAt(1)!='A')
		{
			h=h+s.charAt(1);
			
		}
		if(l>2)
		{
			
			h=h+s.substring(2,l);
			
		}
	
		
	}
	else
	{
		if(l==1)
		{
			if(s.charAt(0)!='A')
			{
				h=h+s.charAt(0);
				
			}	
			
			
		}
		}
	
	return(h);
}
}
