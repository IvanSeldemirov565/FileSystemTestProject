package com.ivan.example.mapper;

import com.ivan.example.dto.FileDTO;
import com.ivan.example.dao.entity.FileEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring", uses = FileEntityDTOMapper.class)
public interface FileEntityDTOMapper {
    FileDTO toDTO(FileEntity fileEntity);

    FileEntity toEntity(FileDTO fileDTO);
}
