package msaex.domain;

import msaex.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "worlds", path = "worlds")
public interface WorldRepository
    extends PagingAndSortingRepository<World, Long> {}
