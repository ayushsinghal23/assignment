package main;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==0){
            System.out.println("N/A");
        }
        else{
            scanner.nextLine().trim();
            Books[] books= new Books[n];
            for(int i=0;i<n;i++) {
                String BookName = scanner.nextLine().trim();
                String AuthorName = scanner.nextLine().trim();
                String ISBN = scanner.nextLine().trim();
                books[i] = new Books(BookName, AuthorName, ISBN);
            }
            for(int j=0;j<books.length;j++) {
                System.out.println(books[j]);
            }

            }
        }
    }

class Books{
    String BookName;
    String AuthorName;
    String ISBN;
    public Books(String BookName,String AuthorName,String ISBN)
    {
        this.AuthorName=AuthorName;
        this.BookName=BookName;
        this.ISBN=ISBN;
    }
 public String getBookName(){
        return BookName;

 }
 public String getAuthorName(){
        return AuthorName;

 }
 public String getISBN(){
        return ISBN;
    }
@Override
    public String toString(){
        return "-----------------------------\n"+"book name:"+getBookName()+"\n"+"author name:"+getAuthorName()+"\n"+"isbn:"+
               getISBN()+"\n"+"-----------------------------\n";
}
}