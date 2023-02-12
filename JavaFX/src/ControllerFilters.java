import javafx.fxml.FXML;

public class ControllerFilters {

    @FXML
    private void backButton(){
        UtilsViews.setViewAnimating("ViewLogin");
    }

    @FXML
    private void loadMarques() {
        ControllerMarques ctrlMarques = (ControllerMarques) UtilsViews.getController("ViewMarques");
        ctrlMarques.loadBrands();
        UtilsViews.setViewAnimating("ViewMarques");
    }

    @FXML
    private void loadColors() {
        ControllerColors crtlColors = (ControllerColors) UtilsViews.getController("ViewColors");
        crtlColors.loadColors();
        UtilsViews.setViewAnimating("ViewColors");
    }

    @FXML
    private void loadCPUs() {
        ControllerCPUs ctrlCPUs = (ControllerCPUs) UtilsViews.getController("ViewCPUs");
        ctrlCPUs.loadColors();
        UtilsViews.setViewAnimating("ViewCPUs");
    }

    @FXML
    private void loadTotes() {
        System.out.println("Totes");
    }
}
