
public class Main {

	public static void main(String[] args) {

		자동차 a자동차1 = new 자동차();
		// 자동차라는 타입의 a자동차1이라는 변수를 만들고 그곳에 자동차라는 객체를 넣어준다
		a자동차1.달리다();
		a자동차1.달리다();
		a자동차1.달리다();
		// a자동차1이라는 변수를 움직일수있는 달리다 라는 리모컨을 만들어준다
		//변수명.기능(); 은 실행문의 문법
	}

}

class 자동차 {

	void 달리다() {

		// 반복문 조건 i가 3 까지 반복해라
		System.out.println("자동차가 달립니다");

	}

}
