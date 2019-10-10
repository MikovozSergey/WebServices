import com.mikovoz.Items;
import com.mikovoz.Sellers;
import com.mikovoz.ShopService;
import com.mikovoz.ShopServiceService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    @WebServiceRef(wsdlLocation = "http://localhost:7001/java-1.0-SNAPSHOT/ShopServiceService?WSDL")
    private static ShopServiceService shopService;

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:7001/java-1.0-SNAPSHOT/ShopServiceService?WSDL");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://mikovoz.com/","ShopServiceService");

        Service service = Service.create(url, qname);

        ShopService shopService = service.getPort(ShopService.class);

        Sellers sellers = new Sellers();
        sellers.setName("me");
        shopService.addSeller(sellers);

        Items items = new Items();
        items.setName("car");
        items.setSellersId(1L);
        shopService.addItem(items);
    }
}
