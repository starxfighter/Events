package com.starxfighter.events.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.starxfighter.events.models.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

	List<Comment> findAllByEvent_id(Long id);
}
