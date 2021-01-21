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
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Lidiane
 */

/**
 * Cena (tela/view) para exibição e alteração dos parâmetros de configuração.
 * 
 * @author manoelcampos
 */

public class ConfigScene extends AbstractScene {
    
     private final Config config = Config.getInstace();

    public ConfigScene(App app) {
        super(app);
        
        var label1 = new Label("Formato de Relatórios =  ");
        var fildFormatRelatorios = new TextField(config.getFormatRelatorios());
        var label2 = new Label("Tipos de Gráficos =  ");
        var fildFromatGraficos = new TextField(config.getTipoGraficos());
        var botaoOk = new Button("Ok");
        
        //Adiciona os campos na tela, organizando verticalmente (VBox)
        setRoot(new VBox(label1, fildFormatRelatorios, label2, fildFromatGraficos, botaoOk));
        
        /*Quando o botão for clicado, exibe a cena de Configurações.
        O código usa o recurso de Method Reference introduzido no Java 8.
        */
        botaoOk.setOnAction(event -> {
            config.setFormatRelatorios(fildFormatRelatorios.getText());
            config.setTipoGraficos(fildFromatGraficos.getText());

            app.setScence(new MainScene(app));
        });
    }
    
}
