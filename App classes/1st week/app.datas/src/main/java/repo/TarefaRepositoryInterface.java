package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Tarefas;

public interface TarefaRepositoryInterface extends JpaRepository<Tarefas, Long> {

}
