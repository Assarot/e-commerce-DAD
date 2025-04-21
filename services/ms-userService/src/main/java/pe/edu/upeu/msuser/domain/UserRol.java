package pe.edu.upeu.msuser.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tbl_user_rol")
public class UserRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;
    @Column(name = "user_id", nullable = false)
    private int User_Id;
    @Column(name = "rol_id", nullable = false)
    private int Rol_Id;
}
