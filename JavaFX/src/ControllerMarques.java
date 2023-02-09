import java.net.URL;
import java.util.ResourceBundle;

import org.json.JSONArray;
import org.json.JSONObject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class ControllerMarques {

    private ObservableList<Button> listaBotones = FXCollections.observableArrayList();

    @FXML
    private ListView<Button> listaMarques;

    public void loadBrands() {
        JSONObject obj = new JSONObject("{}");
        obj.put("type", "marques");
        UtilsHTTP.sendPOST(Main.protocol + "://" + Main.host + ":" + Main.port + "/dades", obj.toString(),
                (response) -> {
                    loadBrandsCallback(response);
                });
    }

    private void loadBrandsCallback(String response) {
        JSONObject objResponse = new JSONObject(response);
        if (objResponse.getString("status").equals("OK")) {
            JSONArray JSONlist = objResponse.getJSONArray("result");
            for (int i = 0; i < JSONlist.length(); i++) {
                Button button = new Button(JSONlist.getString(i));
                button.setOnAction(event -> {
                    ControllerConsoles ctrlConsoles = (ControllerConsoles) UtilsViews.getController("ViewConsoles");
                    ctrlConsoles.loadConsolesByBrand(button.getText());
                    UtilsViews.setViewAnimating("ViewConsoles");
                });
                listaBotones.add(button);
            }
            listaMarques.setItems(listaBotones);
        }
    }

}
