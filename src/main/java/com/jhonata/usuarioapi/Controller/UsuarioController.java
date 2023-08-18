package com.jhonata.usuarioapi.Controller;

import com.jhonata.usuarioapi.Service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Usuario")
public class UsuarioController {
private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping("/Usuario")
    @ApiOperation("Get a greeting")
    public String Usuario()
    {
        return usuarioService.getGreeting();
    }
}
