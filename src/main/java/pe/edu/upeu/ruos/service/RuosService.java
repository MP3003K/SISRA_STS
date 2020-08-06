package pe.edu.upeu.ruos.service;

import java.util.List;

import pe.edu.upeu.ruos.entity.Usuario;

public interface RuosService {
	List<Usuario>readAll();
	int create (Usuario cli);
	int edit (Usuario cli);
	int delete(int id);
	Usuario read(int id);
}
