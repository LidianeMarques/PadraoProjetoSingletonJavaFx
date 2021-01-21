/*
 * #10 CRIACIONAIS: SINGLETON
 * Implementar aplicação OpenJFX utilizando padrão Singleton
 * Implementar aplicação do último vídeo (https://www.youtube.com/watch?v=VgDZsSMjmcU&feature=youtu.be) 
 * e disponibilizar link para o repositório no GitHub.
 */
package com.mycompany.padraoprojetosingletonjavafx;

import com.mycompany.padraoprojetosingletonjavafx.view.MainScene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * JavaFX App
 */

/**
 *
 * @author Lidiane
 */

/**
 * @author manoelcampos
 */
public class App extends Application {
    
    /**
     * Stage é o palco, a janela onde as cenas (telas/views) aparecem.
     * Neste exemplo, existe apenas uma janela
     * e apenas são trocadas as cenas a serem exibidas.
     * 
     * Temos a cena principal {@link MainScene},
     * a de relatórios {@link RelatoriosScene}
     * e a de configurações {@link ConfigScene}.
     */

    private Stage stage;

     /**
     * Inicia a primeira cena (tela/view)
     * @param stage palco principal onde as cenas serão exibidas.
     */
    @Override
    public void start(Stage stage) {
        this.stage = stage;
        var label = new Label("Hello, JavaFX ");
        var scene = new MainScene(this);
        stage.setScene(scene);
        stage.show();
    }

     /**
     * Inicia a aplicação.
     * @param args 
     */
    public static void main(String[] args) {
        launch();
    }
    
    /**
     * Troca a cena (tela/view) em exibição.
     * @param scene cena que será exibida
     */
    public void setScence(Scene scene){
        stage.setScene(scene);
        
    }

}