package serivce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import vo.Movie;
import vo.Reservation;

public class MovieService {
	private static MovieService movieService = new MovieService();
	public static MovieService getInstance() {
		return movieService;
	}
	
	@Getter
	private List<Movie> movies = new ArrayList<Movie>(Arrays.asList(new Movie(1, "엘리멘탈"), new Movie(2, "밀수"))); 

	public Movie findBy(int movieNo) {				// 영화 번호로 영화 조회
		for (Movie movie : movies) {
			if(movieNo == movie.getMovieNo()) {
				return movie;
			}
		}
		return null;
	}

	public void movieList() {						// 무슨 영화가 있는지 
		for (int i = 0; i < movies.size(); i++) {
			System.out.println("----------------------- \n| "+ movies.get(i).getMovieNo() + " | "+ movies.get(i).getMovie() + "\n-----------------------");
		}
	}
}
	