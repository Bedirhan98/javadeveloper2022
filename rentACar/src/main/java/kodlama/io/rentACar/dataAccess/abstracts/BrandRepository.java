package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentACar.entites.concretes.Brand;
//Repository yerine Dao da yazılır.

public interface BrandRepository {
	List<Brand> getAll();

}
