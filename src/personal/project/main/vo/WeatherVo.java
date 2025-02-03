package personal.project.main.vo;

/**
 * 날씨, 최고 기온, 최저 기온, 옷차림을 도출하는 클래스
 */
public class WeatherVo {

	/** 전역 변수 */
	public String weather;
	public int highestTemperature;
	public int minimumTemperature;
	public String dress;
	
	/** 날씨 속성 저장 함수 */
	public void insertWeather(String weather, int highestTemperature, int minimumTemperature, String dress) {
		this.weather = weather;
		this.highestTemperature = highestTemperature;
		this.minimumTemperature = minimumTemperature;
		this.dress = dress;
	}
	
	/** 날씨 속성 출력 함수 */
	public void printWeather() {
		System.out.println("날씨: " + this.weather);
		System.out.println("최고 기온: " + this.highestTemperature);
		System.out.println("최저 기온: " + this.minimumTemperature);
		System.out.println("옷차림: " + this.dress);
		System.out.println("----------");
	}
}
