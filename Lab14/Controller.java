package Lab14;
//Lab14 9am
//Daniel Rochefort

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label selectCountryLabel;

    @FXML
    private Label countryCapitalLabel;

    @FXML
    private Label answerCountryCapitalLabel;

    public ComboBox<String> selectCountryBox;
    ObservableList<String> country = FXCollections.observableArrayList("United States","Germany","France","Canada","Russia","Japan","Australia");
    ObservableList<String> capital = FXCollections.observableArrayList("Washington, D.C.","Berlin","Paris","Ottawa","Moscow","Tokyo","Canberra");



    public void comboChanged(ActionEvent actionEvent) {
        int index = country.indexOf(selectCountryBox.getValue());

        answerCountryCapitalLabel.setText(capital.get(index));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectCountryBox.setItems(country);
    }
}
