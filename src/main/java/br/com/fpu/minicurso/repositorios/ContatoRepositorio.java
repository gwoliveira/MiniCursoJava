package br.com.fpu.minicurso.repositorios;

import org.springframework.data.repository.CrudRepository;

import br.com.fpu.minicurso.entidades.Contato;

public interface ContatoRepositorio extends CrudRepository<Contato, Long>{

}
