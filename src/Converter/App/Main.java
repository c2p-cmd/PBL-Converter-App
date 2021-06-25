package Converter.App;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        GridPane rootNode = fxmlLoader.load();

        controller = fxmlLoader.getController();

        MenuBar menuBar = createMenu();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());

        Pane menuPane = (Pane) rootNode.getChildren().get(0);
        menuPane.getChildren().add(menuBar);

        Scene scene = new Scene(rootNode);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Converter App");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public MenuBar createMenu() {
        // File Menu
        Menu fileMenu = new Menu("File");
        // File menu pane items
        MenuItem resetEntry = new MenuItem("Reset Value");
        resetEntry.setOnAction(actionEvent -> {
            controller.clearFields();
            // TODO more is there
        });

        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        MenuItem exitItem = new MenuItem("Exit App");
        exitItem.setOnAction(actionEvent -> {
            // exiting app
            Platform.exit();
            System.exit(0);
        });

        fileMenu.getItems().addAll(resetEntry, separatorMenuItem, exitItem);

        // About
        Menu helpMenu = new Menu("Help");
        // about menu pane items
        MenuItem aboutUs = new MenuItem("About Us");
        aboutUs.setOnAction(actionEvent -> aboutUS());
        MenuItem aboutApp = new MenuItem("About App");
        aboutApp.setOnAction(actionEvent -> aboutApp());
        // adding to help
        helpMenu.getItems().addAll(aboutUs, new SeparatorMenuItem(), aboutApp);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, helpMenu);
        return menuBar;
    }

    private void aboutUS() {
        // showing AlertType.Information
        Alert aboutDev = new Alert(Alert.AlertType.INFORMATION);
        aboutDev.setTitle("About the Developers");
        aboutDev.setHeaderText("PBL Batch-B1");
        aboutDev.setContentText(
                "We created this Converter App as our PBL project using JavaFX.\n"+
                "Hope you all enjoy it!\n"
        );
        aboutDev.show();
    }

    private void aboutApp() {
        // showing AlertType.Information
        Alert aboutAppBox = new Alert(Alert.AlertType.INFORMATION);
        aboutAppBox.setTitle("About Converter App");
        aboutAppBox.setHeaderText("What is Converter?");
        aboutAppBox.setContentText(
                // TODO about section
                "Brief up about Converter."
        );
        aboutAppBox.show();
    }
}
