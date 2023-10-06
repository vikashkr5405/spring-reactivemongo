package com.vikash.springreactivemongo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student,Integer>
{

    public Mono<Student> findById(int id);
}
