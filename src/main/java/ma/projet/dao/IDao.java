package ma.projet.dao;

import java.util.List;

public interface IDao<T> {
	public void create(T o);

	public void update(T o);

	public boolean delete(T o);

	public List<T> findAll();

	public T findById(Long id);
}
