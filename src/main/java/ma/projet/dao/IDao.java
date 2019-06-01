package ma.projet.dao;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {
	public T create(T o);

	public void update(T o);

	public boolean delete(T o);

	public List<T> findAll();

	public T findById(Long id);
}
