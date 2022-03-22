package com.example.ejercicio2javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        stage.setTitle("Example");

        BorderPane border = new BorderPane();

        VBox center = addVboxCenter();
        VBox left = addVboxLeft();
        VBox right = addVboxRight();
        HBox bottom = addHboxBottom();
        border.setTop(addToolbarTop());
        border.setLeft(left);
        border.setRight(right);
        border.setBottom(bottom);
        border.setCenter(center);
        BorderPane.setMargin( right, new Insets(10));
        BorderPane.setMargin( left, new Insets(10));
        BorderPane.setMargin(bottom , new Insets(10));
        BorderPane.setMargin(center, new Insets(10));


        Scene scene = new Scene(border);

        stage.setScene(scene);
        stage.show();

    }
    public VBox addVboxCenter() {
        BorderStroke borderStroke = new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, new CornerRadii(8),
                new BorderWidths(2));
        Border border = new Border(borderStroke);

        VBox vbox = new VBox();

        vbox.setPadding(new Insets(12));
        vbox.setMinWidth(350);
        vbox.setSpacing(8);
        vbox.setAlignment(Pos.TOP_LEFT);
        vbox.setBorder(border);
        // title
        Text title = new Text("User Profile");
        title.setFont(Font.font("Arial" , 20));
        vbox.getChildren().add(title);
        Separator separator1 =new Separator();
        vbox.getChildren().add(separator1);
        // Image
        HBox image = new HBox();
        image.setPadding(new Insets(10,0,10,0));
        ImageView profile = new ImageView(new Image(HelloApplication.class.getResourceAsStream("drawable/profi.png")));
        profile.setFitHeight(100);
        profile.setFitWidth(100);
        Rectangle clip = new Rectangle(
                profile.getFitWidth(), profile.getFitHeight()
        );
        clip.setArcWidth(20);
        clip.setArcHeight(20);
        profile.setClip(clip);
        image.setAlignment(Pos.CENTER);
        image.getChildren().add(profile);
        vbox.getChildren().add(image);
        //Separator
        Separator separator2 =new Separator();
        separator2.setPadding(new Insets(0,0,10,0));
        vbox.getChildren().add(separator2);

        //TextFields
        //name
        VBox textField = new VBox();
        textField.minWidth(100);
        VBox texts = new VBox();
        textField.setSpacing(10);
        texts.setSpacing(18);
        //texts.setPadding(new Insets(6,0,0,0));

        textField.setPadding(new Insets(0,8,0,24));
        textField.setAlignment(Pos.CENTER);
        texts.setAlignment(Pos.CENTER_LEFT);

        Text nombreText = new Text();
        nombreText.setText("Name");
        nombreText.setFont(Font.font("Arial" , 14));
        Text direcText = new Text();
        direcText.setText("City");
        direcText.setFont(Font.font("Arial" , 14));
        Text tel = new Text();
        tel.setText("Phone");
        tel.setFont(Font.font("Arial" , 14));
        Text juego = new Text();
        juego.setText("Juego");
        juego.setFont(Font.font("Arial" , 14));
        TextField nombre = new TextField("User");
        nombre.setMinWidth(200);
        nombre.setMinHeight(25);
        TextField direccion = new TextField("");
        direccion.setMinWidth(200);
        direccion.setMinHeight(25);
        TextField telefono = new TextField("");
        telefono.setMinWidth(200);
        telefono.setMinHeight(25);


        textField.getChildren().add(nombre);
        textField.getChildren().add(direccion);
        textField.getChildren().add(telefono);



        texts.getChildren().add(nombreText);
        texts.getChildren().add(direcText);
        texts.getChildren().add(tel);
        HBox fields = new HBox();
        fields.getChildren().add(texts);
        fields.getChildren().add(textField);
        vbox.getChildren().add(fields);
        //Separator
        Separator separator3 =new Separator();
        separator3.setPadding(new Insets(10,0,10,0));
        vbox.getChildren().add(separator3);

        //Buttons
        HBox buttons = new HBox();
        buttons.setSpacing(8);
        buttons.setPadding(new Insets(10));

        Button edit = new Button("Editar");
        Button consult = new Button("Consultar");
        Button borrar = new Button("Borrar");

        buttons.getChildren().add(edit);
        buttons.getChildren().add(consult);
        buttons.getChildren().add(borrar);

        vbox.getChildren().add(buttons);
        return vbox;
    }
    public HBox addHboxBottom() {


        HBox hbox = new HBox();
        hbox.setPadding(new Insets(5, 0, 5, 0));

        //Login
        VBox login = new VBox();
        login.setAlignment(Pos.CENTER);
        Text title = new Text("data");
        title.setFont(Font.font("Arial",  FontWeight.BOLD,20));
        title.setFill(Color.WHITE);
        login.getChildren().add(title);
        login.setStyle("-fx-background-color: #B43F1D;" +
                "-fx-background-radius: 8px;");
        login.setMinHeight(100);
        login.setMinWidth(175);
        hbox.getChildren().add(login);
        VBox space =new VBox();
        space.setMinWidth(20);
        hbox.getChildren().add(space);
        VBox users = new VBox();

        users.setAlignment(Pos.CENTER);
        Text textus = new Text("0");
        textus.setFont(Font.font("Arial",  FontWeight.BOLD,20));
        textus.setFill(Color.WHITE);
        users.getChildren().add(textus);
        Text texuser = new Text("Users");
        texuser.setFont(Font.font("Arial",16));
        texuser.setFill(Color.WHITE);
        users.getChildren().add(texuser);
        users.setStyle("-fx-background-color: #B43F1D;" +
                "-fx-background-radius: 20px;");
        users.setMinHeight(100);
        users.setMinWidth(100);
        hbox.getChildren().add(users);
        //space
        VBox space2 =new VBox();
        space2.setMinWidth(20);
        hbox.getChildren().add(space2);
        //juegos
        VBox currency = new VBox();

        currency.setAlignment(Pos.CENTER);
        Text textcur= new Text("10");
        textcur.setFont(Font.font("Arial",  FontWeight.BOLD,20));
        textcur.setFill(Color.WHITE);
        currency.getChildren().add(textcur);
        Text textcur2 = new Text("Currency");
        textcur2.setFont(Font.font("Arial",16));
        textcur2.setFill(Color.WHITE);
        currency.getChildren().add(textcur2);
        currency.setStyle("-fx-background-color: #B54F1D;" +
                "-fx-background-radius: 8px;");
        currency.setMinHeight(100);
        currency.setMinWidth(100);
        hbox.getChildren().add(currency);

        //space
        VBox space3 =new VBox();
        space3.setMinWidth(20);
        hbox.getChildren().add(space3);

        VBox newusers = new VBox();

        newusers.setAlignment(Pos.CENTER);
        Text newusers2= new Text("1000");
        newusers2.setFont(Font.font("Arial",  FontWeight.BOLD,20));
        newusers2.setFill(Color.WHITE);
        newusers.getChildren().add(newusers2);
        Text userstext = new Text("New Users");
        userstext.setFont(Font.font("Arial",16));
        userstext.setFill(Color.WHITE);
        newusers.getChildren().add(userstext);
        newusers.setStyle("-fx-background-color: #B43F1D;" +
                "-fx-background-radius: 8px;");
        newusers.setMinHeight(100);
        newusers.setMinWidth(100);
        hbox.getChildren().add(newusers);




        return hbox;
    }
    public VBox addVboxRight() {
        BorderStroke borderStroke = new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, new CornerRadii(8),
                new BorderWidths(2));
        Border border = new Border(borderStroke);


        VBox vbox = new VBox();

        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);
        vbox.setAlignment(Pos.TOP_LEFT);
        vbox.setBorder(border);

        Text title = new Text("Fields");
        title.setFont(Font.font("Arial", 14));
        vbox.getChildren().add(title);
        Separator separator =new Separator();
        vbox.getChildren().add(separator);

        CheckBox field1 =new CheckBox();
        field1.setText("field 1");
        field1.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(field1);

        CheckBox field2 =new CheckBox();
        field2.setText("field 2");
        field2.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(field2);

        CheckBox field3 =new CheckBox();
        field3.setText("field 3");
        field3.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(field3);

        CheckBox field4 =new CheckBox();
        field4.setText("field 4");
        field4.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(field4);


        CheckBox field5 =new CheckBox();
        field5.setText("field 5");
        field5.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(field5);

        CheckBox field6 =new CheckBox();
        field6.setText("field 6");
        field6.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(field6);

        Button button = new Button();
        button.setText("save");
        vbox.getChildren().add(button);
        return vbox;
    }
    public ToolBar addToolbarTop(){
        Background background = new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY));
        ToolBar toolbar = new ToolBar();
        toolbar.setPadding(new Insets(4, 4, 4, 4));

        Button inde = new Button("Index");
        inde.setBackground(background);


        Button data = new Button("Data");
        data.setBackground(background);

        Button contact = new Button("Contact");
        contact.setBackground(background);

        Button about = new Button("About us");
        about.setBackground(background);

        toolbar.getItems().add(inde);
        toolbar.getItems().add(data);
        toolbar.getItems().add(contact);
        toolbar.getItems().add(about);
        return toolbar;
    }
    public VBox addVboxLeft() {
        BorderStroke borderStroke = new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, new CornerRadii(8),
                new BorderWidths(2));
        Border border = new Border(borderStroke);


        VBox vbox = new VBox();

        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setBorder(border);


        Text title = new Text("List");
        title.setFont(Font.font("Arial", 14));
        vbox.getChildren().add(title);
        Separator separator =new Separator();
        vbox.getChildren().add(separator);

        VBox vbox1 = new VBox();
        vbox1.setPadding(new Insets(10));
        vbox1.setSpacing(8);
        Text text1 = new Text("item 1");
        title.setFont(Font.font("Arial", 14));
        vbox1.setAlignment(Pos.TOP_CENTER);
        vbox1.setBorder(border);
        vbox1.getChildren().add(text1);

        ImageView img1 = new ImageView(new Image(HelloApplication.class.getResourceAsStream("drawable/pythonslogo.png")));
        img1.setFitHeight(100);
        img1.setFitWidth(100);
        vbox1.getChildren().add(img1);

        VBox vbox2 = new VBox();
        vbox2.setPadding(new Insets(10));
        vbox2.setSpacing(8);
        Text squirtle = new Text("item 2");
        title.setFont(Font.font("Arial", 14));
        vbox2.setAlignment(Pos.TOP_CENTER);
        vbox2.setBorder(border);
        vbox2.getChildren().add(squirtle);
        ImageView img2 = new ImageView(new Image(HelloApplication.class.getResourceAsStream("drawable/jaavaslogo.jpg")));
        img2.setFitHeight(100);
        img2.setFitWidth(100);
        vbox2.getChildren().add(img2);

        VBox vbox3 = new VBox();
        vbox2.setPadding(new Insets(10));
        vbox2.setSpacing(8);
        Text bulbasaur = new Text("item 3");
        title.setFont(Font.font("Arial", 14));
        vbox3.setAlignment(Pos.TOP_CENTER);
        vbox3.setBorder(border);
        vbox3.getChildren().add(bulbasaur);
        ImageView img3 = new ImageView(new Image(HelloApplication.class.getResourceAsStream("drawable/cpluslogo.png")));
        img3.setFitHeight(100);
        img3.setFitWidth(100);
        vbox3.getChildren().add(img3);


        vbox.getChildren().add(vbox1);
        vbox.getChildren().add(vbox2);
        vbox.getChildren().add(vbox3);

        return vbox;
    }

}