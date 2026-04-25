package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class Pessoa implements Serializable {

    private String nome;
    private List<String> lista = new ArrayList<>();

    public void adicionar() {
        lista.add(nome);
        nome = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getLista() {
        return lista;
    }
}