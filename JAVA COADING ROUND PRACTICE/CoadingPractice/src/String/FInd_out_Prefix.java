package String;

public class FInd_out_Prefix {

	 public static String longestCommonPrefix(String[] arr) {
	        if (arr == null || arr.length == 0) {
	            return ""; // If the input array is empty, return an empty string
	        }
	        
	        String prefix = arr[0]; // Initialize the prefix with the first string in the array
	        
	        System.out.println(arr[0]);
	        for (int i = 1; i < arr.length; i++)
	        {
	            while (arr[i].indexOf(prefix) != 0) 
	            {
	                prefix = prefix.substring(0, prefix.length() - 1); // Trim the last character of prefix
	                if (prefix.isEmpty())  {
	                    return ""; // If prefix becomes empty, there's no common prefix
	                }
	            }
	        }
	        
	        return prefix;
	    }

	    public static void main(String[] args) {
	        String[] input = {"apple", "rjs", "op", "pele"};
	        System.out.println("The longest Common Prefix is : " + longestCommonPrefix(input));
	    }

}
