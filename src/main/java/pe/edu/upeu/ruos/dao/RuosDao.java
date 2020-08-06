package pe.edu.upeu.ruos.dao;

import java.util.List;

import pe.edu.upeu.ruos.entity.Usuario;

public interface RuosDao {
	List<Usuario>readAll();
	int create (Usuario cli);
	int edit (Usuario cli);
	int delete(int id);
	Usuario read(int id);
}
