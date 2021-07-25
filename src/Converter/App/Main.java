package Converter.App;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
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
        primaryStage.setTitle("Converter App");
        primaryStage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("mainIcon.png"))));
        Font.loadFont(getClass().getResourceAsStream("LucidaGrande.ttf"), 14);
        Font.loadFont(getClass().getResourceAsStream("LucidaGrandeBold.ttf"), 14);
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
            controller.clearScientificFields();
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
        aboutUs.setOnAction(actionEvent -> aboutus.createaboutusContent( ));
        MenuItem aboutApp = new MenuItem("About App");
        aboutApp.setId("aboutApp");
        aboutApp.setOnAction(actionEvent -> aboutapp.createaboutappContent());
        // adding to help
        helpMenu.getItems().addAll(aboutUs, new SeparatorMenuItem(), aboutApp);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, helpMenu);
        return menuBar;
    }

}
