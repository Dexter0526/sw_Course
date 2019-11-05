package com.exam;

// 자동차 클래스
// [자동차]는 [엔진]이 필요하다.
// [자동차]는 [엔진]이 의존(dependency)한다.

// 자동차는 엔진이다.(x)
// 자동차는 엔진을 포함한다.(o)

//@Component
public class Car {
	
	//private HyundaiEngine engine = new HyundaiEngine();
	//private KiaEngine engine = new KiaEngine();
	
	
	private Engine engine;
		
	//@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// 가속하기
	public void accel() {
		//engine.add();
		engine.plus();
	}
	
}
