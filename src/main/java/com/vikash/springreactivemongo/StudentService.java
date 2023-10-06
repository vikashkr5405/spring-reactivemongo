package com.vikash.springreactivemongo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService
{
    public Mono saveUser(Student student);
    public Flux<Student> getAll();
    public Mono updateUser(Student student,int id);
    public Mono<Student> getById(int id);
    public Mono deleteUserById(int id);

}
