import javafx.fxml.FXML;

public class ControllerFilters {

    @FXML
    private void loadMarques() {
        System.out.println("Marques");
        ControllerMarques ctrlMarques = (ControllerMarques) UtilsViews.getController("ViewMarques");
        ctrlMarques.loadBrands();
        UtilsViews.setViewAnimating("ViewMarques");
    }

    @FXML
    private void loadColors() {
        System.out.println("Colors");
    }

    @FXML
    private void loadCPUs() {
        System.out.println("CPUs");
    }

    @FXML
    private void loadTotes() {
        System.out.println("Totes");
    }
}
