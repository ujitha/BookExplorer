import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.awt.*;
import java.net.URI;

/**
 * Created by Ujitha on 10/24/2015.
 */
public class RestClient {

    private  Client bookClient;
    private String resourceUrl;


    public RestClient(){
        bookClient = Client.create();
        resourceUrl = "http://it-ebooks-api.info/v1";
    }


    public String searchBooks(String name){
        String output = null;
        try{
            String bookUrl = resourceUrl+"/search/"+name;
            WebResource webResource = bookClient.resource(bookUrl);

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

             output = response.getEntity(String.class);
        }catch (Exception e){

        }

        return output;

    }

    public String getBookDetails(String id) {
        String output = null;
        try{
            String bookUrl = resourceUrl+"/book/"+id;
            WebResource webResource = bookClient.resource(bookUrl);

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

             output = response.getEntity(String.class);

        }catch (Exception e){

        }

        return output;
    }

    public void downloadBook(String downloadLink){

        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(downloadLink));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
