package pl.manczak.ksb2mongodb;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class Start {

    private ToyRepo toyRepo;

    public Start(ToyRepo toyRepo) {
        this.toyRepo = toyRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        Toy toyTeddy = new Toy("Miś uszatek", ToyType.TEDDY_BEAR);
        Toy toyDoll = new Toy("Lala", ToyType.TEDDY_BEAR);
      toyRepo.save(toyTeddy);
        toyRepo.save(toyDoll);


//        Toy toy = toyRepo.findById("6259ad8cb9450d71590cce7e").get();
//
//        toy.setToyType(ToyType.DOLL);
//        toyRepo.save(toy);


      // toyRepo.delete(toy);

       //toyRepo.deleteAllById(Collections.singleton("6259ad8cb9450d71590cce7e"));

        toyRepo.findAll().forEach(System.out::println);

    }

}
