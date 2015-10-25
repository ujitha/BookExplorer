import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Created by Ujitha on 10/25/2015.
 */
public class BookExplorerController {
    @FXML
    private TextField searchTextField;

    @FXML
    private Button searchBtn;

    @FXML
    private void initialize() {
        searchTextField = new TextField();
    }

    @FXML
    private void searchBtnOnAction(ActionEvent event){
        String searchItem =  searchTextField.getText();

        System.out.println(searchItem);
    }

}
