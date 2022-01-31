package com.rs.apiv2.services;

import com.rs.apiv2.models.Language;
import com.rs.apiv2.repository.LanguageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LenguageService {
    private LanguageRepository languageRepository;


    public LenguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public List<Language> getAllLanguages(){

        return (List<Language>) languageRepository.findAll();

    }
    public ResponseEntity<String> createLanguage(Language language){
        languageRepository.save(language);

        return new ResponseEntity<>("{\"success\":true}", HttpStatus.CREATED);
    }

    public ResponseEntity<String> deleteById(Long id){
        languageRepository.deleteById(id);
        return new ResponseEntity<>("{\"success\":true}",HttpStatus.OK);
    }
    public Language getById(Long id){
        return languageRepository.findById(id).get();
    }

    public ResponseEntity<String> update(Language language, Long id) {
        languageRepository.findById(id)
                .map(
                        lang->{
                            lang.setName(language.getName());
                            lang.setLaunch(language.getLaunch());
                            lang.setStrong_typing(language.isStrong_typing());
                            return languageRepository.save(lang);

                        }
                ).get();
        return new ResponseEntity<>("{\"success\":true}",HttpStatus.OK);
    }
}
