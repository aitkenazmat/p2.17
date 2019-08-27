package kz.iteg.egov.pep.apostil.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "references", propOrder = {
        "name_ru",
        "name_kz"
})
public class DocumentType {

    private String name_ru;
    private String name_kz;

    public String getName_ru() {
        return name_ru;
    }

    public void setName_ru(String name_ru) {
        this.name_ru = name_ru;
    }

    public String getName_kz() {
        return name_kz;
    }

    public void setName_kz(String name_kz) {
        this.name_kz = name_kz;
    }
}
