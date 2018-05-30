import javafx.application.Application; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Mi primer Hola mundo en JavaFX
 *
 * @author (Carlos Alvarez)
 * @version (1.0)
 */
public class HolaMundo extends Application
{
    // Hacemos un seguimiento del recuento y etiqueta que muestra el recuento:
    private int count = 0; //contador
    private Label myLabel = new Label("0"); //etiqueta comienza en 0.

    @Override
    public void start(Stage stage) throws Exception
    {
        // Creamos el boton de nombre contador.
        Button myButton = new Button("Hola Mundo");

        // Creación de cuadricula y ventana
        GridPane pane = new GridPane(); //nuevo panel de cuadricula.
        pane.setPadding(new Insets(100, 100, 100, 100)); //situa el botón hola mundo en la parte que necesites dentro de la ventana
        pane.setMinSize(600, 600); // tamaño de la ventana
        pane.setVgap(10); //posiciona Verticalmente el número contador que va al lado de "Hola Mundo"
        pane.setHgap(10); //posiciona Horizontalmente el número contador que va al lado de "Hola Mundo"

        //Se establece una acción en el botón utilizando la referencia de método.
        myButton.setOnAction(this::buttonClick);

        // Añadimos a la ventana la cuadricula y el panel.
        pane.add(myLabel, 1, 0); 
        pane.add(myButton, 0, 0);

        // Contenido de ventana, dentro de la ventana en sí.
        Scene scene = new Scene(pane, 600,600); // Generamos una escena y marcamos el tamaño de la misma
        stage.setTitle("Hola Mundo Ejemplo JavaFX"); // Titulo de encabezado a mostrar.
        stage.setScene(scene); //Refiere a la escena creada anteriormente.

        // Mostramos el escenario.
        stage.show();
    }

    /**
     * 
     * Este método incrementará nuestro contador en +1 por cada click que hagamos encima del boton.
     */
    private void buttonClick(ActionEvent event)
    {
        // Cuenta la cantidad de clics al botón y muestra el resultado en una etiqueta.
        count = count + 1;
        myLabel.setText(Integer.toString(count)); //Espera un int en un String de ahí el Integer.
    }
}
