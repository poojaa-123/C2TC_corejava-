//Program to demonstrate generic interface
package DAY15.generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

