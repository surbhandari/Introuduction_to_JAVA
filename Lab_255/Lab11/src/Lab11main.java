import java.util.Comparator;

import GameObject.Circle;
import GameObject.GeometricObject;
import GameObject.Rectangle;

/**
 * 
 * Write the following generic method using selection sort and a comparator.
 * public static <E> void selectionSort(E[] list, Comparator<? super E> comparator)
 * Write a test program that creates an array of 10 GeometricObjects and invokes this
 * method using the GeometricObjectComparator introduced in Listing 20.4 to sort the elements.
 * Display the sorted elements. Use the following statement to create the array.
 * GeometricObject[] list =
 *      {new Circle(5), new Rectangle(4, 5),
 *      new Circle(5.5), new Rectangle(2.4, 5),
 *      new Circle(0.5), new Rectangle(4, 65),
 *      new Circle(4.5), new Rectangle(4.4, 1),
 *      new Circle(6.5), new Rectangle(4, 5)};
 *      
 */      
public class Lab11main {

	public static void main(String[] args) {

		GeometricObject[] list1 = {new Circle(5), new Rectangle(4, 5),
				new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
				new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
				new Circle(6.5), new Rectangle(4, 5)};
		
		System.out.println(" Before sorting : ");
		for(GeometricObject e:list1) {
			System.out.printf("%.2f", e.getArea());
			System.out.println();
		}
		selectionSort(list1, new GameObjectComparator());
		
		System.out.println("Sorted Element are : ");
		for(GeometricObject e:list1) {
			System.out.printf("%.2f", e.getArea());
			System.out.println();
		}
		
		
	}
	
	public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
		for(int i =0;i<list.length-1;i++) {
			E min = list[i];
			int minIndex = i;
			
			for(int j =i+1;j<list.length;j++) {
				if(comparator.compare(min, list[j])<0) {
					min=list[j];
					minIndex = j;
				}
			}
			if(minIndex!=i) {
				list[minIndex] = list[i];
				list[i] = min;
			}
			
			
			
		}
		
		
		
	}

}
