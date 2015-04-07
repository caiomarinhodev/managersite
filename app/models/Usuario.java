package models;

import javax.persistence.*;

/**
 * Created by Caio on 06/04/2015.
 */
@Entity
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String email;
    @Column
    private String telefone;
    @Column
    private int plano;

    public Usuario(){

    }

    public Usuario(String nome, String email, String telefone, int plano) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.plano = plano;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }
}
