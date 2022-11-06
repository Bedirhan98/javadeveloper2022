package kodlama.io.rentACar.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.Business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entites.concretes.Brand;

@Service //bu sınıf bir business nesnesidir
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
    @Autowired
	public BrandManager(BrandRepository brandRepository) {
    	this.brandRepository=brandRepository;
		
	}


	@Override
	public List<Brand> getAll() {
		// iş kuralları
		return brandRepository.getAll();
	}

}
