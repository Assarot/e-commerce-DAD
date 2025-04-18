package pe.edu.upeu.msuser.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tbl_tarjetas")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "numero_tarjeta", columnDefinition = "varchar(20)", nullable = false)
    private String numeroTarjeta;
    @Column(name = "nombre_apellido", columnDefinition = "varchar(50)", nullable = false)
    private String nombreApellido;
    @Column(name = "fecha_vencimiento", columnDefinition = "date", nullable = false)
    private String fechaVencimiento;
    @Column(name = "codigo_seguridad", columnDefinition = "varchar(3)", nullable = false)
    private String codigoSeguridad;
    @Column(name = "tipo_documento", columnDefinition = "varchar(5)", nullable = false)
    private String tipoDocumento;
    @Column(name = "numero_documento", columnDefinition = "varchar(15)", nullable = false)
    private String numeroDocumento;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;
}
