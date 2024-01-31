package com.ivan.example.dto;

import com.ivan.example.dao.entity.FileEntity;
import com.ivan.example.dto.model.AbstractDTO;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FileDTO extends AbstractDTO {
    private FileEntity.FileType type;
    private String name;
    private byte[] content;

}
