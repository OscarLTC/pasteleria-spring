package tco.services;

import java.util.List;
import java.util.Optional;

import tco.model.Pastel;


public interface PastelService {
	public List<Pastel> findAll();

	Optional<Pastel> findById(Long id);
	
	public List<Pastel> ranking();
	
	public List<Pastel> buscar(String nombre);
	
	public List<Pastel> buscarCategoria(Long id);
}
