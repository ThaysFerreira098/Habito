
package com.info.habito.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HabitoDiario extends Habito{
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String status;

    /**
     * @return the id
     */
    private Integer getId() {
        return id;
    }

    /**
     * @return the status
     */
    private String getStatus() {
        return status;
    }

    /**
     * @param id the id to set
     */
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * @param status the status to set
     */
    private void setStatus(String status) {
        this.status = status;
    }
}
