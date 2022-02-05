/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cersocode.app.service;

import com.cersocode.app.entity.Usuario;
import java.util.List;

/**
 *
 * @author vicec
 */
public interface UsuarioService {
    
    public List<Usuario> listAllUsuarios();
    
    
    public Usuario addUsuarios(Usuario usuario);
    
}
