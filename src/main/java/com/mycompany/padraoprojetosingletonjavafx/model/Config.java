/*
 * #10 CRIACIONAIS: SINGLETON
 * Implementar aplicação OpenJFX utilizando padrão Singleton
 * Implementar aplicação do último vídeo (https://www.youtube.com/watch?v=VgDZsSMjmcU&feature=youtu.be) 
 * e disponibilizar link para o repositório no GitHub.
 */
package com.mycompany.padraoprojetosingletonjavafx.model;

/**
 *
 * @author Lidiane
 */

/**
 * Classe que gerencia as configurações do sistema, armazenadas no arquivo no
 * config.properties.
 *  
 * @author manoelcampos
 */

public class Config {
    
    //aplicando o padrão Sigleton, forçando a classe ter uma única instância.
    private static final Config instance = new Config();
    
    private String formatRelatorios = "html";
    private String tipoGraficos = "pizza";

     private Config() {}
     
     //Acessando a instância única
     public static Config getInstace(){
         return instance;
         
     }
    
    /**
     * @return the formatRelatorios
     */
    public String getFormatRelatorios() {
        return formatRelatorios;
    }

    /**
     * @param formatRelatorios the formatRelatorios to set
     */
    public void setFormatRelatorios(String formatRelatorios) {
        this.formatRelatorios = formatRelatorios;
    }

    /**
     * @return the tipoGraficos
     */
    public String getTipoGraficos() {
        return tipoGraficos;
    }

    /**
     * @param tipoGraficos the tipoGraficos to set
     */
    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }
    
    
}
