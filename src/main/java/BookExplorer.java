import pojo.BookDetail;
import pojo.BookSearch;

import java.util.Scanner;

/**
 * Created by Ujitha on 10/24/2015.
 */
public class BookExplorer {

    public static void main(String[] args) {
        RestClient restClient = new RestClient();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for preference");
        System.out.println("1. Search ");
        System.out.println("2. BookDetail Detail");
        System.out.println("3. Download BookDetail");
        System.out.println("4. Download the Book with ID");

        int num = sc.nextInt();

        if(num==1) {
            System.out.println("Search for books : ");
            String searchName =  sc.next();

            if(searchName != null) {
                BookSearch searchResults = restClient.searchBooks(searchName);

            }
        } else if (num==2){
            System.out.println("Enter the BookDetail ID : ");
            String id = sc.next();

            if(id!= null) {
                BookDetail searchResults = restClient.getBookDetails(id);
                System.out.println(searchResults);
            }
        } else if(num==3) {
            System.out.println("Enter the download link");
            String link = sc.next();

            if(link!=null) {
                restClient.downloadBook(link);
            }
        } else if(num == 4) {
            System.out.println("Enter the Book ID to download");
            String id = sc.next();
            if(id!=null){
                restClient.downloadGivenBook(id);
            }
        } else {
            sc.close();
            System.exit(1);
        }
    }
}
