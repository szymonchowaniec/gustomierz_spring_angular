package pl.szymonchowaniec.server.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.szymonchowaniec.server.domain.Picture;
import pl.szymonchowaniec.server.repository.PictureRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class PictureController {

    private PictureRepository pictureRepository;

    public PictureController(PictureRepository pictureRepository){
        this.pictureRepository = pictureRepository;
    }

    @GetMapping("/picture")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Picture> picture(){
        return pictureRepository
                .findAll()
                .stream()
                .collect(Collectors.toList());

    }
}
