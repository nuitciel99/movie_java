package vo;
import java.io.Serializable;
import java.text.SimpleDateFormat;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class Customer implements Serializable {
	private int no;           // 회원 고유번호
	private String id;	// 회원 아이디
	private String pw;        // 회원의 비밀번호
//	private String movieName;    // 영화의 이름
	private final String regdate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(System.currentTimeMillis());
//	회원가입한 시간
	
	

	
	public int getMemberNum(int num) {// 멤버의 memberNum를 찾아서 지우기 위함.
	  return num++;}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}



//	public String getMovieName() {
//		return movieName;
//	}
//
//
//	public void setMovieName(String movieName) {
//		this.movieName = movieName;
//	}
//
//
//
//	

}
