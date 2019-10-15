package com.exam.gui;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// JavaFX GUI

/*
컨트롤 : 눈에 보이고 만질수 있는 프로그램 제어용도의 객체. 예:버튼
컨테이너: 눈에 보이지는 않지만 다른 컨트롤이나 화면요소를 담을수 있음.
Stage : 윈도우창. 액자
Scene : 화면1개. 그림1개(교체가능)


*/
public class Ex3 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 컨테이너(배치관리자 역할). Vertical Box(수직방향으로 한개씩 배치)
		VBox vBox = new VBox();
		vBox.setPrefSize(350, 150); // 가로세로 크기 지정
		vBox.setAlignment(Pos.CENTER); // 가운데 정렬
		vBox.setSpacing(20); // 수직 간격 20px
		
		TextField tf = new TextField();
		Button btn1 = new Button("버튼1");
		
		vBox.getChildren().add(tf);   // 컨테이너에 텍스트필드 추가
		vBox.getChildren().add(btn1); // 컨테이너에 버튼 추가
		
		Scene scene = new Scene(vBox); // 화면1개 완성
		
		primaryStage.setScene(scene); // 윈도우창에 화면1개를 부착
		primaryStage.setTitle("창 제목");
		primaryStage.setResizable(false);
		primaryStage.show(); // 윈도우창 보여주기
	}
	
	public static void main(String[] args) {
		// *launch() 메소드가 하는일
		// launch() 호출한 클래스타입 객체를 생성하고,
		// 새로운 윈도우창(Stage) 객체를 생성하고,
		// start()호출하면서 매개값으로 생성한 윈도우창(Stage)을 전달함.
		launch(args);
	}

}
