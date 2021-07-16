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

class aboutus{
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
    static void createaboutusContent() {
        CustomDialog dialog = new CustomDialog();
        dialog.openDialog();
    }
    private static class CustomDialog extends Stage {

        private final ScaleTransition scale1 = new ScaleTransition();
        private final ScaleTransition scale2 = new ScaleTransition();
        private final SequentialTransition anim = new SequentialTransition(scale1, scale2);
        //Constructor
        CustomDialog() {
            Pane aboutUsroot = new Pane();
            scale1.setFromX(0.01);
            scale1.setFromY(0.01);
            scale1.setToY(1.0);
            scale1.setDuration(Duration.seconds(0.2));
            scale1.setInterpolator(EXP_IN);
            scale1.setNode(aboutUsroot);
            scale2.setFromX(0.01);
            scale2.setToX(1.0);
            scale2.setDuration(Duration.seconds(0.2));
            scale2.setInterpolator(EXP_OUT);
            scale2.setNode(aboutUsroot);

            Label space = new Label();
            space.setPrefHeight(50);
            space.setPrefWidth(10);


            initStyle(StageStyle.TRANSPARENT);//Set the scene transparent

            //Label to store header text of about Us
            Label aboutUsheadertxt = new Label("\nAbout the Developers:");
            aboutUsheadertxt.setId("headerLabel");

            //Label to store header text one  of about Us
            Label aboutUsheadertxt1 = new Label("Sharan Thakur\n"+"Akshad Chidrawar\n"+"Gayatri Morey\n"+"Vidya Jain\n\n");
            aboutUsheadertxt1.setId("header1Label");

            //Label to store header text two  of about Us
            Label aboutUsheadertxt2 = new Label("PBL Batch-B1");
            aboutUsheadertxt2.setId("header2Label");

            //Label to store content text
            Label aboutUscontentText = new Label("We created this Converter App as our PBL project using \nJavaFX.\n"+
                    "\n                          Hope you all enjoy it!\n");
            aboutUscontentText.setId("contentLabel");

            //Creating image view and label for it
            Label aboutUsimageLabel = new Label();
            aboutUsimageLabel.setPrefHeight(50);
            aboutUsimageLabel.setPrefWidth(50);
            aboutUsimageLabel.setId("aboutUsimageLabel");

            //Hbox to store header and image label
            HBox aboutUsheader_Image= new HBox(5,aboutUsheadertxt , aboutUsheadertxt1,space , aboutUsimageLabel);

            //Vbox to store the labels
            VBox aboutUsVbox = new VBox(11  , aboutUsheader_Image ,aboutUsheadertxt2, new Separator(Orientation.HORIZONTAL) , aboutUscontentText);

            //Css for the Vbox
            aboutUsVbox.setId("dialogueVbox");
            aboutUsVbox.setPadding(new Insets(10,0,0,15));
            aboutUsVbox.setPrefHeight(270);
            aboutUsVbox.setPrefWidth(350);


            // Button to close the dialogue and its Css
            Button aboutUsOkbtn = new Button("OK");
            aboutUsOkbtn.setPrefHeight(26);
            aboutUsOkbtn.setPrefWidth(55);
            aboutUsOkbtn.setId("dialogueOkbutton");

            aboutUsOkbtn.setTranslateX(285);
            aboutUsOkbtn.setTranslateY(233);
            aboutUsOkbtn.setOnAction(e ->closeDialog());

            aboutUsroot.getChildren().addAll( aboutUsVbox, aboutUsOkbtn);//Adding all the nodes to the root pane
            Scene scene = new Scene(aboutUsroot,350 , 270);//Creating a scene
            scene.getStylesheets().add(Objects.requireNonNull(aboutus.class.getResource("Calculator.css")).toExternalForm());//Importing the stylesheet
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
