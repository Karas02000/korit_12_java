package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
@AllArgsConstructor
@Data
class Books {
    private Long bookId;
    private String title;
    private String author;
    private List<String> categories;
}
public class JSON4Task {
    public static void main(String[] args) {
        Books book1 = new Books(101l, "자바 마스터", "안선생", List.of("프로그래밍, 컴퓨터공학"));
        Books book2 = new Books(102l, "파이썬 입문", "김철수", List.of("데이터 분석"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonbook1 = gson.toJson(book1);
        System.out.println(jsonbook1);

        Map<String, String> bookMap = gson.fromJson(jsonbook1, Map.class);
        System.out.println(bookMap.get("title"));

        List<Books> bookList = new LinkedList<Books>();
        bookList.add(book1);
        bookList.add(book2);

        String jsonbook2 = gson.toJson(bookList);
        System.out.println(jsonbook2);
    }
}
