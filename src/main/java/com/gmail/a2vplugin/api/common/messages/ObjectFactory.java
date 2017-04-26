
package com.gmail.a2vplugin.api.common.messages;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public HttpHeadersTable createHttpHeadersTable() {
        return new HttpHeadersTable();
    }

    public ReferencedEnvironment createReferencedEnvironment() {
        return new ReferencedEnvironment();
    }

    public Relationships createRelationships() {
        return new Relationships();
    }

    public Literal createLiteral() {
        return new Literal();
    }

    public Parent createParent() {
        return new Parent();
    }

    public FileLocation createFileLocation() {
        return new FileLocation();
    }

    public Entity createEntity() {
        return new Entity();
    }

    public TypeData createTypeData() {
        return new TypeData();
    }

    public EnvironmentsTypeData createEnvironmentsTypeData() {
        return new EnvironmentsTypeData();
    }

    public Environment createEnvironment() {
        return new Environment();
    }

    public Child createChild() {
        return new Child();
    }

    public FileOrUrlLocation createFileOrUrlLocation() {
        return new FileOrUrlLocation();
    }

    public LiteralMime createLiteralMime() {
        return new LiteralMime();
    }

    public TextMime createTextMime() {
        return new TextMime();
    }

    public HttpHeaders createHttpHeaders() {
        return new HttpHeaders();
    }

    public NameComplexValue createNameComplexValue() {
        return new NameComplexValue();
    }

    public ComplexValueFPS createComplexValueFPS() {
        return new ComplexValueFPS();
    }

    public Parameterized createParameterized() {
        return new Parameterized();
    }

    public HttpAuthentication createHttpAuthentication() {
        return new HttpAuthentication();
    }

    public PerformAuthentication createPerformAuthentication() {
        return new PerformAuthentication();
    }

    public AuthenticationSettings createAuthenticationSettings() {
        return new AuthenticationSettings();
    }

    public AuthenticationType createAuthenticationType() {
        return new AuthenticationType();
    }

    public Basic createBasic() {
        return new Basic();
    }

    public ComplexValueFP createComplexValueFP() {
        return new ComplexValueFP();
    }

    public FixedElement createFixedElement() {
        return new FixedElement();
    }

    public From createFrom() {
        return new From();
    }

    public To createTo() {
        return new To();
    }

    public LiteralXml createLiteralXml() {
        return new LiteralXml();
    }

    public BooleanStringPair createBooleanStringPair() {
        return new BooleanStringPair();
    }

    public NameValue createNameValue() {
        return new NameValue();
    }

    public HttpHeadersTable.Rows createHttpHeadersTableRows() {
        return new HttpHeadersTable.Rows();
    }

    public ReferencedEnvironment.Environments createReferencedEnvironmentEnvironments() {
        return new ReferencedEnvironment.Environments();
    }

    public Relationships.ChildrenRel createRelationshipsChildrenRel() {
        return new Relationships.ChildrenRel();
    }

}
