package pl.manczak.ksb2mongodb;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

private ToyRepo toyRepo;

    public Start(ToyRepo toyRepo) {
        this.toyRepo = toyRepo;
    }

    @EventListener (ApplicationReadyEvent.class)
    public void init(){
        Toy toyTeddy=new Toy("Miś uszatek", ToyType.TEDDY_BEAR);
        Toy toyDoll=new Toy("Lala", ToyType.TEDDY_BEAR);
        toyRepo.save(toyTeddy);
        toyRepo.save(toyDoll);

    }

}
