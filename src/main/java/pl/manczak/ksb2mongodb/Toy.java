package pl.manczak.ksb2mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Toy {

    @Id
    private String id;
    private String name;
    private ToyType toyType;

    public Toy( String name, ToyType toyType) {

        this.name = name;
        this.toyType = toyType;
    }

    public Toy() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToyType getToyType() {
        return toyType;
    }

    public void setToyType(ToyType toyType) {
        this.toyType = toyType;
    }
}
