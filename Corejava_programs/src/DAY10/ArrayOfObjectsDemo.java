package DAY10;

import DAY5.hierarchicalinheritance.Student;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		// declares an Array of integers.
		Student[] arr;
		// allocating memory for 5 objects of type Student.
		arr = new Student[5];
		// initialize the first elements of the array
		arr[0] = new Student();
		// initialize the second elements of the array
		arr[1] = new Student();
		// so on...
		arr[2] = new Student();
		arr[3] = new Student();
		arr[4] = new Student();
		
		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());
	}

}