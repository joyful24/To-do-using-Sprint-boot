package co.adityas.spring.todo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import co.adityas.spring.todo.domain.Todo;
@Repository
public interface TodoRepository extends PagingAndSortingRepository<Todo,
Long>{


}
