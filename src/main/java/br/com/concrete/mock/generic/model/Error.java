package br.com.concrete.mock.generic.model;

import java.io.Serializable;

public class Error implements Serializable {

    private int codigo;

    private String mensagem;

    public Error() {
    }

    public Error(int codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

}
