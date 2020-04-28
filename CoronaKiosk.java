import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import java.io.FileInputStream;
import javafx.scene.paint.Color;
import java.io.FileNotFoundException;
import javafx.scene.text.Font;

public class CoronaKiosk extends Application {
    Label State = new Label("State Punjab");
    Label Confirmed = new Label("Confirmed  313");
    Label Recovered = new Label("Recovered  71");
    Label Dead = new Label("Dead    18");
    Label Active = new Label("Active    242");

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        Button states[] = new Button[5];
        State.setTextFill(Color.web("#F0F1EB"));

        Confirmed.setTextFill(Color.web("#ffa500"));
        Dead.setTextFill(Color.web("#F7F2F0"));
        Active.setTextFill(Color.web("#ff0000"));
        Recovered.setTextFill(Color.web("#00ff40"));

        State.setFont(new Font(20));
        Confirmed.setFont(new Font(20));
        Dead.setFont(new Font(20));
        Active.setFont(new Font(20));
        Recovered.setFont(new Font(20));

        String stateNames[] = { "Maharashtra", "Gujarat", "Tamil Nadu", "Telangana", "Kerela" };

        String stateData[] = { "Red", "Red", "Orange", "Yellow", "Yellow" };
        for (int i = 0; i < 5; i++) {
            states[i] = new Button(stateNames[i]);

        }
        states[0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(stateData[0]);
            }
        });
        states[1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(stateData[1]);
            }
        });
        states[2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(stateData[2]);
            }
        });
        states[3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(stateData[3]);
            }
        });
        states[4].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(stateData[4]);
            }
        });
        HBox buttonBox = new HBox();
        for (int i = 0; i < 5; i++) {
            buttonBox.getChildren().addAll(states[i]);
        }
        buttonBox.setSpacing(15);

        Button states2[] = new Button[5];

        String state2Names[] = { "Delhi", "Madhya Pradesh", "Rajasthan", "Uttar Pradesh", "Andhra Pradesh" };

        String state2Data[] = { "Red", "Red", "Orange", "Yellow", "Yellow" };
        for (int i = 0; i < 5; i++) {
            states2[i] = new Button(state2Names[i]);

        }
        states2[0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(state2Data[0]);
            }
        });
        states2[1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(state2Data[1]);
            }
        });
        states2[2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(state2Data[2]);
            }
        });
        states2[3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(state2Data[3]);
            }
        });
        states2[4].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(state2Data[4]);
            }
        });

        HBox buttonBox2 = new HBox();
        for (int i = 0; i < 5; i++) {
            buttonBox2.getChildren().addAll(states2[i]);
        }
        buttonBox2.setSpacing(15);

        Button states3[] = new Button[5];

        String state3Names[] = { "Karnataka", "Assam", "West Bengal", "Madhya Pradesh", "Punjab" };

        String state3Data[] = { "Red", "Red", "Orange", "Yellow", "Yellow" };
        for (int i = 0; i < 5; i++) {
            states3[i] = new Button(state3Names[i]);

        }
        states3[0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(state3Data[0]);
            }
        });
        states3[1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(state3Data[1]);
            }
        });
        states3[2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(state2Data[2]);
            }
        });
        states3[3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(state3Data[3]);
            }
        });
        states3[4].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                printMessage(state3Data[4]);
            }
        });

        HBox buttonBox3 = new HBox();
        for (int i = 0; i < 5; i++) {
            buttonBox3.getChildren().addAll(states3[i]);
        }
        buttonBox3.setSpacing(15);

        Button graphButton = new Button("Total Coronavirus cases in India");
        Image image = new Image(new FileInputStream("graph.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(25);
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);
        imageView.setPreserveRatio(true);
        HBox buttonBox4 = new HBox();
        buttonBox4.getChildren().addAll(graphButton);

        buttonBox4.setSpacing(15);
        VBox root = new VBox();
        BackgroundImage headBackgroundimage = new BackgroundImage(new Image(new FileInputStream("head.jpg")),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        // create Background
        Background headbackground = new Background(headBackgroundimage);
        State.setBackground(headbackground);

        root.getChildren().addAll(buttonBox, buttonBox2, buttonBox3, buttonBox4, State, Confirmed, Recovered, Dead,
                Active);

        graphButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                root.getChildren().addAll(imageView);
            }
        });
        root.setSpacing(15);
        root.setMinSize(350, 250);
        BackgroundImage backgroundimage = new BackgroundImage(new Image(new FileInputStream("corona.jpg")),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        // create Background
        Background background = new Background(backgroundimage);
        root.setBackground(background);
        root.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: blue;");

        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        stage.setTitle("Coronavirus Kiosk");
        stage.show();
    }

    public void printMessage(String message) {
        Confirmed.setText(message);
    }

}
