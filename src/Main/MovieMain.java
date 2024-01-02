package Main;

import serivce.CustomerService;
import serivce.MovieService;
import serivce.ReservService;
import serivce.ReviewService;
import util.MovieUtils;

public class MovieMain {

	public static void main(String[] args) {
		/**
		 * 테스트 완료
		 */
		CustomerService service = CustomerService.getInstance(); // 싱글톤 로그인유저 객체 필요한 메서드
		MovieService movieService = MovieService.getInstance();
		ReservService reservService = ReservService.getInstance();
		ReviewService reviewService = ReviewService.getInstance();
		// 최초에 할당된 하나의 메모리를 계속 쓰는방법

		while (true) {
			try {
				System.out.println(
						"=====================================================================================================\r\n"
								+ "  ___ ___      ___    __  __  /\\_\\      __   \r\n"
								+ "/' __` __`\\   / __`\\ /\\ \\/\\ \\ \\/\\ \\   /'__`\\ \r\n"
								+ "/\\ \\/\\ \\/\\ \\ /\\ \\L\\ \\\\ \\ \\_/ | \\ \\ \\ /\\  __/ \r\n"
								+ "\\ \\_\\ \\_\\ \\_\\\\ \\____/ \\ \\___/   \\ \\_\\\\ \\____\\\r\n"
								+ " \\/_/\\/_/\\/_/ \\/___/   \\/__/     \\/_/ \\/____/");
				switch (MovieUtils.nextInt(
						"============================================TEAM5===================================================="
								+ "\n1. 회원가입  2. 로그인")) {
				case 1:
					System.out.println(
							"========WELCOME======================================================================================\n"
									+ "1. 회원가입");
					service.register();
					break;
				case 2:
					service.login();
					while (service.isLogin()) {
						try {

							switch (MovieUtils.nextInt(
									"=====================================================================================================\n"
											+ "1. 예매 2. 예매 확인 3. 리뷰  4.회원 삭제 5. 로그아웃")) {
							case 1:
								sub: while (true) {
									try {
										switch (MovieUtils.nextInt(
												"=====================================================================================================\n"
														+ "1. 예매  2. 예매 취소 \n=====================================================================================================")) {
										case 1:
											reservService.reservMovie();
											break sub;
										case 2:
											reservService.cancel();
											break sub;

										default:
											break;
										}
									} catch (NumberFormatException e) {
										System.out.println("======================= \n숫자로 입력하세요");
									} catch (RuntimeException e) {
										System.out.println(e.getMessage());
									}
								}
								break;
							case 2:
//	                            movieService.Customer();
								service.list();
								break;
							case 3:
								reviewService.review();
								break;
							case 4:
								service.remove();
								break;
							case 5:
								service.logout();
								break;
							default:
								System.out.println("1~5번 중에 선택하세요.");
//							break;
//							return;
							}
						} catch (NumberFormatException e) {
							System.out.println("숫자로 입력하세요");
						} catch (RuntimeException e) {
							System.out.println(e.getMessage());
						}

					}
				}

			} catch (NumberFormatException e) {
				System.out.println("숫자로 입력하세요");
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
