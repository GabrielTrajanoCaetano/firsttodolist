package br.com.gabrieltrajanocaetano.todolist_client.todoClientRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrieltrajanocaetano.todolist_client.entity.TodoClient;

public interface TodoClientRepository extends JpaRepository<TodoClient, Long>{

}
