package ZensorPractise;

import java.util.Comparator;

public class SortByAcc implements Comparator <DayBook>{

	@Override
	public int compare(DayBook dy1, DayBook dy2) {
		return (dy1.getAcno()-dy2.getAcno());
	}
}