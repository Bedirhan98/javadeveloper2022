package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entites.concretes.Brand;

@Repository //bu sınıf bir dataAccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository{
	List<Brand> brands;
	
	// InMemoryBrandRepository çağırdığımızda liste oluşturmak için constractor kullandık
	public InMemoryBrandRepository() {
		brands= new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(3,"Audi"));
		brands.add(new Brand(4,"Fiat"));
		brands.add(new Brand(5,"Renault"));
	}


	@Override
	//içinde brandler olan listeler oluşturmak.
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

}
