
package com.info.habito.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habito {
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String nome;

    /**
     * @return the id
     */
    private Integer getId() {
        return id;
    }

    /**
     * @return the nome
     */
    private String getNome() {
        return nome;
    }

    /**
     * @param id the id to set
     */
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * @param nome the nome to set
     */
    private void setNome(String nome) {
        this.nome = nome;
    }
}
