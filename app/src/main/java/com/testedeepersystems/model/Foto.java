package com.testedeepersystems.model;

public class Foto {
    private int id;
    private String nomeArquivo;


    public Foto() {
    }

    public Foto(Integer id, String nomeArquivo) {
        this.id = id;
        this.nomeArquivo = nomeArquivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
}
