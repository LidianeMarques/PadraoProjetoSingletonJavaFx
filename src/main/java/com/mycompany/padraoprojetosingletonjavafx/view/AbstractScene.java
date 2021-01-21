/*
 * #10 CRIACIONAIS: SINGLETON
 * Implementar aplicação OpenJFX utilizando padrão Singleton
 * Implementar aplicação do último vídeo (https://www.youtube.com/watch?v=VgDZsSMjmcU&feature=youtu.be) 
 * e disponibilizar link para o repositório no GitHub.
 */
package com.mycompany.padraoprojetosingletonjavafx.view;

import com.mycompany.padraoprojetosingletonjavafx.App;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;

/**
 *
 * @author Lidiane
 */

/**
 * Classe abstrata que representa uma cena (tela/view).
 * 
 * @author manoelcampos
 */

public abstract class AbstractScene extends Scene{
    
    public AbstractScene(App app) {
        super(new TilePane(), 640, 480);
    }
    
}
