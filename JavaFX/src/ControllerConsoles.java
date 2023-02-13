import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

public class ControllerConsoles {

    private String vistaAnterior;

    public String getVistaAnterior() {
        return vistaAnterior;
    }

    public void setVistaAnterior(String vistaAnterior) {
        this.vistaAnterior = vistaAnterior;
    }

    @FXML
    private ProgressIndicator progressIndicator;

    private void showLoading() {
        progressIndicator.setVisible(true);
    }

    private void hideLoading() {
        progressIndicator.setVisible(false);
    }

    @FXML
    private VBox listaConsolas;

    @FXML
    private void backButton() {
        UtilsViews.setViewAnimating(vistaAnterior);
        listaConsolas.getChildren().clear();
    }

    public void loadConsoles() {
        // Cargar todas las consolas
    }

    private void loadConsolesCallback() {
        // Callback de todas las consolas
    }

    public void loadConsolesByBrand(String brand) {
        // Cargar consolas por marcar

        JSONObject obj = new JSONObject("{}");
        obj.put("type", "marca");
        obj.put("name", brand);

        UtilsHTTP.sendPOST(Main.protocol + "://" + Main.host + ":" + Main.port + "/dades", obj.toString(),
                (response) -> {
                    loadConsolesByBrandCallback(response);
                });

    }

    private void loadConsolesByBrandCallback(String response) {
        // Callback de las consolas por marca
        showLoading();
        JSONObject objResponse = new JSONObject(response);
        if (objResponse.getString("status").equals("OK")) {
            JSONArray JSONlist = objResponse.getJSONArray("result");
            URL resource = this.getClass().getResource("./assets/viewItemConsola.fxml");
            for (int i = 0; i < JSONlist.length(); i++) {
                JSONObject console = JSONlist.getJSONObject(i);

                try {
                    // Load template and set controller
                    FXMLLoader loader = new FXMLLoader(resource);
                    Parent itemTemplate = loader.load();
                    ControllerItemConsola itemController = loader.getController();

                    itemController.setNombreConsola(console.getString("name"));
                    itemController.setMarca(console.getString("brand"));
                    itemController.setProcesador(console.getString("processor"));
                    itemController.setCirculo(console.getString("color"));

                    try {
                        Image image = new Image(
                                Main.protocol + "://" + Main.host + ":" + Main.port + "/"
                                        + console.getString("image"));
                        itemController.setImagen(image);
                    } catch (Exception e) {

                    }

                    // Add template to the list
                    listaConsolas.getChildren().add(itemTemplate);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        hideLoading();
    }

    public void loadConsolesByColor(String color) {
        JSONObject obj = new JSONObject("{}");
        obj.put("type", "color");
        obj.put("color", color);

        UtilsHTTP.sendPOST(Main.protocol + "://" + Main.host + ":" + Main.port + "/dades", obj.toString(),
                (response) -> {
                    loadConsolesByColorCallback(response);
                });
    }

    public void loadConsolesByColorCallback(String response) {
        showLoading();
        JSONObject objResponse = new JSONObject(response);
        if (objResponse.getString("status").equals("OK")) {
            JSONArray JSONlist = objResponse.getJSONArray("result");
            URL resource = this.getClass().getResource("./assets/viewItemConsola.fxml");
            for (int i = 0; i < JSONlist.length(); i++) {
                JSONObject console = JSONlist.getJSONObject(i);

                try {
                    // Load template and set controller
                    FXMLLoader loader = new FXMLLoader(resource);
                    Parent itemTemplate = loader.load();
                    ControllerItemConsola itemController = loader.getController();

                    itemController.setNombreConsola(console.getString("name"));
                    itemController.setMarca(console.getString("brand"));
                    itemController.setProcesador(console.getString("processor"));
                    itemController.setCirculo(console.getString("color"));

                    try {
                        Image image = new Image(
                                Main.protocol + "://" + Main.host + ":" + Main.port + "/"
                                        + console.getString("image"));
                        itemController.setImagen(image);
                    } catch (Exception e) {

                    }

                    // Add template to the list
                    listaConsolas.getChildren().add(itemTemplate);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        hideLoading();
    }

    public void loadConsolesByCPU(String cpu) {
        JSONObject obj = new JSONObject("{}");
        obj.put("type", "cpu");
        obj.put("processor", cpu);

        UtilsHTTP.sendPOST(Main.protocol + "://" + Main.host + ":" + Main.port + "/dades", obj.toString(),
                (response) -> {
                    loadConsolesByCPUCallback(response);
                });
    }

    public void loadConsolesByCPUCallback(String response) {
        showLoading();
        JSONObject objResponse = new JSONObject(response);
        if (objResponse.getString("status").equals("OK")) {
            JSONArray JSONlist = objResponse.getJSONArray("result");
            URL resource = this.getClass().getResource("./assets/viewItemConsola.fxml");
            for (int i = 0; i < JSONlist.length(); i++) {
                JSONObject console = JSONlist.getJSONObject(i);

                try {
                    // Load template and set controller
                    FXMLLoader loader = new FXMLLoader(resource);
                    Parent itemTemplate = loader.load();
                    ControllerItemConsola itemController = loader.getController();

                    itemController.setNombreConsola(console.getString("name"));
                    itemController.setMarca(console.getString("brand"));
                    itemController.setProcesador(console.getString("processor"));
                    itemController.setCirculo(console.getString("color"));

                    try {
                        Image image = new Image(
                                Main.protocol + "://" + Main.host + ":" + Main.port + "/"
                                        + console.getString("image"));
                        itemController.setImagen(image);
                    } catch (Exception e) {

                    }

                    // Add template to the list
                    listaConsolas.getChildren().add(itemTemplate);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        hideLoading();
    }

}
