package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SampleController implements Initializable {
	@FXML
	private TextField tfNo, tfName, tfEmail, tfTel;
	@FXML
	private Button btnTotal, btnAdd, btnDel;
	@FXML
	private TableView tableView;
	
	// initialize()는 @FXML로 객체의 주입이 다끝나면 자동호출됨. 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 이벤트 핸들러 메소드 연결하기
		// 동적 데이터 추가하기
		
	} // initialize method
	
	
	
}
