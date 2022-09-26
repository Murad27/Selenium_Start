package inheritance;

import java.util.Arrays;

public class ArrayClass {
	
 static String names;
 public static void getName() {

	 
	 names="bulbul";
     names="rathul";
     names="sornali";
     names="sakib";
     names="Rimi";
     names="boisakhi";
     System.out.println(names);
     
 }
public static void main(String[] args) {
	String name[]={"bulbul","rathul","sornali","sakib","Rimi","boisakhi"};
	System.out.println(Arrays.toString(name));
	System.out.println(name[2]);
	
	String datatype[][]= {{"bulbul","rathul","sornali"},
	                     {"sakib","Rimi","boisakhi"}};
	System.out.println(datatype[1][1]);
	


}
}
