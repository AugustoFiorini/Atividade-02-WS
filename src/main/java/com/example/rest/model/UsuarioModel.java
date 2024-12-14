package com.example.rest.model;
import com.example.rest.dto.UsuarioDtoResponse;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "USUARIO")
public class UsuarioModel {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "LASTNAME", length = 100)
    private String lastname;

    @Column(name = "TEL", length = 10, nullable = false)
    private String tel;

    //Sua função é mapear o relacionamento entre duas tabelas no banco de dados que tenha relação do tipo 1x1.
    @JoinColumn(name = "endereco_id_fk")
    @OneToOne(cascade = CascadeType.ALL) // um endereço para um funcionario fazer sempre a chave estrangeira onde e
    private AdressModel adress;

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public AdressModel getAdress() {
        return adress;
    }

    public void setAdress(AdressModel adress) {
        this.adress = adress;
    }

    public UsuarioDtoResponse ToDtoResponse() {
        UsuarioDtoResponse userDto = new UsuarioDtoResponse();
        this.setName(this.getName());
        this.setLastName(this.getLastName());
        this.setTel(this.getTel());
        this.setAdress(this.getAdress());

        return userDto;
    }


}