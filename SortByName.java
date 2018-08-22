package ZensorPractise;

import java.util.Comparator;

public class SortByName implements Comparator <DayBook>{

	@Override
	public int compare(DayBook dy1, DayBook dy2) {
		return dy1.getName().compareTo(dy2.getName());
	}
}
