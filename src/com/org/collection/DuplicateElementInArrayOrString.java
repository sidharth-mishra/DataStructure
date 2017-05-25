package com.org.collection;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementInArrayOrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x="papu is a good boy";
System.out.println(getFirstNonDuplicateCharacter(x));
	}
	
	
	public static char getFirstNonDuplicateCharacter(String word){
		
char[]  stringData=word.toCharArray();
Map<Character,Integer> mp=new HashMap<Character,Integer>();
for(int i=0;i<stringData.length;i++){
	
	if(mp.containsKey(stringData[i])){
		mp.put(stringData[i], mp.get(stringData[i])+1);
	}
	else{
		mp.put(stringData[i], 1);
	}
}

		
		
	
		
for(int i=0;i<stringData.length;i++)	{
	if(mp.get(stringData[i])==1){
		return stringData[i];
	}
}
		return (Character) null;
		
	}

}
