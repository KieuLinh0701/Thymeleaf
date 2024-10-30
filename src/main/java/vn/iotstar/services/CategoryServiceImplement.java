package vn.iotstar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vn.iotstar.entity.Category;
import vn.iotstar.repository.CategoryRepository;

@Service
public class CategoryServiceImplement implements CategoryService{
	@Autowired
	CategoryRepository categoryRepsitory;

	public CategoryServiceImplement(CategoryRepository categoryRepsitory) {
		this.categoryRepsitory = categoryRepsitory;
	}

	@Override
	public Optional<Category> findByName(String name) {
		return categoryRepsitory.findByName(name);
	}

	@Override
	public Page<Category> findByNameContaining(String name, Pageable pageable) {
		return categoryRepsitory.findByNameContaining(name, pageable);
	}

	@Override
	public <S extends Category> S save(S entity) {
		return categoryRepsitory.save(entity);
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return categoryRepsitory.findAll(sort);
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryRepsitory.findAll(pageable);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepsitory.findAll();
	}

	@Override
	public Optional<Category> findById(Long id) {
		return categoryRepsitory.findById(id);
	}

	@Override
	public long count() {
		return categoryRepsitory.count();
	}

	@Override
	public void deleteById(Long id) {
		categoryRepsitory.deleteById(id);
	}	
}
