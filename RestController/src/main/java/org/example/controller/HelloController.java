package org.example.controller;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "get mapping invoke ";
    }

    @PostMapping
    public String sayHelloPost() {
        return "Post mapping invoke ";
    }

    @DeleteMapping
    public String sayHelloDELETE() {
        return "DELETE mapping invoke ";
    }
    @PutMapping
    public String sayHelloPut() {
        return "Put mapping invoke ";
    }

    @PatchMapping
    public String sayHelloPatch() {
        return "Patch mapping invoke ";
    }

}
