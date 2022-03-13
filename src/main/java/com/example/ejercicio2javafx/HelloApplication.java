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

        stage.setTitle("Pokimon Profile");

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
        ImageView profile = new ImageView(new Image(HelloApplication.class.getResourceAsStream("drawable/pokedex.png")));
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
        nombreText.setText("Nombre");
        nombreText.setFont(Font.font("Arial" , 14));
        Text direcText = new Text();
        direcText.setText("Ciudad");
        direcText.setFont(Font.font("Arial" , 14));
        Text tel = new Text();
        tel.setText("Teléfono");
        tel.setFont(Font.font("Arial" , 14));
        Text juego = new Text();
        juego.setText("Juego");
        juego.setFont(Font.font("Arial" , 14));
        Text gen = new Text();
        gen.setText("Generación");
        gen.setFont(Font.font("Arial" , 14));
        TextField nombre = new TextField("Daniel");
        nombre.setMinWidth(200);
        nombre.setMinHeight(25);
        TextField direccion = new TextField("Pueblo Paleta");
        direccion.setMinWidth(200);
        direccion.setMinHeight(25);
        TextField telefono = new TextField("681133534");
        telefono.setMinWidth(200);
        telefono.setMinHeight(25);
        TextField juegos = new TextField("Pokemon Rojo");
        juegos.setMinWidth(200);
        juegos.setMinHeight(25);
        TextField generación = new TextField("1ª Generación");
        generación.setMinWidth(200);
        generación.setMinHeight(25);
        textField.getChildren().add(nombre);
        textField.getChildren().add(direccion);
        textField.getChildren().add(telefono);
        textField.getChildren().add(juegos);
        textField.getChildren().add(generación);


        texts.getChildren().add(nombreText);
        texts.getChildren().add(direcText);
        texts.getChildren().add(tel);
        texts.getChildren().add(juego);
        texts.getChildren().add(gen);
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
        Text title = new Text("DATOS");
        title.setFont(Font.font("Arial",  FontWeight.BOLD,20));
        title.setFill(Color.WHITE);
        login.getChildren().add(title);
        login.setStyle("-fx-background-color: #F22F1D;" +
                "-fx-background-radius: 8px;");
        login.setMinHeight(100);
        login.setMinWidth(175);
        hbox.getChildren().add(login);
        //Space
        VBox space =new VBox();
        space.setMinWidth(20);
        hbox.getChildren().add(space);
        //pokemons
        VBox pokemons = new VBox();

        pokemons.setAlignment(Pos.CENTER);
        Text pokeName = new Text("905");
        pokeName.setFont(Font.font("Arial",  FontWeight.BOLD,20));
        pokeName.setFill(Color.WHITE);
        pokemons.getChildren().add(pokeName);
        Text pokeText = new Text("Pokemons");
        pokeText.setFont(Font.font("Arial",16));
        pokeText.setFill(Color.WHITE);
        pokemons.getChildren().add(pokeText);
        pokemons.setStyle("-fx-background-color: #F22F1D;" +
                "-fx-background-radius: 8px;");
        pokemons.setMinHeight(100);
        pokemons.setMinWidth(100);
        hbox.getChildren().add(pokemons);
        //space
        VBox space2 =new VBox();
        space2.setMinWidth(20);
        hbox.getChildren().add(space2);
        //juegos
        VBox juegos = new VBox();

        juegos.setAlignment(Pos.CENTER);
        Text numJuego= new Text("33");
        numJuego.setFont(Font.font("Arial",  FontWeight.BOLD,20));
        numJuego.setFill(Color.WHITE);
        juegos.getChildren().add(numJuego);
        Text juegoText = new Text("Juegos");
        juegoText.setFont(Font.font("Arial",16));
        juegoText.setFill(Color.WHITE);
        juegos.getChildren().add(juegoText);
        juegos.setStyle("-fx-background-color: #F22F1D;" +
                "-fx-background-radius: 8px;");
        juegos.setMinHeight(100);
        juegos.setMinWidth(100);
        hbox.getChildren().add(juegos);

        //space
        VBox space3 =new VBox();
        space3.setMinWidth(20);
        hbox.getChildren().add(space3);

        //anime
        VBox animes = new VBox();

        animes.setAlignment(Pos.CENTER);
        Text temporada= new Text("24");
        temporada.setFont(Font.font("Arial",  FontWeight.BOLD,20));
        temporada.setFill(Color.WHITE);
        animes.getChildren().add(temporada);
        Text temporadaText = new Text("Temporadas");
        temporadaText.setFont(Font.font("Arial",16));
        temporadaText.setFill(Color.WHITE);
        animes.getChildren().add(temporadaText);
        animes.setStyle("-fx-background-color: #F22F1D;" +
                "-fx-background-radius: 8px;");
        animes.setMinHeight(100);
        animes.setMinWidth(100);
        hbox.getChildren().add(animes);




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

        Text title = new Text("Juegos");
        title.setFont(Font.font("Arial", 14));
        vbox.getChildren().add(title);
        Separator separator =new Separator();
        vbox.getChildren().add(separator);
        // arceus
        CheckBox arceus =new CheckBox();
        arceus.setText("Leyendas Pokemon: Arceus");
        arceus.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(arceus);

        // espada
        CheckBox espada =new CheckBox();
        espada.setText("Pokemon Espada y Escudo");
        espada.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(espada);

        // Let's go Evee
        CheckBox letsgoEvee =new CheckBox();
        letsgoEvee.setText("Pokemon Let's go Evee");
        letsgoEvee.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(letsgoEvee);

        // Let's go Pikachu
        CheckBox letsgoPikachu =new CheckBox();
        letsgoPikachu.setText("Pokemon Let's go Pikachu");
        letsgoPikachu.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(letsgoPikachu);

        // Rojo
        CheckBox red =new CheckBox();
        red.setText("Pokemon Rojo");
        red.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(red);

        // Azul
        CheckBox blue =new CheckBox();
        blue.setText("Pokemon Azul");
        blue.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(blue);

        // Amarillo
        CheckBox yellow =new CheckBox();
        yellow.setText("Pokemon Amarillo");
        yellow.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(yellow);

        // Plata
        CheckBox plata =new CheckBox();
        plata.setText("Pokemon Plata");
        plata.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(plata);

        // Oro
        CheckBox oro =new CheckBox();
        oro.setText("Pokemon Oro");
        oro.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(oro);

        // Cristal
        CheckBox cristal =new CheckBox();
        cristal.setText("Pokemon Cristal");
        cristal.setPadding(new Insets(10,0,0,0));
        vbox.getChildren().add(cristal);



        // Negro
        CheckBox black =new CheckBox();
        black.setText("Pokemon Negro");
        black.setPadding(new Insets(10,0,10,0));
        vbox.getChildren().add(black);


        //Button
        Button button = new Button();
        button.setText("Guardar");
        vbox.getChildren().add(button);
        return vbox;
    }
    public ToolBar addToolbarTop(){
        Background background = new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY));
        ToolBar toolbar = new ToolBar();
        toolbar.setPadding(new Insets(4, 4, 4, 4));

        Button pokedex = new Button("Pokedex");
        pokedex.setBackground(background);


        Button juegos = new Button("Juegos");
        juegos.setBackground(background);

        Button anime = new Button("Anime");
        anime.setBackground(background);

        Button mapas = new Button("Mapas");
        mapas.setBackground(background);

        toolbar.getItems().add(pokedex);
        toolbar.getItems().add(juegos);
        toolbar.getItems().add(anime);
        toolbar.getItems().add(mapas);
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


        Text title = new Text("Pokimons Iniciales");
        title.setFont(Font.font("Arial", 14));
        vbox.getChildren().add(title);
        Separator separator =new Separator();
        vbox.getChildren().add(separator);
        //Vbox Charmander
        VBox vboxCharmander = new VBox();
        vboxCharmander.setPadding(new Insets(10));
        vboxCharmander.setSpacing(8);
        Text charmander = new Text("Charmander");
        title.setFont(Font.font("Arial", 14));
        vboxCharmander.setAlignment(Pos.TOP_CENTER);
        vboxCharmander.setBorder(border);
        vboxCharmander.getChildren().add(charmander);
        ImageView charmanderImg = new ImageView(new Image(HelloApplication.class.getResourceAsStream("drawable/charmander.png")));
        charmanderImg.setFitHeight(100);
        charmanderImg.setFitWidth(100);
        vboxCharmander.getChildren().add(charmanderImg);

        //Vbox Squirtle
        VBox vboxSquirtle = new VBox();
        vboxSquirtle.setPadding(new Insets(10));
        vboxSquirtle.setSpacing(8);
        Text squirtle = new Text("Squirtle");
        title.setFont(Font.font("Arial", 14));
        vboxSquirtle.setAlignment(Pos.TOP_CENTER);
        vboxSquirtle.setBorder(border);
        vboxSquirtle.getChildren().add(squirtle);
        ImageView squirtleImg = new ImageView(new Image(HelloApplication.class.getResourceAsStream("drawable/squirtle.png")));
        squirtleImg.setFitHeight(100);
        squirtleImg.setFitWidth(100);
        vboxSquirtle.getChildren().add(squirtleImg);

        //Vbox Bulbasaur
        VBox vboxBulbasaur = new VBox();
        vboxSquirtle.setPadding(new Insets(10));
        vboxSquirtle.setSpacing(8);
        Text bulbasaur = new Text("Bulbasaur");
        title.setFont(Font.font("Arial", 14));
        vboxBulbasaur.setAlignment(Pos.TOP_CENTER);
        vboxBulbasaur.setBorder(border);
        vboxBulbasaur.getChildren().add(bulbasaur);
        ImageView bulbasaurImg = new ImageView(new Image(HelloApplication.class.getResourceAsStream("drawable/bulbasaur.png")));
        bulbasaurImg.setFitHeight(100);
        bulbasaurImg.setFitWidth(100);
        vboxBulbasaur.getChildren().add(bulbasaurImg);


        vbox.getChildren().add(vboxCharmander);
        vbox.getChildren().add(vboxSquirtle);
        vbox.getChildren().add(vboxBulbasaur);

        return vbox;
    }

}