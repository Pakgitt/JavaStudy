package music;

import java.util.Comparator;

public class Music implements Comparator<Music> {
	private String title;
	private String singer;

	public Music() {

	}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	public int hashCode() {
		return 0;

	}

	public boolean equals(Object obj) {
		return false;

	}

	public int compare(Music o) {
		this.singer.compareTo(o.getSinger());
		return 0;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
