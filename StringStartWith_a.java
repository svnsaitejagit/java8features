ackage java8features;
import java.util.*; 
import java.util.stream.*; 
import java.util.function.*; 

public class StringStartWith_a { 
  

	public static void main(String args[]) 
	{ 
  // array of strings
	  String[] strArray ={"aaa","bbb","ajay","kumar","java","ace","epam","aam","apna","abc","aoo"};
    
	   List<String> list=Arrays.asList(strArray);
     
     //converting string to list and used predicate to check for length of string 3 and starting with 'a'
     
	    List<String> stringwith3letters_startwith_a=filter_a(list,(String str)->(str.length()==3 && str.charAt(0)=='a'));
	   
	   System.out.println(stringwith3letters_startwith_a);
	 
	    
	  
	}
	public static List<String> filter_a( List<String> list,Predicate<String> predicate)
	{
	     List<String> finalList=new ArrayList<String>();
	     for(String s: list)
	     {
	         if(predicate.test(s))
	         {
	             finalList.add(s);
	         }
	     }
	     return finalList;
	}
}