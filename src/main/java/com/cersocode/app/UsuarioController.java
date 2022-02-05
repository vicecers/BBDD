/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cersocode.app;

import com.cersocode.app.entity.Usuario;
import com.cersocode.app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author vicec
 */
@Controller
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    @Qualifier("usuarioservice")
    private UsuarioService usuarioService;

    @GetMapping("/list")
    public String listAllUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.listAllUsuarios());
        model.addAttribute("user", new Usuario() );
        return "list";
    }

    @PostMapping("/addusers")
    public String addUsers(@ModelAttribute(name = "user") Usuario usuario) {
        usuarioService.addUsuarios(usuario);
        return "redirect:/user/list";
        
    }

}
