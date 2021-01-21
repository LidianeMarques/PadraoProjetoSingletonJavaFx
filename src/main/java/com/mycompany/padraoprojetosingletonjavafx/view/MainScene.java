/*
 * #10 CRIACIONAIS: SINGLETON
 * Implementar aplicação OpenJFX utilizando padrão Singleton
 * Implementar aplicação do último vídeo (https://www.youtube.com/watch?v=VgDZsSMjmcU&feature=youtu.be) 
 * e disponibilizar link para o repositório no GitHub.
 */
package com.mycompany.padraoprojetosingletonjavafx.view;

import com.mycompany.padraoprojetosingletonjavafx.App;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;


/**
 *
 * @author Lidiane
 */

/**
 * Cena (tela/view) principal da aplicação.
 * @author manoelcampos
 */

public class MainScene extends AbstractScene {

    public MainScene(App app) {
        super(app);
        
        var botaoRelatorios = new Button("Relatórios");
        var botaoConfig = new Button("Configurações");
        
        //Adiciona os campos na tela, organizando um após o outro (TilePane)
        setRoot(new TilePane(botaoRelatorios, botaoConfig));
        
        /*Quando o botão for clicado, exibe a cena de Relatórios.
        O código usa o recurso de Expressões Lambda introduzidas no Java 8.
        */
        botaoRelatorios.setOnAction(event -> app.setScence(new RelatoriosScene(app)));

        /*Quando o botão for clicado, exibe a cena de Configurações.
        O código usa o recurso de Expressões Lambda introduzidas no Java 8.
        */
        botaoConfig.setOnAction(event -> app.setScence(new ConfigScene(app)));
        
    }
    
}
