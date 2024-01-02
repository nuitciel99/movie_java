package vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@AllArgsConstructor
@SuppressWarnings("serial")
@Builder
public class Reservation implements Serializable{
	
	private int reservNo; // 예약 번호 
	private int seatCol;  // 좌석
	private int movieNo;  // 영화 번호
	private String id;    // 아이디
	private final String reservDate; // 예매 일시
	
	public String toString() { // 출력 형식
		return String.format("예매 번호 :  %d | 상영관 : %d 관 | 예매자 아이디 : %s | 예매 좌석 : %c | 예매 일시 : %s", reservNo, movieNo, id, (char)(seatCol+65), reservDate);
	}
	

}