package kz.iteg.egov.pep.apostil.util;



import kz.inessoft.egov.pep.service.shep2.channel.common.SendMessageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.apostil.kz.GetDictionaryRecords;
import services.apostil.kz.ObjectFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.UUID;


@ApplicationScoped
public class ApostilDictionaryUtils {

    private static final String GET_PERSON_BY_IIN = "ApostilPEPServiceSync";
    private static final String PORTAL_ID = "PORTAL";
    private static final Logger LOG = LoggerFactory.getLogger(ApostilDictionaryUtils.class);
    private static final QName REQUEST_QNAME = new QName("", "GetDictionaryRecords");



    public static SendMessageRequest getDocumentTypes() {

        ObjectFactory objectFactory = new ObjectFactory();
        GetDictionaryRecords dictionaryRecords = objectFactory.createGetDictionaryRecords();
        dictionaryRecords.setReferenceName("document_types");
        dictionaryRecords.setRequest("Реш");
        dictionaryRecords.setLanguage("ru");
        SendMessageRequest sendMessageRequest = new SendMessageRequest();
        sendMessageRequest.setTargetService("ApostilPEPServiceSync");
        JAXBElement jaxbElement  = new JAXBElement(REQUEST_QNAME, GetDictionaryRecords.class, dictionaryRecords);

        //jaxbElement.
        sendMessageRequest.setData(jaxbElement);
        //sendMessageRequest.setData(dictionaryRecords);
        return sendMessageRequest;
    }
}
