package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 
public class Product_Test {

	private static Object compare;

	public static void main(String[] args) {

		ArrayList<Product>ar=new ArrayList<>();
		 
		ar.add(new Product(2, "dell",50f ));
		ar.add(new Product(3, "apple",70f ));
		ar.add(new Product(1, "lenovo",40f ));
		ar.add(new Product(4, "hp",30f ));
		
		System.out.println("normal order ");
		
		ar.forEach(p->System.out.println(p));
		
		System.out.println("asscending order ");
		
		Comparator<Product>compare=(p1,p2)->p1.id-p2.id;
		List<Product>li=ar.stream().sorted(compare).collect(Collectors.toList());
		li.forEach(p->System.out.println(p));
		
		System.out.println("descening order ");
		
		compare=(p2,p1)->p1.id-p2.id;
		List<Product>lii=ar.stream().sorted(compare).collect(Collectors.toList());
		lii.forEach(p->System.out.println(p));
		
		System.out.println("***********names order assc *************************");
		compare=(p1,p2)->p1.name.compareTo(p2.name);
		List<Product>l=ar.stream().sorted(compare).collect(Collectors.toList());
		l.forEach(p->System.out.println(p));
		
		System.out.println("***********names order desce *************************");
		compare=(p2,p1)->p1.name.compareTo(p2.name);
		List<Product>ll=ar.stream().sorted(compare).collect(Collectors.toList());
		ll.forEach(p->System.out.println(p));
		
	}



}
