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
        System.out.println("2. Book Detail");
        System.out.println("3. Download Book");

        int num = sc.nextInt();

        if(num==1) {
            System.out.println("Search for books : ");
            String searchName =  sc.next();

            if(searchName != null) {
                String searchResults = restClient.searchBooks(searchName);
                System.out.println(searchResults);
            }
        } else if (num==2){
            System.out.println("Enter the Book ID : ");
            String id = sc.next();

            if(id!= null) {
                String searchResults = restClient.getBookDetails(id);
                System.out.println(searchResults);
            }
        } else if(num==3) {
            System.out.println("Enter the download link");
            String link = sc.next();

            if(link!=null) {
                restClient.downloadBook(link);
            }
        } else {
            sc.close();
            System.exit(1);
        }
    }
}
