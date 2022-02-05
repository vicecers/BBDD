/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cersocode.app.service.impl;

import com.cersocode.app.entity.Usuario;
import com.cersocode.app.repository.UsuarioRepository;
import com.cersocode.app.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author vicec
 */
@Service("usuarioservice")
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    @Qualifier("usuariorepository")
    private UsuarioRepository usuarioRepository;
            
    @Override
    public List<Usuario> listAllUsuarios() {
        
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario addUsuarios(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
