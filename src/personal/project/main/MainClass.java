package personal.project.main;

/** 외부 클래스 */
import personal.project.main.vo.WeatherVo; // 날씨, 기온, 옷차림 등 정보와 관련된 클래스

/**
 * <pre>
 * 날씨정보와 함께 옷차림을 추천해주는 프로젝트
 * 메인 클래스
 * </pre>
 */
public class MainClass {
	
	/** 메인 함수 */
	public static void main(String[] args) {
		
		/** 초반 가이드 */
		System.out.println("--- 해당 프로그램은 날씨 정보를 알려주는 프로그램입니다. ---");
		
		/** 날짜별 객체 생성 */
		WeatherVo today = new WeatherVo();
		WeatherVo tomorrow = new WeatherVo();
		
		/** 날짜별 속성 정보 입력 */
		today.insertWeather("비", 3, -3, "우산, 패딩");
		tomorrow.insertWeather("눈", 3, -6, "우산, 패딩");
		
		/** 값 출력 */
		System.out.println("오늘");
		today.printWeather();
		
		System.out.println("내일");
		tomorrow.printWeather();
	}
}

