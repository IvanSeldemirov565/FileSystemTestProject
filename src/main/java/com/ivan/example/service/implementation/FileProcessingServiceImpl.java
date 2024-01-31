package com.ivan.example.service.implementation;

import com.ivan.example.dao.service.FilesDAOService;
import com.ivan.example.dto.FileDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.ivan.example.service.FileProcessingService;

@Service
@RequiredArgsConstructor
public class FileProcessingServiceImpl implements FileProcessingService {

    private final FilesDAOService filesDAOService;

    public FileDTO upload(FileDTO fileDTO) {
        System.out.println("File {} was uploaded to system");
        return fileDTO;
    }
}
