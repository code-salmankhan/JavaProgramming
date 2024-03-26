package day6;

import java.util.Arrays;

public class singleDimArray {

	public static void main(String[] args) 
	{
		
		//Appraoch1
		int a[]= new int[5]; //declare
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
        a[4]=500;
        
        //Approach2
        
        int b[]= {100,200,300,400,500};
        
        
        //size of Array
        System.out.println(a.length);
        
        //get a single value of array
        System.out.println(b[2]);
        
       //get all value of array
        System.out.println(Arrays.toString(a));
        
        //by loop
        for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]);
        }
        
        //or
        for(int x:a)
        {
        	System.out.println(x);
        }
              
        
        //2 dim array
        System.out.println("-------- 2D Array ----------");
        
        int d[][] = new int[2][2];   
        d[0][0] =1;
        d[0][1] =2;
        d[1][0] =3;
        d[1][1] =4;
             
        int e[][] = { {1,2},
        		      {3,4} };
            
        System.out.println(d.length);
        System.out.println(d[0].length);     
        System.out.println(d[1][1]);
        
        for(int r=0;r<d.length;r++)
        {
        	for(int c=0;c<d[r].length;c++)
        	{
        		System.out.print(d[r][c]+"  ");
        	}
        	System.out.println();
        }
           
        for(int x[]:d)
        {
        	for(int v:x)
        	{
        		System.out.print(v+"  ");
        	}
        	System.out.println();
        }
        
        String str1[] = new String[3];
        
        String str2[][] = {{"Hello","Hi"},
        		            {"Hmm", "Hey"}};
         
        Object o[] = new Object[5];       
        o[0]=10;
        o[1]=10.67;
        o[2]='A';
        o[3]="Welcome";
        o[4]=true;
        
        System.out.println(Arrays.toString(o));
                           
	}

}
