package me.aws.exam.persistence;

import me.aws.exam.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
    @Query("select * from Todo t where t.userId = ?1")
    List<TodoEntity> findByUserId(String userId);
}