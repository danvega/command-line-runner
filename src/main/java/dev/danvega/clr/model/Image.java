package dev.danvega.clr.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Image {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Image(String name) {
        this.name = name;
    }

}
