package com.vikash.springreactivemongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class StudentServiceImpl implements StudentService
{
    @Autowired
    StudentRepository srepo;

    @Override
    public Mono saveUser(Student student) {
      return  srepo.save(student);
    }

    @Override
    public Flux<Student> getAll() {
        return srepo.findAll().switchIfEmpty(Flux.empty());
    }

    @Override
    public Mono updateUser(Student student, int id)
    {

      return srepo.save(student);

    }

    @Override
    public Mono<Student> getById(int id) {
        return srepo.findById(id);
    }

    @Override
    public Mono deleteUserById(int id) {
        return srepo.deleteById(id);
    }
}
