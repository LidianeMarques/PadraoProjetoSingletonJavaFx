/*
 * #10 CRIACIONAIS: SINGLETON
 * Implementar aplicação OpenJFX utilizando padrão Singleton
 * Implementar aplicação do último vídeo (https://www.youtube.com/watch?v=VgDZsSMjmcU&feature=youtu.be) 
 * e disponibilizar link para o repositório no GitHub.
 */
package com.mycompany.padraoprojetosingletonjavafx.view;

import com.mycompany.padraoprojetosingletonjavafx.App;
import com.mycompany.padraoprojetosingletonjavafx.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

/**
 *
 * @author Lidiane
 */

/**
 * Cena (tela/view) para exibição de relatórios.
 * @author manoelcampos
 */

public class RelatoriosScene extends AbstractScene {
    
    private final Config config = Config.getInstace();

    public RelatoriosScene(App app) {
        super(app);
        
        var label = new Label("Formato de relatórios =  " + config.getFormatRelatorios());
        var botaoVoltar = new Button("Voltar");
        setRoot(new TilePane(label, botaoVoltar));
        botaoVoltar.setOnAction(event -> app.setScence(new MainScene(app)));
        
        
    }
    
}
