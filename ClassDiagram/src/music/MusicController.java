package music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();

	public MusicController() {
		list.add(new Music("거짓말", "빅뱅"));
		list.add(new Music("I DON'T CARE", "2NE1"));
		list.add(new Music("달라달라", "잇지"));
	}

	public int addList(Music music) {
		// 리스트 마지막에 값 저장 메소드
		list.add(music);
		return 1;
	}

	public int addAtZero(Music music) {
		// 리스트 마지막에 값 저장 메소드
		list.add(0, music);
		return 0;

	}

	public List<Music> printAll() {
		// 모든 리스트를 반환하는 메소드
		return list;

	}

	public Music searchMusic(String title) {
		// 곡명을 검색하는 메소드
		Music searchM = null;
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				searchM = list.get(list.indexOf(m));
				break;
			} else {
				searchM = null;
			}

		}
		return searchM;

	}

	public Music removeMusic(String title) {
		// 곡명으로 찾아 삭제하는 메소드
		Music removeM = new Music();
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				removeM = list.remove(list.indexOf(m));
				break;

			} else {
				removeM = null;
			}
		}
		return removeM;
	}

	public Music setMusic(String title, Music music) {
		// 곡명으로 찾아 내용을 수정하는 메소드
//		Music updateM = new Music();
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
			}

		}
		return null;
	}

	public int ascTitle() {
		// 곡명을 오름차순으로 정렬하는 메소드
//		System.out.println(Collections.sort(list, new AscTitle()));

		return 1;
	}

	public int descSinger() {
		// 가수명을 내림차순으로 정렬하는 메소드
		return 0;

	}
}
