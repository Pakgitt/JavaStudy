package music;

import java.util.Comparator;

public class AscTitle implements Comparator<Music> {
	// 곡 명을 오름 차순 정렬의 기준을 제공하는 메소드
	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
