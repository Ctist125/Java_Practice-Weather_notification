package personal.project.main;

/** 외부 클래스 */
import personal.project.main.vo.WeatherVo; // 날씨, 기온, 옷차림 등 정보를 가져오는 클래스

/** <pre>
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
		today.weather = "비";
		today.highestTemperature = 4;
		today.minimumTemperature = 2;
		today.dress = "우산, 패딩";
		
		tomorrow.weather = "눈";
		tomorrow.highestTemperature = 3;
		tomorrow.minimumTemperature = -3;
		tomorrow.dress = "우산, 패딩";
		
		/** 값 출력 */
		System.out.println("오늘");
		System.out.println("날씨: " + today.weather);
		System.out.println("최고 기온: " + today.highestTemperature);
		System.out.println("최저 기온: " + today.minimumTemperature);
		System.out.println("옷차림: " + today.dress);
		System.out.println("----------");
		
		System.out.println("내일");
		System.out.println("날씨: " + tomorrow.weather);
		System.out.println("최고 기온: " + tomorrow.highestTemperature);
		System.out.println("최저 기온: " + tomorrow.minimumTemperature);
		System.out.println("옷차림: " + tomorrow.dress);
		System.out.println("----------");
	}
}

