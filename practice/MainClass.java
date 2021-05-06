package practice;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car c1=new Car("A",101,25000);
		Car c2=new Car("B",102,75000);
		Car c3=new Car("C",103,50000);
		Car c4=new Car("d",104,15000);
		Car c5=new Car("E",105,12000);
		
		List<Car> list=Arrays.asList(c1,c2,c3,c4,c5);
		
		
		Stream<Car> stream2=Stream.of(c1,c2,c3,c4,c5);
		
		Comparator<Car> byprice=(car1,car2)-> (int)car1.getPrice()-(int)car2.getPrice();
		
		
		Car c=stream2.max(byprice).get();
		System.out.println(c);
		
		@SuppressWarnings("unchecked")
		List<Car> list2=list.stream().filter((car)-> car.getPrice()>20000).collect(Collectors.toList());
		for (Car car2 : list2) {
			System.out.println(car2);
			
		}
		
		int x=list.stream().mapToInt(i->(int)i.getPrice()).sum();
		System.out.println(x);
		
	
		
		
		
	}
	
	
}
