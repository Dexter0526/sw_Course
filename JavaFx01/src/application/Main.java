package application;

import java.awt.Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 * JavaFx - Application�� ��ӹ޾� ���α׷� ����
 * 
 * Stage(â, ������)
 * 	-Scene(���, ȭ��)
 * 		-XXXPane(��ġ������ ���� �����̳�)
 * 			-��Ʈ��(�ؽ�Ʈ �ʵ�, üũ�ڽ�, ������ư, ��....)
 */

public class Main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("JavaFx ����~!");
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(label);
		
		Button btn1 = new Button("��ư1");
		borderPane.setBottom(btn1);
		
		Scene scene = new Scene(borderPane, 320, 240);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
		// launch() �޼ҵ�� ���������� �Ʒ� �ڵ带 ����
//		Stage stage = new Stage();	// ���� ������â ����
//		Main main = new Main();
//		main.start(primaryStage);	// ������â �����ؼ� ���� start()�޼ҵ� ȣ��
		
		
	}

}
