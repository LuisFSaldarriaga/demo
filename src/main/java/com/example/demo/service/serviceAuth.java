package com.example.demo.service;

import com.example.demo.model.Consulta;
import com.example.demo.model.Hacedor;

import com.example.demo.model.Cliente;
import com.example.demo.repository.repositoryCliente;
import com.example.demo.repository.repositoryHacedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceAuth {

    @Autowired
    repositoryCliente clienteRepository;

    @Autowired
    repositoryHacedor hacedorRepository;

    public Consulta getLogin(Consulta props){

        Consulta token = new Consulta(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        String user = props.getEmail();
        String password = props.getPassword();
        String rol = props.getRol();

        try {
            
            if (rol.equals("cliente")){

                Cliente c = clienteRepository.findByEmail(user);

                if (c.getPassword().equals(password)){
                    token.setID(String.valueOf(c.getID()));
                    token.setPassword(password);
                    token.setEmail(user);
                    token.setRol("cliente");
                    token.setStatus("valid");

                    return token;
                }else if (!c.getPassword().equals(password)){
                    token.setStatus("invalid_password");

                    return token;
                }else{

                    token.setStatus("invalid_cliente");
                    return token;
                }

            }else if ( rol.equals("hacedor") ){

                Hacedor h = hacedorRepository.findByEmail(user);

                if (h.getPassword().equals(password)){
                    token.setID(String.valueOf(h.getID()));
                    token.setPassword(password);
                    token.setEmail(user);
                    token.setRol("hacedor");
                    token.setStatus("valid");

                    return token;
                }else if (!h.getPassword().equals(password)){
                    token.setStatus("invalid_password");

                    return token;
                }else{

                    token.setStatus("invalid_hacedor");
                    return token;
                }
            }else{
                token.setStatus("invalid_rol");
                return token;
            }


        } catch (Exception e) {
            token.setStatus("invalid_user");
            System.out.println("Login error. :" + e);
            return token;
        }
        
    }
    
}
