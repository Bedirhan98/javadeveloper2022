package kodlama.io.rentACar.webApi.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.Business.abstracts.BrandService;
import kodlama.io.rentACar.entites.concretes.Brand;

@RestController //annotation bilgilendirme.
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;
    @Autowired //Parametrelerine bak
	public BrandsController(BrandService brandService) {
		this.brandService=brandService;
	}
	@GetMapping("/getall")
	public List<Brand> getAll(){
		return brandService.getAll();
		
	}

}
