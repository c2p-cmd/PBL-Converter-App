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
    static void createaboutusContent(String header ,String header1 ,String header2 , String content) {
            CustomDialog dialog = new CustomDialog(header ,header1 ,header2 ,content );
            dialog.openDialog();
    }
    static void createaboutappContent(String header ,String header1 ,String header2 , String content) {
        CustomDialog dialog = new CustomDialog(header ,header1 ,header2 ,content );
        dialog.openDialog();
    }

    private static class CustomDialog extends Stage {

        private final ScaleTransition scale1 = new ScaleTransition();
        private final ScaleTransition scale2 = new ScaleTransition();

        private final SequentialTransition anim = new SequentialTransition(scale1, scale2);
        //Constructor
        CustomDialog(String header,String header1,String header2, String content) {
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

            Label space = new Label();
            space.setPrefHeight(50);
            space.setPrefWidth(15);
            /*
            initModality(Modality.APPLICATION_MODAL);//Set the scene modality*/
            initStyle(StageStyle.TRANSPARENT);//Set the scene transparent
            //Label to store header text
            Label headertxt = new Label(header);
            headertxt.setId("headerLabel");

            Label headertxt1 = new Label(header1);
            headertxt1.setId("header1Label");
            Label headertxt2 = new Label(header2);
            headertxt2.setId("header2Label");
            //Label to store content text
            Label contentText = new Label(content);
            contentText.setId("contentLabel");

            //Creating image view and label for it

            Label imageLabel = new Label();
            imageLabel.setPrefHeight(50);
            imageLabel.setPrefWidth(50);
            imageLabel.setId("imageLabel");
            //Hbox to store header and image label
            HBox header_Image= new HBox(5 , headertxt ,headertxt1,space , imageLabel);

            //Vbox to store the labels
            VBox box = new VBox(11 , header_Image ,headertxt2, new Separator(Orientation.HORIZONTAL) , contentText);

            //Css for the Vbox
            box.setId("dialogueVbox");
            box.setPadding(new Insets(10,0,0,15));
            box.setPrefHeight(270);
            box.setPrefWidth(350);


            // Button to close the dialogue and its Css
            Button btn = new Button("OK");
            btn.setPrefHeight(26);
            btn.setPrefWidth(55);
            btn.setId("dialogueOkbutton");

            btn.setTranslateX(285);
            btn.setTranslateY(233);
            btn.setOnAction(e ->closeDialog());

            root.getChildren().addAll( box, btn);//Adding all the nodes to the root pane
            Scene scene = new Scene(root,350 , 270);//Creating a scene
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
