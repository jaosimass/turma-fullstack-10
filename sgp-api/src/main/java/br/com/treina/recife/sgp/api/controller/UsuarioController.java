package br.com.treina.recife.sgp.api.controller;

import br.com.treina.recife.sgp.api.model.Usuario;
import br.com.treina.recife.sgp.api.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario){
        return usuarioService.cadastrarUsuario(usuario);
    }
    
}
