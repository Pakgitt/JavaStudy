package music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public void mainMenu() {
		boolean exit = false;
		while (true) {
			System.out.println("**** 메인 메뉴 ****");
			System.out.println("1. 마지막 위치에 곡 추가"); // addList()
			System.out.println("2. 첫 위치에 곡 추가"); // addAtZero()
			System.out.println("3 전체 곡 목록 출력"); // printAll()
			System.out.println("4. 특정 곡 검색"); // serchMusic()
			System.out.println("5. 특정 곡 삭제"); // removeMusic()
			System.out.println("6. 특정 곡 정보 수정"); // setMusic()
			System.out.println("7. 곡명 오름차순 정렬"); // ascTitle
			System.out.println("8. 가수명 내림차순 정렬"); // descSinger()
			System.out.println("9. 종료"); // "종료" 출력 후 main()으로 리턴
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				serchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				if (exit)
					System.out.println("종료");
				break;

			default:
				break;
			}

		}
	}

	public void addList() { // 마지막 위치에 곡 추가 성공을 알리는 메소드
		// 곡명과 가수명을 사용자에게 입력받는다
		// MusicController에 addList()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 "추가 성공", 실패시 "추가 실패" 출력
		System.out.println("마지막 위치에 곡 추가");
		System.out.println("곡명을 입력하세요 : ");
		String title = sc.next();

		System.out.println("가수명을 입력하세요 : ");
		String singer = sc.next();

		int result = mc.addList(new Music(title, singer));

		if (result == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}

	}

	public void addAtZero() { // 첫 위치에 곡 추가 성공을 알리는 메소드
		// 곡명과 가수명을 사용자에게 입력 받는다.
		// MusicController에 addAtZero()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔 창에 출력
		System.out.println("첫 위치에 곡 추가");
		System.out.println("곡명을 입력하세요 : ");
		String title = sc.next();
		System.out.println("가수명을 입력하세요 : ");
		String singer = sc.next();

		int result = mc.addAtZero(new Music(title, singer));

		if (result == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}

	}

	public void printAll() { // 전체 곡 목록을 출력 성공을 알리는 메소드
		// MusicController에 printAll() 반환 값을 출력한다.
		System.out.println("전체 곡 목록 출력");
		System.out.println(String.valueOf(mc.printAll()));
	}

	public void serchMusic() { // 특정 곡 검색의 결과를 보여주는 메소드
		// 사용자에게 곡 이름을 받고 MusicController에 있는 searchMusic으로 값을 넘긴다.
		// searchMusic()의 반환 값에 따라 반환 값이 없으면 “검색한 곡이 없습니다.”
		// 반환 값이 있으면 “검색한 곡은 000(곡 명, 가수 명) 입니다.” 콘솔 창에 출력
		System.out.println("특정 곡 검색");
		System.out.println("검색할 곡 : ");
		String title = sc.next();
		Music serachM = mc.searchMusic(title);
		if (serachM == null) {
			System.out.println("검색한 곡이 없습니다");
		} else {
			System.out.println("검색한 곡은 " + serachM.getSinger() + "의 " + serachM.getTitle() + "입니다.");
		}
	}

	public void removeMusic() { // 특정 곡 삭제 결과를 보여주는 메소드
		// 사용자에게 삭제할 곡의 이름을 직접 받고 MusicController에 removeMusic으로
		// 값을 넘긴다. removeMusic()의 반환 값에 따라 반환 값이 없으면 “ 삭제할 곡이 없습니다.”
		// 반환 값이 있으면 “000(곡 명, 가수 명)을 삭제 했습니다” 콘솔 창에 출력
		System.out.println("특정 곡 삭제");
		System.out.println("삭제할 곡을 입력하세요 : ");
		String remove = sc.next();
		Music removeM = mc.removeMusic(remove);
		if (removeM == null) {
			System.out.println("삭제할 곡이 없습니다");
		} else {
			mc.removeMusic(remove);
			System.out.println(removeM.getSinger() + "의 " + removeM.getTitle() + "을 삭제 했습니다");
		}
	}

	public void setMusic() { // 특정 곡 정보 수정 결과를 보여주는 메소드
		// 사용자에게 수정할 곡을 입력 하여 MusicController에 setMusic으로 검색 할 수 있게
		// 값을 넘기며 수정할 곡 명과 가수 명을 받아 setMusic으로 값을 넘긴다.
		// 검색 결과 값이 없으면 “수정할 곡이 없습니다.”, 검색 결과 값이 있고
		// 수정 했으면 “000(곡 명, 가수 명)의 값이 변경 되었습니다.” 콘솔 창에 출력
		System.out.println("특정 곡 정보 수정");
		System.out.println("수정할 곡을 입력하세요 : ");
		String updateTitle = sc.next();

		System.out.print("수정할 곡명 : ");
		String newTitle = sc.next();

		System.out.print("수정할 가수명 : ");
		String newSinger = sc.next();

		Music updateM = new Music(newTitle, newSinger);
		Music result = mc.setMusic(updateTitle, updateM);

		if (result != null) {
			System.out.println(result.getSinger() + "의 " + result.getTitle() + "이 수정되었습니다.");
		} else {
			System.out.println("수정 가능한 곡이 없습니다");
		}

//		if (update == null) {
//			System.out.println("수정할 곡이 없습니다");
//		} else {
//			System.out.println(updateTitle + updateSinger + " 가 수정되었습니다");
//		}
	}

	public void ascTitle() { // 곡명 오름차순 정렬 성공을 알리는 메소드
		// 리스트 가수 명 내림차순 정렬, 1 리턴
		System.out.println("곡명 오름차순 정렬");
		int asc = mc.ascTitle();
		if (asc == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}

	}

	public void descSinger() { // 가수명 내림차순 정렬 성공을 알리는 메소드
		// MusicController에 ascTitle()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패”
		System.out.println("가수명 내림차순 정렬");

	}
}
