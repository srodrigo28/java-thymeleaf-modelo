package com.sebapp.appmain.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sebapp.appmain.dto.ClienteDTO;

import jakarta.validation.Valid;

@Controller
public class CadastroController {
    
    @GetMapping("/cadastro")
	public String cadastro() {
		return "cadastro/index";
	}

	@GetMapping("/categoria")
	public String categoria() {
		return "categoria/index";
	}

	@ResponseBody
	@PostMapping("/cadastro")
	public String cadastrar(@RequestBody @Valid ClienteDTO clienteDTO){
		System.out.println("Nome: " + clienteDTO.getNome() );
		System.out.println("E-mail: " + clienteDTO.getEmail() );
		return "redirect:/";
	}

}
