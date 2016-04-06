package org.meruvian.yama.webapi.service.news;

import java.util.List;

import javax.inject.Inject;

import org.meruvian.yama.tot.news.Category;
import org.meruvian.yama.tot.news.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class RestCategoryService implements CategoryService {
	@Inject
	private CategoryRepository kategoriRepository;
	
	@Override
	public Category getCategoryById(long id) {
		return kategoriRepository.findById(id);
	}

	@Override
	public List<Category> findCategoryByKategori(String kategori) {
		return kategoriRepository.findByKategori(kategori);
	}

	@Override
	@Transactional
	public Category saveCategory(Category kategori) {
		kategori.setId(0);
			
		return kategoriRepository.save(kategori);
	}

	@Override
	@Transactional
	public Category updateCategory(long id, Category kategori) {
		Category ori = getCategoryById(kategori.getId());
		if (ori != null) {
			ori.setKategori(kategori.getKategori());
		}
		
		return ori;
	}

	@Override
	@Transactional
	public void deleteCategory(long id) {
		kategoriRepository.delete(id);
	}

}
