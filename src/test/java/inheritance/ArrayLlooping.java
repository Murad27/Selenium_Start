package inheritance;

import java.util.Arrays;

public class ArrayLlooping {
	
	 static String names;
	 int number;
    public static void getName() {
		
		names="hi1";
		names="hi2";
		names="hi3";
		names="hi4";
		names="hi5";
		names="hi6";
		System.out.println(names);
    }
    
	
     public static void main(String[] args) {
		String name[]= {"hi1","hi2","hi3","hi4","hi5","hi6"};
		int number[]= {2,4,6,8};
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(number));
		System.out.println(name[4]);
		
		String datatype[][]= {{"hi1","hi2","hi3"},
				          {"hi4","hi5","hi6"}};
		System.out.println(datatype[0][1]);
		for (int num :number) {                   //looping formula
			System.out.println(num);
				
			}
		for(String value:name) {
		System.out.println(value);
		
		
		}
     }
     }
	
	



