package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.DuplicateFormatFlagsException;
import java.util.List;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
//		List<Integer> n = Arrays.asList(2, 1, 3, 4,5, 6, 7, 9,  8, 11, 12);
//		System.out.println(n);

		//		descending  order
//		List<Integer> numberassc=n.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		System.out.println(numberassc);
//		//		asscending order
//
//		List<Integer>numbrdsce=n.stream().sorted().collect(Collectors.toList());
//		System.out.println(numbrdsce);
		
//		List<Integer>numberassc=n.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		System.out.println(numberassc);
		
//		List<Integer>numberdesc=n.stream().sorted().collect(Collectors.toList());
//		System.out.println("numberdesc");
		
//												remove duplicate valus
		
//		List<Integer> n1 = Arrays.asList(2, 1, 3, 4,5, 6, 7, 9,  8, 11, 12,12,11,8,8,5,6,7,4,1,2,1,3);
//		List<Integer>numberremove=n1.stream().distinct().collect(Collectors.toList());
//		System.out.println(numberremove);
		
//					Sorted and remmove duplicate
//		List<Integer>numberremove1=n1.stream().sorted().distinct().collect(Collectors.toList());
//		System.out.println(numberremove1);
		
		
		
//		Sort remove Duplicate limits
//		List<Integer> n3 = Arrays.asList(2, 1, 3, 4,5, 6, 7, 9,  8, 11, 12);
//		List<Integer>numberremovelimit1=n3.stream().limit(3).collect(Collectors.toList());
//		System.out.println(numberremovelimit1);
//		
//		List<Integer> n2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10, 11, 12);
//		List<Integer>numberremovelimit=n2.stream().sorted().limit(3).collect(Collectors.toList());
//		System.out.println(numberremovelimit);
		
//					skip method
		List<Integer> n2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10, 11, 12);
		List<Integer>numberskip=n2.stream().skip(5).collect(Collectors.toList());
		System.out.println(numberskip);
		
		
		
	}

}
