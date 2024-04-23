package chapter02;

public class VariableUseExample
{
	public static void main(String[] args) {
		int hour = 3;
		int minute=5;
//		System.out.println(hour+minute); =8
//		+ 할때 문자열이 하나라도 있으면 전체는 문자열이 됨
		System.out.println(hour+"시 "+minute+"분");
		
		int totalMinute=hour*60+minute;
		System.out.println("총"+totalMinute+"분");
		
//		System.out.println(totalMinute);
		
		int totalSecond=totalMinute*60;
		System.out.println("총"+totalSecond+"초");
		
	}

}

