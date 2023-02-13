import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class ControllerItemConsola {

    @FXML
    private ImageView imagen;

    @FXML
    private Label nombreConsola;

    @FXML
    private Label marca;

    @FXML
    private Label procesador;

    @FXML
    private Circle circulo;

    @FXML
    private void loadDetails() {
        ControllerDades ctrlDades = (ControllerDades) UtilsViews.getController("ViewDades");
        ctrlDades.loadDetails(getNombreConsola().getText());
        UtilsViews.setViewAnimating("ViewDades");
    }

    public void setImagen(Image imagen) {
        this.imagen.setImage(imagen);
        this.imagen.setFitWidth(80);
        this.imagen.setPreserveRatio(true);
    }

    public void setNombreConsola(String nombreConsola) {
        this.nombreConsola.setText(nombreConsola);
    }

    public void setMarca(String marca) {
        this.marca.setText(marca);
    }

    public void setProcesador(String procesador) {
        this.procesador.setText(procesador);
    }

    public void setCirculo(String color) {
        circulo.setStyle("-fx-fill: " + color);
    }

    public Label getNombreConsola() {
        return nombreConsola;
    }

}
