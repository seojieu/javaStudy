package test240726.object1;

import java.util.Comparator;

public class AscTitle implements Comparator<Music> {
	public int compare(Music o1, Music o2) {
		//compareTo -> 나자신과 비교해서 크면 1 작으면 -1 동일하면 0
		//o1.getTitle().compareTo(o2.getTitle())
		if (o1.getTitle().compareTo(o2.getTitle()) == 0 ) {
			return o1.getSinger().compareTo(o2.getSinger());
		}
		return o1.getTitle().compareTo(o2.getTitle());
		// Title의 내림차순으로 정렬하는 기준을 마련한다.

	}
}
