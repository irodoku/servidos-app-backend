package back.servidos.accessingdatamysql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/back") // This means URL's start with /back (after Application path)
public class MainController {

	@Autowired
	private NegoRepository negoRepository;

	@Autowired
	private NegoService negoService;

	@Autowired
	private ProduRepository produRepository;

	@Autowired
	private ProduService produService;

	@Autowired
	private HoraRepository horaRepository;

	@Autowired
	private RestRepository restRepository;

	@Autowired
	private RestService restService;

	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {
		Horario n = new Horario();
		horaRepository.save(n);

		return "Saved";
	}

	@GetMapping(path="/negos")
	public @ResponseBody Iterable<Negocio> getNegos() {
		return negoRepository.findAll();
	}
	@GetMapping(path="/rests")
	public @ResponseBody Iterable<Restaurante> getRest() {
		return restRepository.findAll();
	}
	@GetMapping("/negos/{id}")
	public @ResponseBody Optional<Negocio> findNego(@PathVariable Integer id) {
		return negoRepository.findById(id);
	}
	@GetMapping(path="/produ")
	public @ResponseBody Iterable<Producto> getProds() {
		return produRepository.findAll();
	}
	@GetMapping("/prod/{id}")
	public @ResponseBody Optional<Producto> findProd(@PathVariable Integer id) {
		return produRepository.findById(id);
	}
	@GetMapping("/prods/{id}")
	public @ResponseBody Producto findProdNego(@PathVariable Integer id) {
		return negoRepository.findById(id).get().getProducto();
	}
	@GetMapping(path="/horas")
	public @ResponseBody Iterable<Horario> getHoras() {
		return horaRepository.findAll();
	}

}
