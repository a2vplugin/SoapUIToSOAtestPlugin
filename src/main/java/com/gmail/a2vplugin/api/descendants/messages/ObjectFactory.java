
package com.gmail.a2vplugin.api.descendants.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _DescendantsQueryResponse_QNAME = new QName(
            "http://www.parasoft.com/api/descendants/messages", "descendantsQueryResponse");

    public ObjectFactory() {
    }

    public Child createChild() {
        return new Child();
    }

    public DescendantsQueryResponse createDescendantsQueryResponse() {
        return new DescendantsQueryResponse();
    }

    public Child.Children createChildChildren() {
        return new Child.Children();
    }

    public DescendantsQueryResponse.Children createDescendantsQueryResponseChildren() {
        return new DescendantsQueryResponse.Children();
    }

    @XmlElementDecl(namespace = "http://www.parasoft.com/api/descendants/messages", name = "descendantsQueryResponse")
    public JAXBElement<DescendantsQueryResponse> createDescendantsQueryResponse(DescendantsQueryResponse value) {
        return new JAXBElement<DescendantsQueryResponse>(_DescendantsQueryResponse_QNAME,
                DescendantsQueryResponse.class, null, value);
    }

}
