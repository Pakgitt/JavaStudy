package twoArrayExam;

public class TwoArrayP6 {

	public void practioce6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
//			String txt = "";
			for (int j = 0; j < strArr[i].length; j++) {
//				txt += strArr[j][i] + " ";
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TwoArrayP6 p6 = new TwoArrayP6();
		p6.practioce6();
	}
}
