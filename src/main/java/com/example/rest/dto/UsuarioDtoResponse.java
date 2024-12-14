package com.example.rest.dto;
import com.example.rest.model.AdressModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDtoResponse {

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }


    private String name;
    private String tel;
    private String lastname;
    private AdressModel adress;

    public AdressModel getAdress() {
        return adress;
    }

    public void setAdress(AdressModel adress) {
        this.adress = adress;
    }


}
