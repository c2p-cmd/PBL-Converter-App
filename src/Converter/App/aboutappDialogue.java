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
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import java.util.Objects;

class aboutapp{

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
    static void createaboutappContent() {
        CustomDialog dialog = new CustomDialog( );
        dialog.openDialog();
    }
    private static class CustomDialog extends Stage {

        private final ScaleTransition scale1 = new ScaleTransition();
        private final ScaleTransition scale2 = new ScaleTransition();
        private final SequentialTransition anim = new SequentialTransition(scale1, scale2);
        //Constructor
        CustomDialog() {
            Pane aboutApproot = new Pane();
            scale1.setFromX(0.01);
            scale1.setFromY(0.01);
            scale1.setToY(1.0);
            scale1.setDuration(Duration.seconds(0.2));
            scale1.setInterpolator(EXP_IN);
            scale1.setNode(aboutApproot);
            scale2.setFromX(0.01);
            scale2.setToX(1.0);
            scale2.setDuration(Duration.seconds(0.2));
            scale2.setInterpolator(EXP_OUT);
            scale2.setNode(aboutApproot);

            Label space1 = new Label();
            space1.setPrefHeight(10);
            space1.setPrefWidth(25);

            Label space = new Label();
            space.setPrefHeight(50);
            space.setPrefWidth(15);
            initStyle(StageStyle.TRANSPARENT);//Set the scene transparent

            //Label to store header text  of about app
            Label aboutAppheadertxt = new Label("About Converter App");
            aboutAppheadertxt.setId("headerLabel");

            //Label header text one of about app
            Label aboutAppheadertxt1 = new Label("\nWhat is Converter?\nThis is an all in one converter created using   \nJavaFX.\nThis app is for Engineers, by Engineers.\n");
            aboutAppheadertxt1.setId("header1Label");

            //Label header text two of about app
            Label aboutAppheadertxt2 = new Label("\nBrief up about Converter.\n");
            aboutAppheadertxt2.setId("header2Label");

            //Label to store content text
            Label aboutAppcontentText = new Label("\nFeatures of Converter.App \uD83D\uDE0E:-\n1. Calculator\n2. Tree Conversions\n3. Programmer Operations\n4. Scientific Calculations\n5. Unit Conversions");
            aboutAppcontentText.setId("contentLabel");

            //Creating image view and label for it
            Label aboutAppimageLabel = new Label();
            aboutAppimageLabel.setPrefHeight(50);
            aboutAppimageLabel.setPrefWidth(50);
            aboutAppimageLabel.setId("aboutAppimageLabel");

            //Hbox to store header and image label
            HBox aboutAppheader_Image= new HBox(5 ,aboutAppheadertxt1,space,aboutAppimageLabel);

            //Vbox to store the labels
            VBox aboutAppbox = new VBox( aboutAppheadertxt ,aboutAppheader_Image,aboutAppheadertxt2, space1,new Separator(Orientation.HORIZONTAL) , aboutAppcontentText);

            //Css for the Vbox
            aboutAppbox.setId("dialogueVbox");
            aboutAppbox.setPadding(new Insets(10,0,0,15));
            aboutAppbox.setPrefHeight(300);
            aboutAppbox.setPrefWidth(350);

            // Button to close the dialogue and its Css
            Button aboutAppbtn = new Button("OK");
            aboutAppbtn.setPrefHeight(26);
            aboutAppbtn.setPrefWidth(55);
            aboutAppbtn.setId("dialogueOkbutton");

            aboutAppbtn.setTranslateX(285);
            aboutAppbtn.setTranslateY(260);
            aboutAppbtn.setOnAction(e ->closeDialog());

            aboutApproot.getChildren().addAll( aboutAppbox, aboutAppbtn);//Adding all the nodes to the root pane
            Scene scene = new Scene(aboutApproot,350 , 300);//Creating a scene
            scene.getStylesheets().add(Objects.requireNonNull(aboutapp.class.getResource("Calculator.css")).toExternalForm());//Importing the stylesheet
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
