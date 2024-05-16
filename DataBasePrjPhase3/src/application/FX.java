package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FX extends Application {

	@Override
	public void start(Stage primaryStage) {
		AnchorPane root = new AnchorPane();

		Pane pane = new Pane();
		pane.setPrefSize(1044, 551);

		Rectangle rectangle = new Rectangle(158, 551);
		rectangle.setArcHeight(5);
		rectangle.setArcWidth(5);
		rectangle.setFill(Color.rgb(64, 7, 231, 0.9));

		Label label = new Label("Welcome");
		label.setLayoutX(66);
		label.setLayoutY(14);
		label.setPrefSize(85, 26);
		label.setStyle("-fx-font: normal bold 20px serif;");
		label.setTextFill(Color.rgb(250, 247, 247));

		pane.getChildren().addAll(rectangle, label);
		root.getChildren().add(pane);

		Scene scene = new Scene(root, 1044, 551);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}