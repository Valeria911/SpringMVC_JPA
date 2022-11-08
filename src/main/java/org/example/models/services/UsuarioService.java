package org.example.models.services;

import org.example.models.entities.Usuario;
import org.example.models.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    IUsuarioRepository usuarioRepository;

    public UsuarioService(){}

    public void create(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public List<Usuario> readAll(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> readOne(Long idUsuario){
        return usuarioRepository.findById(idUsuario);
    }

    public void update(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void delete(Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }

  /*  @Autowired
    UsuarioDAOImpl usuarioDAO;

    public UsuarioService(){}

    public void create(Usuario usuario){
        usuarioDAO.create(usuario);
    }

    public List<Usuario> readAll(){
        return usuarioDAO.readAllUsers();
    }

    public Usuario readOne(Long idUsuario){
        return usuarioDAO.readOne(idUsuario);
    }

    public void update(Usuario usuario){
        usuarioDAO.update(usuario);
    }

    public void delete(Long idUsuario){
        usuarioDAO.delete(idUsuario);
    }*/
}
