package com.lothebys.product.image;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ImageController {

    private final ImageService imageService;

    public Long getCount() {
        return imageService.getCount();
    }

    public void insertImage(List<String> rootList) {
        imageService.create(rootList);
    }




}
