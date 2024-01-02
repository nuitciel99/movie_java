package vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

 public class Review implements Serializable{
	int reviewNo; // 글 번호
	String title; // 리뷰 제목
	String content; // 리뷰 내용
	String id;	// 사용자 아이디
	int movieNo; //영화 번호 

	private final String regdate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(System.currentTimeMillis());

	public String toString() {
		return String.format("  %d   %s  %s %s %s ", reviewNo, title, content, id, movieNo);
	}	
}