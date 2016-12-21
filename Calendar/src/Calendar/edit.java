package Calendar;

import java.io.File;
import javax.swing.JFileChooser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class edit {

	@FXML
	protected ImageView pic1;
	@FXML
	protected ImageView pic2;
	
	public edit() {
		
	}
	
	@FXML
	public void upload(MouseEvent e){
		JFileChooser choose = new JFileChooser();
		choose.showOpenDialog(null);
		File img = choose.getSelectedFile();
		ImageView pic = (ImageView) e.getSource();
		pic.setImage(new Image(img.toURI().toString()));
		
	}
	
	@FXML
	public void template1(ActionEvent e) {
		pic2.setLayoutX(10);
		pic2.setLayoutY(50);
		pic2.setFitHeight(335);
		pic2.setFitWidth(720);
		pic1.setVisible(false);
	}
	
	@FXML
	public void template2(ActionEvent e) {
		pic2.setLayoutX(10);
		pic2.setLayoutY(50);
		pic2.setFitWidth(355);
		pic2.setFitHeight(335);
		pic1.setVisible(true);
		pic1.setLayoutX(367.5);
		pic1.setLayoutY(50);
		pic1.setFitWidth(355);
		pic1.setFitHeight(335);
	}

	
}
