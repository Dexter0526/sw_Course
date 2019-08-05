package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SampleController {
	
	@FXML
	private TextField id;
	
	@FXML
	private PasswordField passwd;
	
	@FXML
	private Label lblResult;
	
	public void onCancelClicked(ActionEvent event) {
		System.out.println("취소버튼 실행");
	}
	
	public void onLoginClicked(ActionEvent event) {
		System.out.println("로그인 버튼 실행");
		String userid = id.getText();
		String userpwd = passwd.getText();
		
		System.out.println("아이디 : " + userid);
		System.out.println("비밀번호 : " + userpwd);
		
		lblResult.setText(userid + "\n" + userpwd);
	}
}
