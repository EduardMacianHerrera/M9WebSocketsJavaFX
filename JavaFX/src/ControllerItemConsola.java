import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
        System.out.println("Cargar detalles consola " + nombreConsola.getText());
    }

    public void setImagen(ImageView imagen) {
        // Mirar de cargar la foto
        this.imagen.setImage(null);
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

}
