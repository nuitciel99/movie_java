package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import serivce.CustomerService;
import serivce.MovieService;
import serivce.ReservService;
import serivce.ReviewService;
import vo.Customer;


public class MovieUtils {

	private static Scanner scanner = new Scanner(System.in);

	public static String nextLine(String msg) { // 인스턴스 변수는 클래스 메소드에서 호출이 불가
		System.out.println(msg);
		return scanner.nextLine(); // 따라서 6line에서 static 선언
	}

	public static int nextInt(String msg) {
//		System.out.println();
		return Integer.parseInt(nextLine(msg));
	}

	
	// 제네릭 //  예외처리 
	public static <T> void save() {
		Map<String, List<?>> map = new HashMap<>();
		// 고객서비스에서 겟터로 불러옴 
			map.put("customers", CustomerService.getInstance().getCustomers());
			map.put("movies", MovieService.getInstance().getMovies());
			map.put("reviews", ReviewService.getInstance().getReviews());
			map.put("reservations", ReservService.getInstance().getReservations());
			
			try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"));
			oos.writeObject(map);
			oos.close();
			// data.에 저장
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//예외처리 오류 발생시 콘솔창 에러 알림 
		}
	}
	@SuppressWarnings("unchecked")
	public static <T> T load(String id) {
		T ret = (T)new ArrayList<>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"));
			ret = ((Map<String, T>) ois.readObject()).get(id);
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ret;
		
	}
}
