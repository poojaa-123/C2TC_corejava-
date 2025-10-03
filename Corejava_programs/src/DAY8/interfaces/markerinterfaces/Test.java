package DAY8.interfaces.markerinterfaces;

public class Test implements Comparable<Object> {
    int id;
    String name;
    double fees;
    String course;

    public Test(int id, String name, double fees, String course) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.course = course;
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

