package com.company;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

	News test = new News(1,"clickbait","absurd text",  LocalDateTime.now());

	SQL.rewrite(2,"neeeew title", "neeew text");
	SQL.getNews(2);
    }


}
