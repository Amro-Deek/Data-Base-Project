package application;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.Blend;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FXDesign extends Application {

	private Pane innerPane;
	private Pane branchPane = new BranchPane();
	private Pane menuPane = new MenuPane();
	private Pane dashBoardPane = new DashBoardPane();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		AnchorPane root = new AnchorPane();

		Pane pane = new Pane();
		pane.setPrefSize(1044, 551);

		Rectangle rectangle = new Rectangle(158, 551);
		rectangle.setArcHeight(5);
		rectangle.setArcWidth(5);
		rectangle.setFill(Color.web("#400727e5"));

		Label label = new Label("Welcome to BBQ");
		label.setLayoutX(1);
		label.setLayoutY(14);
		label.setPrefSize(164, 26);
		label.setStyle("-fx-font: normal bold 20px serif;");
		label.setTextFill(Color.rgb(250, 247, 247));
		label.setUnderline(true);
		SepiaTone sepiaTone = new SepiaTone();
		label.setEffect(sepiaTone);

		innerPane = new Pane();
		innerPane.setLayoutX(158);
		innerPane.setPrefSize(887, 551);
		Image backgroundImage = new Image(getClass().getResourceAsStream("pizza.jpg"));
		ImageView backgroundImageView = new ImageView(backgroundImage);
		backgroundImageView.fitWidthProperty().bind(innerPane.widthProperty());
		backgroundImageView.fitHeightProperty().bind(innerPane.heightProperty());
		innerPane.getChildren().add(backgroundImageView);
		innerPane.getChildren().clear();
		innerPane.getChildren().add(dashBoardPane);

		VBox vBox = new VBox();
		vBox.setLayoutX(16);
		vBox.setLayoutY(84);
		vBox.setPrefSize(126, 308);
		vBox.setSpacing(20);
		primaryStage.setTitle("Dash Board Screen");

		for (int i = 0; i < 11; i++) {
			Label innerLabel = new Label();
			innerLabel.setPrefSize(116, 26);
			innerLabel.setAlignment(javafx.geometry.Pos.CENTER);
			innerLabel.setTextFill(Color.rgb(255, 252, 252));
			innerLabel.setStyle("-fx-font: normal bold 22px serif;");
			innerLabel.setCursor(Cursor.HAND);
			innerLabel.setEffect(new Blend());
			switch (i) {
			case 0:
				innerLabel.setText("Dash Board");
				innerLabel.setOnMouseClicked(event -> {
					innerPane.getChildren().clear();
					innerPane.getChildren().add(dashBoardPane);
					primaryStage.setTitle("Dash Board Screen");
				});
				break;
			case 1:
				innerLabel.setText("Branches");
				innerLabel.setOnMouseClicked(event -> {
					innerPane.getChildren().clear();
					// innerPane.getChildren().add(backgroundImageView);
					innerPane.getChildren().add(branchPane);
					primaryStage.setTitle("Branches Screen");
				});
				break;
			case 2:
				innerLabel.setText("Menu");
				innerLabel.setOnMouseClicked(event -> {
					innerPane.getChildren().clear();
					// innerPane.getChildren().add(backgroundImageView);
					innerPane.getChildren().add(menuPane);
					primaryStage.setTitle("Menus Screen");
				});
				break;
			case 3:
				innerLabel.setText("Menu Items");
				innerLabel.setOnMouseClicked(e -> {
					primaryStage.setTitle("Menu Items Screen");
				});
				break;
			case 4:
				innerLabel.setText("Tables");
				innerLabel.setOnMouseClicked(e -> {
					primaryStage.setTitle("Tables Screen");
				});
				break;
			case 5:
				innerLabel.setText("Orders");
				innerLabel.setOnMouseClicked(e -> {
					primaryStage.setTitle("Orders Screen");
				});
				break;
			case 6:
				innerLabel.setText("Customers");
				innerLabel.setOnMouseClicked(e -> {
					primaryStage.setTitle("Customers Screen");
				});
				break;
			case 7:
				innerLabel.setText("Employees");
				innerLabel.setOnMouseClicked(e -> {
					primaryStage.setTitle("Employees Screen");
				});
				break;
			case 8:
				innerLabel.setText("Delivery");
				innerLabel.setOnMouseClicked(e -> {
					primaryStage.setTitle("Delivery Screen");
				});
				break;
			case 9:
				innerLabel.setText("Payment");
				innerLabel.setOnMouseClicked(e -> {
					primaryStage.setTitle("Payment Screen");
				});
				break;
			default:
				break;
			}
			vBox.getChildren().add(innerLabel);
		}

		pane.getChildren().addAll(rectangle, label, innerPane, vBox);
		root.getChildren().add(pane);

		Scene scene = new Scene(root, 1044, 551);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
