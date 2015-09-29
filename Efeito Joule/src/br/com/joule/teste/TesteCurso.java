package br.com.joule.teste;

import javax.persistence.EntityManager;
import br.com.joule.entity.Curso;
import br.com.joule.exceptions.DBCommitException;
import br.com.joule.dao.CursoDAO;
import br.com.joule.daoimpl.CursoDAOImpl;
import br.com.joule.singleton.EMFactorySingleton;

public class TesteCurso {

	public static void main(String[] args) {
		
		EntityManager em = EMFactorySingleton.getInstance().createEntityManager();
		
		Curso curso = new Curso();
		CursoDAO dao = new CursoDAOImpl(em);
		curso.setNome("Mecanica");
		curso.setDescricao("curso de mec�nica");
		
	
			try {
				dao.create(curso);
			} catch (DBCommitException e) {
				
				e.printStackTrace();
			}
		
		Curso curso2 = dao.findById(curso.getId());
		if (curso2 == null) {
			System.out.println("Curso n�o encontrado");
		}else {
			System.out.println("C�digo do curso: "+curso2.getId());
			System.out.println("Nome do curso: "+curso2.getNome());
			System.out.println("Descri��o do curso: "+curso2.getDescricao());
		}

	}
}