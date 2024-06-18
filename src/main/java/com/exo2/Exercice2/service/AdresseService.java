package com.exo2.Exercice2.service;

import com.exo2.Exercice2.dto.AdresseDto;
import com.exo2.Exercice2.mapper.AdresseMapper;
import com.exo2.Exercice2.repository.AdresseRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdresseService {
    private AdresseRepository adresseRepository;
    private AdresseMapper adresseMapper;

    public List<AdresseDto> findAll(Pageable pageable) {
        return adresseMapper.toDtos(adresseRepository.findAll(pageable).getContent());
    }

    public AdresseDto findById(Long id) {
        return adresseMapper.toDto(adresseRepository.findById(id).get());
    }

    public List<AdresseDto> findByVille(String ville, Pageable pageable) {
        return adresseMapper.toDtos(adresseRepository.findAdresseByVille(ville, pageable));
    }
}
