package com.ivan.example.dao.service;

import com.ivan.example.dto.FileDTO;
import com.ivan.example.mapper.FileEntityDTOMapper;
import org.springframework.stereotype.Service;

@Service
public class FilesDAOService {

    private FileEntityDTOMapper fileEntityDTOMapper;
    public FileDTO upload(FileDTO fileDTO){
        //мапим поля с дто на энтити для отправки в базу
        fileEntityDTOMapper.toEntity(fileDTO);
        return fileDTO;
    }
}
