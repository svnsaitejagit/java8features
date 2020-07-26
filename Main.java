package java8features;


import java.util.*; 
import java.util.stream.*; 
import java.util.function.*; 

public class Main { 
    public static IntStream mapToInt(Stream<Integer> stream) {
    return stream.mapToInt(Integer::intValue);
}

	public static void main(String args[]) 
	{ 
	   Stream<Integer> stream=Arrays.asList(2,3,4,5,7,8,10).stream();
	   //converting list into stream
	   //by calling static methof to convert stream into intstream  
	    IntStream intStream= mapToInt(stream);
	   //calling static method to convert stream into intstream  
	    OptionalDouble average=intStream.average();
	 //stream.average returns a optionalDouble value
	    System.out.println(average.getAsDouble());
	    
	  
	}
}