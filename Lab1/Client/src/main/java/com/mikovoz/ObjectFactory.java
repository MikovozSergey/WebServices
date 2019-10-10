
package com.mikovoz;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mikovoz package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddSeller_QNAME = new QName("http://mikovoz.com/", "addSeller");
    private final static QName _GetItemResponse_QNAME = new QName("http://mikovoz.com/", "getItemResponse");
    private final static QName _GetSeller_QNAME = new QName("http://mikovoz.com/", "getSeller");
    private final static QName _AddItem_QNAME = new QName("http://mikovoz.com/", "addItem");
    private final static QName _GetSellerResponse_QNAME = new QName("http://mikovoz.com/", "getSellerResponse");
    private final static QName _AddItemResponse_QNAME = new QName("http://mikovoz.com/", "addItemResponse");
    private final static QName _AddSellerResponse_QNAME = new QName("http://mikovoz.com/", "addSellerResponse");
    private final static QName _GetItem_QNAME = new QName("http://mikovoz.com/", "getItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mikovoz
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddItem }
     * 
     */
    public AddItem createAddItem() {
        return new AddItem();
    }

    /**
     * Create an instance of {@link GetSeller }
     * 
     */
    public GetSeller createGetSeller() {
        return new GetSeller();
    }

    /**
     * Create an instance of {@link GetItemResponse }
     * 
     */
    public GetItemResponse createGetItemResponse() {
        return new GetItemResponse();
    }

    /**
     * Create an instance of {@link AddSeller }
     * 
     */
    public AddSeller createAddSeller() {
        return new AddSeller();
    }

    /**
     * Create an instance of {@link AddItemResponse }
     * 
     */
    public AddItemResponse createAddItemResponse() {
        return new AddItemResponse();
    }

    /**
     * Create an instance of {@link AddSellerResponse }
     * 
     */
    public AddSellerResponse createAddSellerResponse() {
        return new AddSellerResponse();
    }

    /**
     * Create an instance of {@link GetItem }
     * 
     */
    public GetItem createGetItem() {
        return new GetItem();
    }

    /**
     * Create an instance of {@link GetSellerResponse }
     * 
     */
    public GetSellerResponse createGetSellerResponse() {
        return new GetSellerResponse();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link Sellers }
     * 
     */
    public Sellers createSellers() {
        return new Sellers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSeller }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mikovoz.com/", name = "addSeller")
    public JAXBElement<AddSeller> createAddSeller(AddSeller value) {
        return new JAXBElement<AddSeller>(_AddSeller_QNAME, AddSeller.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mikovoz.com/", name = "getItemResponse")
    public JAXBElement<GetItemResponse> createGetItemResponse(GetItemResponse value) {
        return new JAXBElement<GetItemResponse>(_GetItemResponse_QNAME, GetItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeller }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mikovoz.com/", name = "getSeller")
    public JAXBElement<GetSeller> createGetSeller(GetSeller value) {
        return new JAXBElement<GetSeller>(_GetSeller_QNAME, GetSeller.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mikovoz.com/", name = "addItem")
    public JAXBElement<AddItem> createAddItem(AddItem value) {
        return new JAXBElement<AddItem>(_AddItem_QNAME, AddItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mikovoz.com/", name = "getSellerResponse")
    public JAXBElement<GetSellerResponse> createGetSellerResponse(GetSellerResponse value) {
        return new JAXBElement<GetSellerResponse>(_GetSellerResponse_QNAME, GetSellerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mikovoz.com/", name = "addItemResponse")
    public JAXBElement<AddItemResponse> createAddItemResponse(AddItemResponse value) {
        return new JAXBElement<AddItemResponse>(_AddItemResponse_QNAME, AddItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSellerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mikovoz.com/", name = "addSellerResponse")
    public JAXBElement<AddSellerResponse> createAddSellerResponse(AddSellerResponse value) {
        return new JAXBElement<AddSellerResponse>(_AddSellerResponse_QNAME, AddSellerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mikovoz.com/", name = "getItem")
    public JAXBElement<GetItem> createGetItem(GetItem value) {
        return new JAXBElement<GetItem>(_GetItem_QNAME, GetItem.class, null, value);
    }

}
