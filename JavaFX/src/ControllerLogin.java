import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllerLogin {

    @FXML
    private TextField serverIp;

    @FXML
    private TextField port;

    @FXML
    private void loginServer() {
        System.out.println("test");
        Main2.socketClient = UtilsWS
                .getSharedInstance(Main2.protocolWS + "://" + serverIp.getText() + ":" + port.getText());
    }

}
