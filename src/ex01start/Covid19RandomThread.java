package ex01start;

import java.util.Random;

class iThread extends Thread {
	int[] choice;
	String[] kosmo;

	public iThread(int[] choice, String[] kosmo) {
		this.choice = choice;
		this.kosmo = kosmo;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= Covid19RandomThread.STUDENT_COUNT; i++) {
				Covid19RandomThread.maxFind(choice, kosmo, i);
				if(Covid19RandomThread.STUDENT_COUNT==i)
					System.out.println("=========당첨 끄~~~읏=========");
				sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Covid19RandomThread extends Thread {

	static final int RANDOM_COUNT = 97815;// 난수생성횟수
	static final int STUDENT_COUNT = 15;// 당첨명수

	public static void main(String[] args) {

		String[] kosmo = { 
				"강혜수","기은서","김관무","김득환","김미주",
				"김수연","김우현","김윤우","김한준","김현성",
				"류인하","문경건","문병욱","민세원","박상철",
				"배다현","성두현","성승현","손석호","유한솔",
				"이별하","이시훈","이지은","이현주","이현진",
				"장태환","장홍제","정경헌","정붕기","정한결"
			};
		// 난수를 누적해서 저장할 배열
		int[] choice = new int[kosmo.length];

		// 난수생성을 위한 객체생성 및 씨드설정
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		// 일정횟수 반복하면서 난수생성
		for (int i = 0; i < RANDOM_COUNT; i++) {
			int rndNumber = random.nextInt(RANDOM_COUNT);
			// 학생수 만큼의 난수생성
			int stuNumber = rndNumber % kosmo.length;
			// System.out.println("comNumber="+stuNumber);
			// 생성된 난수를 배열의 인덱스로 사용하여 +1증가
			choice[stuNumber]++;
		}

		for (int i = 0; i < kosmo.length; i++) {
			System.out.printf("%s = %d\n", kosmo[i], choice[i]);
			// System.out.printf("%s[%d] = %d\n", kosmo[i], i, choice[i]);
		}
		iThread tr = new iThread(choice, kosmo);
		tr.start();
//      for (int i=0; i<STUDENT_COUNT; i++) {
//         maxFind(choice, kosmo);
//      }      
	}

	public static String maxFind(int[] choice, String[] kosmo, int cnt) {

		int max = 0;
		int maxIndex = -1;
		// 배열에서 가장 큰값 찾기
		for (int i = 0; i < choice.length; i++) {
			if (max < choice[i]) {
				max = choice[i];
				maxIndex = i;
			}
		}
		// 최대값을 찾은후 이름을 출력하고 0으로 리셋한다.
		//System.out.println("당첨" + cnt + ":" + kosmo[maxIndex]);
		System.out.println(kosmo[maxIndex]);
		choice[maxIndex] = 0;
		return kosmo[maxIndex];
	}
}
