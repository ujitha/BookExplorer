import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.codehaus.jackson.map.ObjectMapper;
import pojo.BookDetail;
import pojo.BookSearch;

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


    public BookSearch searchBooks(String name){
        BookSearch bookSearch = null;
        try{
            String bookUrl = resourceUrl+"/search/"+name;
            WebResource webResource = bookClient.resource(bookUrl);

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

             String output = response.getEntity(String.class);
            ObjectMapper objectMapper = new ObjectMapper();
            bookSearch = objectMapper.readValue(output,BookSearch.class);
        }catch (Exception e){
            e.printStackTrace();
        }

        return bookSearch;

    }

    public BookDetail getBookDetails(String id) {
        BookDetail book =  null;
        try{
            String bookUrl = resourceUrl+"/book/"+id;
            WebResource webResource = bookClient.resource(bookUrl);

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);
            ObjectMapper objectMapper = new ObjectMapper();
            book = objectMapper.readValue(output, BookDetail.class);

        }catch (Exception e){
            e.printStackTrace();
        }
        return book;
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

    public void downloadGivenBook(String id) {
        downloadBook(getBookDetails(id).getDownloadUrl());
    }
}
