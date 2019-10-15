package javarush.tasks.task14.task1414;

/*
MovieFactory
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        Movie movie;
        while ((str = reader.readLine()) != null) {
            if (str.equals("soapOpera")) {
                movie = MovieFactory.getMovie(str);
                System.out.println(movie.getClass().getSimpleName());
            } else if (str.equals("cartoon")) {
                movie = MovieFactory.getMovie(str);
                System.out.println(movie.getClass().getSimpleName());
            } else if (str.equals("thriller")) {
                movie = MovieFactory.getMovie(str);
                System.out.println(movie.getClass().getSimpleName());
            } else {
                MovieFactory.getMovie(str);
                break;
            }
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}

