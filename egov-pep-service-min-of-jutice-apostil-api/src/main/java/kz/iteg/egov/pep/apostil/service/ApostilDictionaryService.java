package kz.iteg.egov.pep.apostil.service;

import kz.iteg.egov.pep.apostil.model.DocumentType;

import java.util.List;

public interface ApostilDictionaryService {
    List<DocumentType> getListDocumentType(String searchWord);
}
