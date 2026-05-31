package org.example.Demo.Mapper;

import org.example.Demo.Modal.DTO.Dictionaries.DictionaryItemDTO;
import org.example.Demo.Modal.Entity.Dictionaries.DictionaryItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DictionaryItemMapper.class})
public interface DictionaryItemMapper {
    DictionaryItemDTO toDTO(DictionaryItem dictionaryItem);

    DictionaryItem toEntity(DictionaryItemDTO dictionaryItemDTO);
}
