package kz.iteg.egov.pep.apostil.util;





import kz.inessoft.egov.pep.service.shep2.channel.common.SendMessageRequest;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ApostilDictinaryConfigurationService {
    public SendMessageRequest createGetPersonByIinRequest() {
        return ApostilDictionaryUtils.getDocumentTypes();
    }

}
