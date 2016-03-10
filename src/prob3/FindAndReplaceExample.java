package prob3;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		/* 코드를 작성합니다 */
		String str = "모든 프로그램은 Java 언어로 개발 될 수 있습니다.";
		if( str.indexOf( "Java" ) != -1 ) {
			System.out.println( "Java 문자열이 포함되어 있습니다." );
			System.out.println( str.replaceAll( "Java", "자바" ) );
		}
	}
}
