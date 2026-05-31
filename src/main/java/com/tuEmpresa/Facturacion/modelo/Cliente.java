package com.tuEmpresa.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.openxava.annotations.Required;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Cliente {

    @Id
    @Column(length=6)
    private int numero;

    @Column
    @Required
    private String nombre;

    @Embedded
    Direccion direccion;


}
