package com.exo2.Exercice2.mapper;

import com.exo2.Exercice2.dto.EtudiantDto;
import com.exo2.Exercice2.entity.Etudiant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = ProjetMapper.class)
public interface EtudiantMapper {
    // Single Object
    Etudiant toEntity(EtudiantDto etudiantDto);

    @Mapping(target = "projets.etudiants", ignore = true)
    EtudiantDto toDto(Etudiant etudiant);

    // List of Objects
    List<Etudiant> toEntities(Page<EtudiantDto> etudiantsDto);

    List<EtudiantDto> toDtos(Page<Etudiant> etudiants);

}
