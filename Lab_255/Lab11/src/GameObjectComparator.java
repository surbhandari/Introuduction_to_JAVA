import java.util.Comparator;

import GameObject.GeometricObject;

public class GameObjectComparator implements Comparator<GeometricObject>, java.io.Serializable  {

	@Override
	public int compare(GeometricObject arg0, GeometricObject arg1) {
		// TODO Auto-generated method stub
		double area1 = arg0.getArea();
		double area2 = arg1.getArea();
		if(area1 < area2)
			return -1;
		else if (area1 == area2)
			return 0;
		else
			return 1;
	}

}
