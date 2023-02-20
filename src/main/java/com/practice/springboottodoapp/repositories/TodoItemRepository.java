package com.practice.springboottodoapp.repositories;

import com.practice.springboottodoapp.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {  
}