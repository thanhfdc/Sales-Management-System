package org.example.Demo.Mapper;

import org.example.Demo.Modal.DTO.Dictionaries.DictionaryDTO;
import org.example.Demo.Modal.Entity.Dictionaries.Dictionary;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DictionaryMapper {
    DictionaryDTO toDTO(Dictionary dictionary);

    Dictionary toEntity(DictionaryDTO dictionaryDTO);
}
