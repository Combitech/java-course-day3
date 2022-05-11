package com.combitech.javacourseday3.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImageService {

    @Value("${imageservice.url}")
    private String imageServiceUrl;

    private RestTemplate restTemplate;

    public ImageService() {
        this.restTemplate = new RestTemplateBuilder().build();
    }

    public byte[] getImage(long id){
        byte [] image = restTemplate.getForObject(imageServiceUrl+id, byte[].class);
        return image;
    }

    public void deleteImage(long id){
        restTemplate.delete(imageServiceUrl+id);
    }

    public void updateImage(long id, byte[] image){
        restTemplate.put(imageServiceUrl+id, image);
    }
}
