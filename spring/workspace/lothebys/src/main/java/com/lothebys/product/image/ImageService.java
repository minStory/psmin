package com.lothebys.product.image;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ImageService {

    private final ImageRepository imageRepository;

    public Long getCount() {
        return imageRepository.count();
    }

    // 이미지 업로드 메서드
    public void create(List<String> rootList) {
        Image image = new Image();
        image.setFImage(rootList.get(0));
        image.setSImage(rootList.get(1));
        image.setTImage(rootList.get(2));

        this.imageRepository.save(image);
    }
}
