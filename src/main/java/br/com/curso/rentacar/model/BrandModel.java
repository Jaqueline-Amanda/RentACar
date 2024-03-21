package br.com.curso.rentacar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "brands")
public class BrandModel {
    @Id//já põe como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//o valor será gerado automaticamente
    private int id;
    @Column(nullable = false, unique = true, length = 30)//não pode ser null e não deve ser repetido
    private String name;
    @Column(nullable = false, length = 50)
    private String country;

}
