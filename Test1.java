package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String>ar=new ArrayList<>();
		ar.add("lenovo");
		ar.add("apple");
		ar.add("dell");
		ar.add("macbook");
		ar.add("asus");
		ar.add("hp");
		
		List<String>sorteList=ar.stream().sorted().collect(Collectors.toList());
		System.out.println(sorteList);
		
		
		List<Integer> n2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10, 11, 12);
		Integer min=n2.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		Integer max=n2.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
//		foreach method
		n2.stream().forEach(System.out ::print);
		

	}

}
