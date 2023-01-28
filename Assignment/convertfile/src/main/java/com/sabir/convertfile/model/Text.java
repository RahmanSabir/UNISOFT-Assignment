package com.sabir.convertfile.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Text {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String department;

    public Text(String arr[]) {
        this.id = Long.getLong(arr[0]);
        this.name = arr[1];
        this.department = arr[2];
    }

    public Text() {
    }
}
