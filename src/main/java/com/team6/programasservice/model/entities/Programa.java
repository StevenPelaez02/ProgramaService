package com.team6.programasservice.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "programas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Programa {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String programa;

    //TODO pensar si se le van a poner mas atributos al modelo PROGRAMA
}
