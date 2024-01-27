package com.jpmware.formsubmission;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
    
    @GetMapping("/health-check")
    public String healthCheck() {
        return "Hello";
    }

    @PostMapping("/artist")
    public Artist acceptArtist(@ModelAttribute Artist artist) {
        return artist;
    }

    @PostMapping("/artist-list")
    public FormData acceptFormData(@ModelAttribute FormData formData) {
        return formData;
    }
}
