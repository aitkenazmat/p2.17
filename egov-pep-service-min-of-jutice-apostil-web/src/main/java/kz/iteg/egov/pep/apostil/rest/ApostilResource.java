package kz.iteg.egov.pep.apostil.rest;


import kz.inessoft.egov.pep.util.web.LocaleHolder;
import kz.iteg.egov.pep.apostil.model.DocumentType;
import kz.iteg.egov.pep.apostil.service.ApostilDictionaryService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/apostil")
public class ApostilResource {

    @Inject
    private ApostilDictionaryService apostilDictionaryService;

    @GET
    @Path("/document-types")
    public List<DocumentType> findCurrentPerson() {
        return apostilDictionaryService.getListDocumentType("kaz");
    }
}
