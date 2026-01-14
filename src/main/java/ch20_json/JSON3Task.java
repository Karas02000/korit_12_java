package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
class Book{
    private Long bookId;
    private String title;
    private String author;
    private List<String> categories;

    public void addCategories(String str) {
        categories.add(str);
    }
}
public class JSON3Task {
    public static void main(String[] args) {
        Book book1 = new Book(101L, "자바 마스터", "안선생", new ArrayList<>());
        Book book2 = new Book(102L, "파이썬 입문", "김철수", new ArrayList<>());

        book1.addCategories("프로그래밍");
        book1.addCategories("컴퓨터공학");
        book2.addCategories("데이터분석");


        // Mission 2
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonBook1 = gson.toJson(book1);
        System.out.println(jsonBook1);

        // Mission 3
        Map<String,Object> mapBook1 = gson.fromJson(jsonBook1, Map.class);
        System.out.println("도서 제목 : " + mapBook1.get("title"));

        // Mission 4
        List<Book> bookList1 = new ArrayList<>();
        bookList1.add(book1);
        bookList1.add(book2);

        String jsonBookList1 = gson.toJson(bookList1);
        System.out.println(jsonBookList1);
    }
}
