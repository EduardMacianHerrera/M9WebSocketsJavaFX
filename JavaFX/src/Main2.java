import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {

    public static UtilsWS socketClient;
    public static String protocolWS = "ws";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        UtilsViews.addView(getClass(), "ViewLogin", "./assets/viewLogin.fxml");
        UtilsViews.addView(getClass(), "ViewFiltres", "./assets/viewFiltres.fxml");
        UtilsViews.addView(getClass(), "ViewConsoles", "./assets/viewConsoles.fxml");
        UtilsViews.addView(getClass(), "ViewColors", "./assets/viewColors.fxml");
        UtilsViews.addView(getClass(), "ViewCPUs", "./assets/viewCPUs.fxml");
        UtilsViews.addView(getClass(), "ViewLogin", "./assets/viewLogin.fxml");
        UtilsViews.addView(getClass(), "ViewDades", "./assets/viewDades.fxml");

        Scene scene = new Scene(UtilsViews.parentContainer);

        stage.setScene(scene);
        stage.onCloseRequestProperty(); // Call close method when closing window
        stage.setTitle("Práctica 3.4");
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        socketClient.close();
        System.exit(1);
    }

}
