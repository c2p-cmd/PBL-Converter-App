package Converter.App;

import javafx.animation.Interpolator;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    Controller controller;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        GridPane rootNode = fxmlLoader.load();

        controller = fxmlLoader.getController();//Controller
        //Menu bar creation
        MenuBar menuBar = createMenu();
        menuBar.setId("menuBar");
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        //Menu pane Creation
        Pane menuPane = (Pane) rootNode.getChildren().get(0);
        menuPane.getChildren().add(menuBar);

        //Creating a scene
        Scene scene = new Scene(rootNode);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Objects.requireNonNull(Main.class.getResource("Calculator.css")).toExternalForm());
        //scene.getStylesheets().add(menuBar.getMenus().indexOf("Exit App").getId());
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
        fileMenu.setId("fileMenu");
        // File menu pane items
        MenuItem resetEntry = new MenuItem("Reset Value");
        resetEntry.setId("resetEntry");
        resetEntry.setOnAction(actionEvent -> {
            controller.clearFields();
            controller.clearProFields();
            controller.clearTreeFields();
            // TODO more clears
        });

        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        MenuItem exitItem = new MenuItem("Exit App");
        exitItem.setId("exitItem");
        exitItem.setOnAction(actionEvent -> {
            // exiting app
            Platform.exit();
            System.exit(0);
        });

        fileMenu.getItems().addAll(resetEntry, separatorMenuItem, exitItem);

        // About
        Menu helpMenu = new Menu("Help");
        helpMenu.setId("helpMenu");
        // about menu pane items
        MenuItem aboutUs = new MenuItem("About Us");
        aboutUs.setId("aboutUs");
        aboutUs.setOnAction(actionEvent -> DialogsApp.createContent( "\nAbout the Developers:","Sharan Thakur\n"+"Akshad Chidrawar\n"+"Gayatri Morey\n"+"Vidya Jain\n\n","PBL Batch-B1\n" , "We created this Converter App as our PBL project using \nJavaFX.\n"+
                "\n                          Hope you all enjoy it!\n"));
        MenuItem aboutApp = new MenuItem("About App");
        aboutApp.setId("aboutApp");
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
