#### Projeto Java ThymeLife

* icones
```
https://icons.getbootstrap.com/
```

#### CDNs usadas
* 1. Estilos classes Bootstrap
```
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
```

* 2. Scripts Bootstrap
```
<script defer src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
```

* 3. Estilos Icones Bootstrap
```
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
```

#### Criando html dentro do diretorio template
* pasta criada cadastro
* exemplo template/cadastro/index
```
<body class="container">
    <div class="class__header">
        <h1>Java Frontend</h1>
        <h2>ThymeLife</h2>
    </div>
    <form method="post">
        <input type="text" name="nome"  placeholder="Nome completo" >
        <input type="text" name="email" placeholder="E-mail" >
        <button class="btn btn-primary">Cadastrar</button>
    </form>
</body>
```

#### Criando web Controller para pasta Cadastro
* Metodo de carregar o html do diretório

* 2. Metodo para pegar os dados do formulário
```
@Controller
public class CadastroController {
    
    @GetMapping("/cadastro")
	public String index() {
		return "cadastro/index";
	}

	@PostMapping("/")
	public String cadastrar(ClienteDTO clienteDTO){
		System.out.println("Nome: " + clienteDTO.getNome());
		System.out.println("E-mail: " + clienteDTO.getEmail());
		return "redirect:/";
	}
}
```

* 3. Criar um DTO

#### Configurando ThymeLife Fragments
