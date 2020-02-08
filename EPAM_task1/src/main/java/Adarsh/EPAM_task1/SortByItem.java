package Adarsh.EPAM_task1;
import java.util.*;

public class SortByItem implements Comparator<Sweets> {
	public int compare(Sweets o1, Sweets o2) {

		// TODO Auto-generated method stub

		return o1.item.compareTo(o2.item);

	}
}
