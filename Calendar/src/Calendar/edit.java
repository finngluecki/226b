package Calendar;

import java.io.File;
import java.util.Calendar;

import javax.swing.JFileChooser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class edit {

	@FXML
	protected AnchorPane januar;
	@FXML
	protected AnchorPane februar;
	@FXML
	protected AnchorPane maerz;
	@FXML
	protected AnchorPane april;
	@FXML
	protected AnchorPane mai;
	@FXML
	protected AnchorPane juni;
	@FXML
	protected AnchorPane juli;
	@FXML
	protected AnchorPane august;
	@FXML
	protected AnchorPane september;
	@FXML
	protected AnchorPane oktober;
	@FXML
	protected AnchorPane november;
	@FXML
	protected AnchorPane dezember;
	@FXML
	protected ImageView pic1;
	@FXML
	protected ImageView pic2;
	@FXML
	protected ImageView pic3;
	@FXML
	protected ImageView pic4;
	@FXML
	protected ImageView pic5;
	@FXML
	protected ImageView pic6;
	@FXML
	protected ImageView pic7;
	@FXML
	protected ImageView pic8;
	@FXML
	protected ImageView pic9;
	@FXML
	protected ImageView pic10;
	@FXML
	protected ImageView pic11;
	@FXML
	protected ImageView pic12;
	@FXML
	protected ImageView pic13;
	@FXML
	protected ImageView pic14;
	@FXML
	protected ImageView pic15;
	@FXML
	protected ImageView pic16;
	@FXML
	protected ImageView pic17;
	@FXML
	protected ImageView pic18;
	@FXML
	protected ImageView pic19;
	@FXML
	protected ImageView pic20;
	@FXML
	protected ImageView pic21;
	@FXML
	protected ImageView pic22;
	@FXML
	protected ImageView pic23;
	@FXML
	protected ImageView pic24;
	@FXML
	protected TextField year;

	public edit() {

	}

	@FXML
	public void year(ActionEvent e) { // Berechnet das eingegebene Jahr
		String a = year.getText(); // Liest den Text im Textfeld aus und
									// speichert ihn als String
		int yearInt = Integer.parseInt(a); // Konvertiert den String zu einem
											// Int
		Calendar c = Calendar.getInstance(); // erstellt einen Kalender
		c.add(Calendar.DATE, 1);
		int monthInt = 1;
		int dayInt = 1;
		int o = 1;
		int weekInt = 1;
		while (o <= 365) {// While Loop der alle Tage durchgeht
			o++;
			int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);// Berechnet den
														// Wochentag
			if (dayOfWeek == 5) {// schaut ob der Wochentag Montag ist
				weekInt++;// geht in die nächste Woche über
			}

			if (monthInt == 2) {// testet ob der Monat Februar ist
				if (dayInt == 29) {// setzt die Tagesanzahlauf 28
					dayInt = 1;
					monthInt++;
					weekInt = 1;
				}
			} else if (monthInt == 4 || monthInt == 6 || monthInt == 9 || monthInt == 11) {// prüft
																							// ob
																							// der
																							// Monat
																							// April,
																							// Juni,
																							// September
																							// oder
																							// November
																							// ist
				if (dayInt == 31) {// setzt die Tagesanzahl auf 30
					dayInt = 1;
					monthInt++;
					weekInt = 1;
				}
			} else {
				if (dayInt == 32) {// setzt die Tagesanzahl auf 31
					monthInt++;
					dayInt = 1;
					weekInt = 1;
				}
			}
			Label day = new Label();// erstellt ein neues Label
			c.set(yearInt, monthInt, dayInt);// setzt den Tag im Kalender fest
			day.setText("" + dayInt);// setzt den Label Text
			switch (monthInt) {// ändert den Monat
			case (1):
				this.januar.getChildren().add(day);
				break;
			case (2):
				this.februar.getChildren().add(day);
				break;
			case (3):
				this.maerz.getChildren().add(day);
				break;
			case (4):
				this.april.getChildren().add(day);
				break;
			case (5):
				this.mai.getChildren().add(day);
				break;
			case (6):
				this.juni.getChildren().add(day);
				break;
			case (7):
				this.juli.getChildren().add(day);
				break;
			case (8):
				this.august.getChildren().add(day);
				break;
			case (9):
				this.september.getChildren().add(day);
				break;
			case (10):
				this.oktober.getChildren().add(day);
				break;
			case (11):
				this.november.getChildren().add(day);
				break;
			case (12):
				this.dezember.getChildren().add(day);
				break;
			}

			if (weekInt == 1) {// prüft die Woche
				if (dayOfWeek == 1) {
					day.setLayoutX(85);
				}
				if (dayOfWeek == 2) {
					day.setLayoutX(106);
				}
				if (dayOfWeek == 3) {
					day.setLayoutX(124);
				}
				if (dayOfWeek == 4) {
					day.setLayoutX(144);
				}
				if (dayOfWeek == 5) {
					day.setLayoutX(24);
				}
				if (dayOfWeek == 6) {
					day.setLayoutX(47);
				}
				if (dayOfWeek == 7) {
					day.setLayoutX(64);
				}
			} else if (weekInt == 2) {
				if (dayOfWeek == 1) {
					day.setLayoutX(229);
				}
				if (dayOfWeek == 2) {
					day.setLayoutX(250);
				}
				if (dayOfWeek == 3) {
					day.setLayoutX(268);
				}
				if (dayOfWeek == 4) {
					day.setLayoutX(288);
				}
				if (dayOfWeek == 5) {
					day.setLayoutX(168);
				}
				if (dayOfWeek == 6) {
					day.setLayoutX(191);
				}
				if (dayOfWeek == 7) {
					day.setLayoutX(208);
				}
			} else if (weekInt == 3) {
				if (dayOfWeek == 1) {
					day.setLayoutX(373);
				}
				if (dayOfWeek == 2) {
					day.setLayoutX(394);
				}
				if (dayOfWeek == 3) {
					day.setLayoutX(412);
				}
				if (dayOfWeek == 4) {
					day.setLayoutX(432);
				}
				if (dayOfWeek == 5) {
					day.setLayoutX(312);
				}
				if (dayOfWeek == 6) {
					day.setLayoutX(335);
				}
				if (dayOfWeek == 7) {
					day.setLayoutX(352);
				}
			} else if (weekInt == 4) {
				if (dayOfWeek == 1) {
					day.setLayoutX(515);
				}
				if (dayOfWeek == 2) {
					day.setLayoutX(536);
				}
				if (dayOfWeek == 3) {
					day.setLayoutX(554);
				}
				if (dayOfWeek == 4) {
					day.setLayoutX(574);
				}
				if (dayOfWeek == 5) {
					day.setLayoutX(454);
				}
				if (dayOfWeek == 6) {
					day.setLayoutX(477);
				}
				if (dayOfWeek == 7) {
					day.setLayoutX(494);
				}
			} else if (weekInt == 5) {
				if (dayOfWeek == 1) {
					day.setLayoutX(658);
				}
				if (dayOfWeek == 2) {
					day.setLayoutX(679);
				}
				if (dayOfWeek == 3) {
					day.setLayoutX(697);
				}
				if (dayOfWeek == 4) {
					day.setLayoutX(717);
				}
				if (dayOfWeek == 5) {
					day.setLayoutX(597);
				}
				if (dayOfWeek == 6) {
					day.setLayoutX(620);
				}
				if (dayOfWeek == 7) {
					day.setLayoutX(637);
				}
			}
			day.setLayoutY(420);
			dayInt++;
		}

	}

	@FXML
	public void upload(MouseEvent e) {// upload eines bestimmten Bildes
		JFileChooser choose = new JFileChooser();// Dateiauswahl
		choose.showOpenDialog(null);
		File img = choose.getSelectedFile();// speichert die ausgewählte Datei
											// in eine Variable
		ImageView pic = (ImageView) e.getSource();// wählt das angeclickte
													// ImageView aus
		pic.setImage(new Image(img.toURI().toString()));// füllt das ImageView
														// mit dem ausgewählten
														// Bild
	}

	public void template1() {// ordnet die ImageViews nach dem Template1
		pic2.setLayoutX(10);
		pic2.setLayoutY(50);
		pic2.setFitHeight(335);
		pic2.setFitWidth(720);
		pic1.setVisible(false);

		pic4.setLayoutX(10);
		pic4.setLayoutY(50);
		pic4.setFitHeight(335);
		pic4.setFitWidth(720);
		pic3.setVisible(false);

		pic6.setLayoutX(10);
		pic6.setLayoutY(50);
		pic6.setFitHeight(335);
		pic6.setFitWidth(720);
		pic5.setVisible(false);

		pic8.setLayoutX(10);
		pic8.setLayoutY(50);
		pic8.setFitHeight(335);
		pic8.setFitWidth(720);
		pic7.setVisible(false);

		pic10.setLayoutX(10);
		pic10.setLayoutY(50);
		pic10.setFitHeight(335);
		pic10.setFitWidth(720);
		pic9.setVisible(false);

		pic12.setLayoutX(10);
		pic12.setLayoutY(50);
		pic12.setFitHeight(335);
		pic12.setFitWidth(720);
		pic11.setVisible(false);

		pic14.setLayoutX(10);
		pic14.setLayoutY(50);
		pic14.setFitHeight(335);
		pic14.setFitWidth(720);
		pic13.setVisible(false);

		pic16.setLayoutX(10);
		pic16.setLayoutY(50);
		pic16.setFitHeight(335);
		pic16.setFitWidth(720);
		pic15.setVisible(false);

		pic18.setLayoutX(10);
		pic18.setLayoutY(50);
		pic18.setFitHeight(335);
		pic18.setFitWidth(720);
		pic17.setVisible(false);

		pic20.setLayoutX(10);
		pic20.setLayoutY(50);
		pic20.setFitHeight(335);
		pic20.setFitWidth(720);
		pic19.setVisible(false);

		pic22.setLayoutX(10);
		pic22.setLayoutY(50);
		pic22.setFitHeight(335);
		pic22.setFitWidth(720);
		pic21.setVisible(false);

		pic24.setLayoutX(10);
		pic24.setLayoutY(50);
		pic24.setFitHeight(335);
		pic24.setFitWidth(720);
		pic23.setVisible(false);
	}

	public void template2() {// ordnet die ImageViews nach dem Template2
		pic2.setLayoutX(10);
		pic2.setLayoutY(50);
		pic2.setFitWidth(355);
		pic2.setFitHeight(335);
		pic1.setVisible(true);
		pic1.setLayoutX(367.5);
		pic1.setLayoutY(50);
		pic1.setFitWidth(355);
		pic1.setFitHeight(335);

		pic4.setLayoutX(10);
		pic4.setLayoutY(50);
		pic4.setFitWidth(355);
		pic4.setFitHeight(335);
		pic3.setVisible(true);
		pic3.setLayoutX(367.5);
		pic3.setLayoutY(50);
		pic3.setFitWidth(355);
		pic3.setFitHeight(335);

		pic6.setLayoutX(10);
		pic6.setLayoutY(50);
		pic6.setFitWidth(355);
		pic6.setFitHeight(335);
		pic5.setVisible(true);
		pic5.setLayoutX(367.5);
		pic5.setLayoutY(50);
		pic5.setFitWidth(355);
		pic5.setFitHeight(335);

		pic8.setLayoutX(10);
		pic8.setLayoutY(50);
		pic8.setFitWidth(355);
		pic8.setFitHeight(335);
		pic7.setVisible(true);
		pic7.setLayoutX(367.5);
		pic7.setLayoutY(50);
		pic7.setFitWidth(355);
		pic7.setFitHeight(335);

		pic10.setLayoutX(10);
		pic10.setLayoutY(50);
		pic10.setFitWidth(355);
		pic10.setFitHeight(335);
		pic9.setVisible(true);
		pic9.setLayoutX(367.5);
		pic9.setLayoutY(50);
		pic9.setFitWidth(355);
		pic9.setFitHeight(335);

		pic12.setLayoutX(10);
		pic12.setLayoutY(50);
		pic12.setFitWidth(355);
		pic12.setFitHeight(335);
		pic11.setVisible(true);
		pic11.setLayoutX(367.5);
		pic11.setLayoutY(50);
		pic11.setFitWidth(355);
		pic11.setFitHeight(335);

		pic14.setLayoutX(10);
		pic14.setLayoutY(50);
		pic14.setFitWidth(355);
		pic14.setFitHeight(335);
		pic13.setVisible(true);
		pic13.setLayoutX(367.5);
		pic13.setLayoutY(50);
		pic13.setFitWidth(355);
		pic13.setFitHeight(335);

		pic16.setLayoutX(10);
		pic16.setLayoutY(50);
		pic16.setFitWidth(355);
		pic16.setFitHeight(335);
		pic15.setVisible(true);
		pic15.setLayoutX(367.5);
		pic15.setLayoutY(50);
		pic15.setFitWidth(355);
		pic15.setFitHeight(335);

		pic18.setLayoutX(10);
		pic18.setLayoutY(50);
		pic18.setFitWidth(355);
		pic18.setFitHeight(335);
		pic17.setVisible(true);
		pic17.setLayoutX(367.5);
		pic17.setLayoutY(50);
		pic17.setFitWidth(355);
		pic17.setFitHeight(335);

		pic20.setLayoutX(10);
		pic20.setLayoutY(50);
		pic20.setFitWidth(355);
		pic20.setFitHeight(335);
		pic19.setVisible(true);
		pic19.setLayoutX(367.5);
		pic19.setLayoutY(50);
		pic19.setFitWidth(355);
		pic19.setFitHeight(335);

		pic22.setLayoutX(10);
		pic22.setLayoutY(50);
		pic22.setFitWidth(355);
		pic22.setFitHeight(335);
		pic21.setVisible(true);
		pic21.setLayoutX(367.5);
		pic21.setLayoutY(50);
		pic21.setFitWidth(355);
		pic21.setFitHeight(335);

		pic24.setLayoutX(10);
		pic24.setLayoutY(50);
		pic24.setFitWidth(355);
		pic24.setFitHeight(335);
		pic23.setVisible(true);
		pic23.setLayoutX(367.5);
		pic23.setLayoutY(50);
		pic23.setFitWidth(355);
		pic23.setFitHeight(335);
	}
}
