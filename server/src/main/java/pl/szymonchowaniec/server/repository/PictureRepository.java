package pl.szymonchowaniec.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.szymonchowaniec.server.domain.Picture;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface PictureRepository extends JpaRepository<Picture,Long> {
}
