package com.example.rest.service;
import com.example.rest.model.AdressModel;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@Service
public class AdressService {


    private AdressModel  adress = new AdressModel();

    public AdressModel getAdress(String cep) {

        try {
            URL url = new URL("https://viacep.com.br/ws/"+cep+"/json/");
            URLConnection connection = url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            String linha = "";
            StringBuilder jsonCep = new StringBuilder();
            while((linha=br.readLine()) != null){
                jsonCep.append(cep);

            }
            adress = new Gson().fromJson(jsonCep.toString(), AdressModel.class);
        } catch (MalformedURLException e) {
            System.out.println("error");
        } catch (UnsupportedEncodingException e) {
            System.out.println("error");
        } catch (IOException e) {
            System.out.println("error");
        }

    return adress;
}}
