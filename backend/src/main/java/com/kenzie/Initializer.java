//package com.kenzie;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.kenzie.model.Product;
//import com.kenzie.repo.ProductRepository;
//
//import java.time.Instant;
//import java.util.Collections;
//import java.util.stream.Stream;
//
//@Component
//class Initializer implements CommandLineRunner {
//
//    private final ProductRepository repository;
//
//    public Initializer(ProductRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... strings) {
//        Stream.of("wool sweater").forEach(name ->
//                repository.save(new Product(null, name, null, name, null, name, null))
//        );
//
//        Product prd = repository.findByName("leather purse");
////        Event e = Event.builder().title("Micro Frontends for Java Developers")
////                .description("JHipster now has microfrontend support!")
////                .date(Instant.parse("2022-09-13T17:00:00.000Z"))
////                .build();
////        djug.setEvents(Collections.singleton(e));
//        repository.save(prd);
//
//        repository.findAll().forEach(System.out::println);
//    }
//}