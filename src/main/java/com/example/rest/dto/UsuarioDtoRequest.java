package com.example.rest.dto;
import com.example.rest.model.AdressModel;
import com.example.rest.model.UsuarioModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDtoRequest {

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
    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public UsuarioModel ToModel(AdressModel end) {
        UsuarioModel userModel = new UsuarioModel();
        userModel.setName(this.name);
        userModel.setLastName(this.lastname);
        userModel.setTel(this.lastname);
       userModel.setAdress(end);

        return userModel;
    }

//     public UsuarioDto ToDto(UsuarioModel userModel) {
//        UsuarioDto userDto = new UsuarioDto();
//        userDto.setNome(userModel.getNome());
//        userDto.setSobrenome(userModel.getSobrenome());
//        userDto.setTelefone(userModel.getTelefone());
//        userDto.setEndereco(userModel.getEndereco());
//
//        return userDto;
//    }
}
