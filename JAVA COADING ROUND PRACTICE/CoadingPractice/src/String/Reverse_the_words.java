package String;

import java.util.Scanner;

public class Reverse_the_words {

   /* public static void main(String[] args) {
        String str = "I love Coding";
        System.out.println(reverse(str));

    }

    public static String reverse(String s1) {
        String s2 = "";
        int r;
        int len = s1.length();
        for (int i = len - 1; i >= 0; i--) {
            if (s1.charAt(i) == ' ') {
                r = len - i;
                len = i;
                s2 = s2 + (s1.substring(i + 1, len + r)) + " ";
            }

        }
        s2 = s2 + (s1.substring(0, len));
        return s2;
    }*/
	//public class ReverseWords {
		 
	   /* public static void main(String[] args)
	    {
	        String s[]
	            = "i like this program very much".split(" ");
	        String ans = "";
	        for (int i = s.length - 1; i >= 0; i--) {
	            ans += s[i] + " ";
	        }
	         
	        System.out.println(ans);
	    	/*String s="ruhsikesh Waikar";
	    	String []a=s.split("r");
	    	for(int i=0;i<=a.length-1;i++)
	    	{
	    		System.out.print(a[i]);
	    	}*/
	    //}
	public static void main(String [ ]a )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String input=sc.nextLine();
		//System.out.println(input);
		//String [] ans=input;
		String []input2= input.split(" ");
		String ans="";
		for(int i=input2.length-1;i>=0;i--)
		{
			ans+=input2[i]+" ";
		
		}
		System.out.println(ans);
		
		
		
	}
	    
	    
	    
	

}
