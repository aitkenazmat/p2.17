package kz.iteg.egov.pep.apostil;

import kz.inessoft.egov.pep.service.shep.channel.sync.SyncShepService;
import kz.inessoft.egov.pep.service.shep2.channel.common.SendMessageRequest;
import kz.inessoft.egov.pep.service.shep2.channel.common.ShepOptions;
import kz.inessoft.egov.pep.service.shep2.channel.sync.SyncShep2Service;
import kz.inessoft.egov.pep.util.Options;
import kz.iteg.egov.pep.apostil.model.DocumentType;
import kz.iteg.egov.pep.apostil.service.ApostilDictionaryService;
import kz.iteg.egov.pep.apostil.util.ApostilDictinaryConfigurationService;
import services.apostil.kz.GetDictionaryRecords;
import services.apostil.kz.GetDictionaryRecordsResponse;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;


@ApplicationScoped
public class ApostilDictionaryServiceImpl implements ApostilDictionaryService {

    @Inject
    private SyncShepService syncShepService;

    @Inject
    private SyncShep2Service syncShep2Service;

    @Inject
    private ApostilDictinaryConfigurationService apostilDictinaryConfigurationService;


    @Override
    public List<DocumentType> getListDocumentType(String searchWord) {


        SendMessageRequest sendMessageRequest = apostilDictinaryConfigurationService.createGetPersonByIinRequest();
        Options shepOptions = new ShepOptions.Builder().wrapByTagData().build();
        GetDictionaryRecordsResponse response = syncShep2Service.sendMessage(sendMessageRequest,GetDictionaryRecordsResponse.class,shepOptions);

//
//        GetDictionaryRecords request = new GetDictionaryRecords();
//        request.setReferenceName("document_types");
//        request.setRequest("Реш");
//        request.setLanguage("ru");
//        SendMessageRequest sendMessageRequest = new SendMessageRequest();
//        sendMessageRequest.setData(request);
//        sendMessageRequest.setTargetService("ApostilPEPServiceSync");
//        Options shepOptions = new ShepOptions.Builder().wrapByTagData().build();
//        GetDictionaryRecordsResponse response = syncShep2Service.sendMessage(sendMessageRequest, GetDictionaryRecordsResponse.class, shepOptions);

        System.out.println("size = " + response.getRecord().size());
        return null;


    }
}
