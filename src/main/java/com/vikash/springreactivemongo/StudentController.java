package com.vikash.springreactivemongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/user")
@RestController
public class StudentController
{
    @Autowired
    StudentService serv;

    @PostMapping
    public ResponseEntity<Mono> saved(@RequestBody Student student)
    {
        Mono s=serv.saveUser(student);
        return new  ResponseEntity<>(s,HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Flux<Student>> getAll()
    {
        Flux<Student> f=serv.getAll();
        return  ResponseEntity.ok(f);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Mono<Student>>gettById(@PathVariable int id)
    {
        return ResponseEntity.ok(serv.getById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Mono> update(@RequestBody Student student,@PathVariable int id)
    {
        return ResponseEntity.ok(serv.updateUser(student,id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Mono> delete(@PathVariable int id)
    {
        Mono<Student> s=serv.deleteUserById(id);
        return ResponseEntity.ok(s);
    }
}
