package pe.edu.upeu.msuser.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tbl_personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre", columnDefinition = "varchar(25)", nullable = false)
    private String nombre;
    @Column(name = "apellidos", columnDefinition = "varchar(85)", nullable = false)
    private String apellidos;
    @Column(name = "email", columnDefinition = "varchar(320)", nullable = false)
    private String email;
    @Column(name = "telefono", columnDefinition = "varchar(20)", nullable = false)
    private String telefono;
    @Column(name = "username", columnDefinition = "varchar(25)", nullable = false)
    private String username;
    @Column(name = "password", columnDefinition = "varchar", nullable = false)
    private String password;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tarjeta> tarjetas;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Direccion> direcciones;

}
