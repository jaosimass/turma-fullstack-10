package br.com.treina.recife.sgp.api.service; 

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgp.api.model.Usuario;
import br.com.treina.recife.sgp.api.repository.UsuarioRepository;

@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Optional <Usuario> obterDadosDoUsuario(Long id){
        return usuarioRepository.findById(id);
    }

    public Usuario cadastrarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(Long id, Usuario usuario){
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void excluirUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
}
