import java.io.*;
class s1411031011
{
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int doit=1;
		int cardlist=0;
		int total=1000;/*�w�X*/
		int my_num=0;/*�U�`���B*/
		int gg;/*���s�W�q�j�q�p*/
		int[] cardnum=new int[52];
		String[] cardkind={"�®�","����","���","����"};
		for( int i=0;i<52;i++)
		{
			cardnum[i]=i;
		}
		int temp=0;
		int rnum=0;
		int kindnum=0;
		int num1=0,num2=0,num3=0;
		for(int i=0;i<52;i++)
		{
			rnum=(int)(Math.random()*52);
			temp=cardnum[i];
			cardnum[i]=cardnum[rnum];
			cardnum[rnum]=temp;
		}
		
		while(doit!=99)
		{
			System.out.print("--------��J1.�o�P�A2.�����A99���}�G--------");
			doit=Integer.parseInt(in.readLine());
			if(doit==1)
			{
				kindnum=(int)(cardnum[cardlist]/13);
				System.out.print("  "+cardkind[kindnum]+"-"+((cardnum[cardlist]%13)+1));
				kindnum=(int)(cardnum[cardlist+1]/13);
				System.out.print("  "+cardkind[kindnum]+"-"+((cardnum[cardlist+1]%13)+1));
				num1=(cardnum[cardlist]%13)+1;
				num2=(cardnum[cardlist+1]%13)+1;
				System.out.print("\n�U�`���B:");
				my_num=Integer.parseInt(in.readLine());
				while(total<my_num)
			    {
			        System.out.print("�l�B����!�Э��s�U�`:");
			        my_num=Integer.parseInt(in.readLine());
			        
			    }
				if(my_num>0)
				{
				    kindnum=(int)(cardnum[cardlist+2]/13);
			    	num3=(cardnum[cardlist+2]%13)+1;
			    	if(num1>num2)
			    	{
				    	temp=num1;
				    	num1=num2;
				    	num2=temp;
			    	}
			    	if(num1==num2)
			    	{
				        System.out.print("���s�W\n");
				        System.out.print("�вq�U�@�i�P���j�p(�j���s�W�Ы�1 or �p���s�W�Ы�2):");
				        gg=Integer.parseInt(in.readLine());
				        if(gg==1 && num1<num3)
				        {
				            System.out.print("  "+cardkind[kindnum]+"-"+((cardnum[cardlist+2]%13)+1));
				            System.out.print("�q���F!\n");
				            System.out.println("�Ѿl�I�ơG"+total);
				        }
				        else if(gg==2 && num1>num3)
				        {
				            System.out.print("  "+cardkind[kindnum]+"-"+((cardnum[cardlist+2]%13)+1));
				            System.out.print("�q���F!\n");
				            System.out.println("�Ѿl�I�ơG"+total);
				        }
				        else
				        {
				            System.out.print("  "+cardkind[kindnum]+"-"+((cardnum[cardlist+2]%13)+1));
				            System.out.print("�q���F!\n");
				            total=total-my_num;
				            System.out.println("�Ѿl�I�ơG"+total);
				        }
			    	}
			    	else if((num1<num3)&&(num3<num2))
			    	{
			    	    System.out.print("  "+cardkind[kindnum]+"-"+((cardnum[cardlist+2]%13)+1));
				    	System.out.println("\n�g�s�����\");
				    	total=total+my_num;
				    	System.out.println("�Ѿl�I�ơG"+total);
			    	}
			    	else if((num1==num3)||(num3==num2))

				    {
				        System.out.print("  "+cardkind[kindnum]+"-"+((cardnum[cardlist+2]%13)+1));
			    		System.out.println("\n���s�W");
			    		total=total-my_num*2;
			    		System.out.println("�Ѿl�I�ơG"+total);
			    	}
			    	else if(num1==num2 && num1==num3)
			        {
			            System.out.print("  "+cardkind[kindnum]+"-"+((cardnum[cardlist+2]%13)+1));
			    	    System.out.println("���W");
			    	    total=total-my_num*3;
			    	    System.out.println("�Ѿl�I�ơG"+total);
			        }
			        else
			    	{
			    	    System.out.print("  "+cardkind[kindnum]+"-"+((cardnum[cardlist+2]%13)+1));
			    		System.out.println("\n�g�s������");
			    		total=total-my_num;
			    		System.out.println("�Ѿl�I�ơG"+total);
			    	}
			    	
			    }
			    if(total<=0)
			    {
			        System.out.print("�}��");
			        System.out.println("�Ѿl�I�ơG"+total);
			        System.exit(doit);
			    }
			}
			else if(doit==2)
	    	{
			    System.out.println("�̫�z���I�ơG"+total);
	    	}
	    	cardlist=cardlist+3;
		    System.out.println("");
		}
		
	}

}