package com.sebapp.appmain.webController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sebapp.appmain.dto.CategoriaDTO;
import com.sebapp.appmain.dto.ClienteDTO;

@Controller
public class CadastroController {
    
    @GetMapping("/cadastro")
	public String index() {
		return "cadastro/index";
	}

	@PostMapping("/cadastro")
	public String cadastrar(@RequestBody ClienteDTO clienteDTO){
		System.out.println("Nome: " + clienteDTO.getNome());
		System.out.println("E-mail: " + clienteDTO.getEmail());
		return "redirect:/";
	}

	@PostMapping("/categoria")
	public String categoria(@RequestBody CategoriaDTO categoriaDTO ){
		System.out.println("" + categoriaDTO.getCategoria());
		System.out.println("" + categoriaDTO.getDescricao());

		return "redirect:/";
	}
}
