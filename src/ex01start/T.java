package ex01start;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class T {

	public static void main(String[] args) {

	public void sendAllMsg(String name, String msg, String flag) {
		// Map에 저장된 객체의 키값(대화명)을 먼저얻어온다.
		Iterator<String> it = clientMap.keySet().iterator(); //애는 이름
		Iterator<String> wisper = fixwhisper.keySet().iterator();
		// 저장된 객체(클라이언트)의 갯수만큼 반복한다.

		while (it.hasNext()) {
			try {
				// 컬렉션의 Key는 클라이언트대화명이다.
				String clientName = it.next();
				// 각 클라이언트의 PrintWriter 객체를 얻어온다.
				PrintWriter it_out = (PrintWriter) clientMap.get(clientName);
				if (flag.equals("One")) {
					if (fixwhisper.containsKey(name)) {
						it_out.println("[귓속말]" + URLEncoder.encode(msg, "UTF-8"));
					}
					// flag가 One이면 해당클라이언트 한명에게만전송한다.(귓속말)
					if (name.equals(clientName)) {
						// 컬렉션에 저장된 접속자명과 일치하는 경우에만 메세지를전송한다.
						it_out.println("[귓속말]" + URLEncoder.encode(msg, "UTF-8"));
					}

				} else {
					// 그외에는 모든클라이언트에게 전송한다.
					if (name.equals("")) {
						// 입장,퇴장에서 사용되는 부분
						it_out.println(URLEncoder.encode(msg, "UTF-8"));
					} else {
						// 메세지를 보낼때사용되는 부분
						it_out.println("[" + URLEncoder.encode(name, "UTF-8") + "]" + URLEncoder.encode(msg, "UTF-8"));
					}

					out.println(URLEncoder.encode(msg, "UTF-8"));
					java.util.Date utilDate = new java.util.Date();
					java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

					String query = "INSERT INTO chat_talking VALUES ( seq_chat.NEXTVAL , ? , ? , ? , SYSDATE )";
					psmt = con.prepareStatement(query);

					psmt.setString(1, name);
					psmt.setString(2, msg);
					psmt.setString(3, flag);

					psmt.executeUpdate();
				}
				/*
				 * 클라이언트에게 메세지를 전달할때 매개변수로 name이 있는경우와 없는경우를 구분해서 전달하게 된다.
				 */
			} catch (UnsupportedEncodingException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}

		}

	}
}

}

}
