package Converter.App;

import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import java.util.Objects;


class DialogsApp  {
    //Function to set the in ExpIn interpolator
    private static final Interpolator EXP_IN = new Interpolator() {
        @Override
        protected double curve(double t) {
            return (t == 1.0) ? 1.0 : 1 - Math.pow(2.0, -10 * t);
        }
    };
    //Function to set the ExpOut interpolator
    private static final Interpolator EXP_OUT = new Interpolator() {
        @Override
        protected double curve(double t) {
            return (t == 0.0) ? 0.0 : Math.pow(2.0, 10 * (t - 1));
        }
    };
    //Call the open dialogue function to initiate the dialogue
    static void createContent(String header , String content) {
            CustomDialog dialog = new CustomDialog(header ,content );
            dialog.openDialog();
    }

    private static class CustomDialog extends Stage {

        private final ScaleTransition scale1 = new ScaleTransition();
        private final ScaleTransition scale2 = new ScaleTransition();

        private final SequentialTransition anim = new SequentialTransition(scale1, scale2);
        //Constructor
        CustomDialog(String header, String content) {
            Pane root = new Pane();

            scale1.setFromX(0.01);
            scale1.setFromY(0.01);
            scale1.setToY(1.0);
            scale1.setDuration(Duration.seconds(0.2));
            scale1.setInterpolator(EXP_IN);
            scale1.setNode(root);

            scale2.setFromX(0.01);
            scale2.setToX(1.0);
            scale2.setDuration(Duration.seconds(0.2));
            scale2.setInterpolator(EXP_OUT);
            scale2.setNode(root);

            /*
            initModality(Modality.APPLICATION_MODAL);//Set the scene modality*/
            initStyle(StageStyle.TRANSPARENT);//Set the scene transparent
            //Label to store header text
            Label headertxt = new Label(header);
            headertxt.setId("headerLabel");

            //Label to store content text
            Label contentText = new Label(content);
            contentText.setId("contentLabel");

            //Creating image view and label for it
            ImageView image = new ImageView("http://www.simpleimageresizer.com/_uploads/photos/e81c44de/aboutUs_50x50.png");
            Label imageLabel = new Label();
            imageLabel.setGraphic(image);
            imageLabel.setPrefHeight(50);
            imageLabel.setPrefWidth(50);

            //Hbox to store header and image label
            HBox header_Image= new HBox(78 , headertxt , imageLabel);

            //Vbox to store the labels
            VBox box = new VBox(7 , header_Image , new Separator(Orientation.HORIZONTAL) , contentText);

            //Css for the Vbox
            box.setId("dialogueVbox");
            box.setPadding(new Insets(10,0,0,15));
            box.setPrefHeight(200);
            box.setPrefWidth(350);


            // Button to close the dialogue and its Css
            Button btn = new Button("OK");
            btn.setPrefHeight(26);
            btn.setPrefWidth(75);
            btn.setId("dialogueOkbutton");
            btn.setPadding(new Insets(3 ,30, 3 ,30));
            btn.setTranslateX(225);
            btn.setTranslateY(150);
            btn.setOnAction(e ->closeDialog());

            root.getChildren().addAll( box, btn);//Adding all the nodes to the root pane
            Scene scene = new Scene(root,350 , 200);//Creating a scene
            scene.getStylesheets().add(Objects.requireNonNull(DialogsApp.class.getResource("Calculator.css")).toExternalForm());//Importing the stylesheet
            setScene(scene);

        }

        void openDialog() {
            show();
            anim.play();
        }

        void closeDialog() {
            anim.setOnFinished(e -> close());
            anim.setAutoReverse(true);
            anim.setCycleCount(2);
            anim.playFrom(Duration.seconds(0.66));
        }
    }


}
