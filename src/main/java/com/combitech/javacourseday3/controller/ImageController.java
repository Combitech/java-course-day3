package com.combitech.javacourseday3.controller;

import com.combitech.javacourseday3.service.ImageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users/images")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/{id}")
    public byte[] getImageForUser(@PathVariable("id") long id){
        return imageService.getImage(id);
    }

    @DeleteMapping("/{id}")
    public void deleteImageForUser(@PathVariable("id") long id){
        imageService.deleteImage(id);
    }

    @PutMapping("/{id}")
    public void updateImageForUser(@PathVariable("id") long id, @RequestBody byte[] image){
        imageService.updateImage(id, image);
    }

}
