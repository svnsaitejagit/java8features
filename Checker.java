package java8features;


import java.util.*; 
import java.util.stream.*; 
import java.util.function.*; 
interface CheckForPalindrome
{
    boolean check(String original);
 
}
public class Checker
{
    public static boolean ispalindrome(String original) 
    {
        StringBuffer reversed=new StringBuffer(original);
        reversed.reverse();
        return original.equals(reversed.toString());
        
    }
	public static void main(String args[]) 
	{ 
	  String[] strArray ={"ajay","bbb","madam","kumar","java","mam","epam","aam","civic","abc","aoo","radar","racecar","kayak","level"};
	   List<String> list=Arrays.asList(strArray);
	   List<String> palindromes=new ArrayList<String>();
	 CheckForPalindrome checkForPalindrome=Checker::ispalindrome;
	 for(String s:list)
	 {
	     if(checkForPalindrome.check(s))
	     {
	          palindromes.add(s);
	     }
	 }
	 System.out.println(palindromes);
	    
	  
	}

}