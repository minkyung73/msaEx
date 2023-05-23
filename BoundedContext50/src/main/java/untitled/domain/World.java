package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BoundedContext50Application;
import untitled.domain.World;

@Entity
@Table(name = "World_table")
@Data
public class World {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        World world = new World(this);
        world.publishAfterCommit();
    }

    public static WorldRepository repository() {
        WorldRepository worldRepository = BoundedContext50Application.applicationContext.getBean(
            WorldRepository.class
        );
        return worldRepository;
    }
}
