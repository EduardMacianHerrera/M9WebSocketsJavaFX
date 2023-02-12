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
        Main.socketClient = UtilsWS
                .getSharedInstance(Main.protocolWS + "://" + serverIp.getText() + ":" + port.getText());
        Main.host = serverIp.getText();
        Main.port = port.getText();
        UtilsViews.setViewAnimating("ViewFiltres");
    }

}
