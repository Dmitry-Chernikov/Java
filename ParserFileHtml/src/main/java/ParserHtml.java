import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import  java.util.logging.*;

public class ParserHtml {
    private static final Logger LOGGER = Logger.getLogger(ParserHtml.class.getName());

    public static void main(String[] args) throws IOException {
        LOGGER.log(Level.FINE, "Start argument {0}", Arrays.toString(args));
        Document doc = new Document("ParsCollectText");
        try {
             doc = Jsoup.connect("https://www.simbirsoft.com/")
                     .timeout(1000)
                     .userAgent("Chrome/4.0.249.0 Safari/532.5")
                     .referrer("http://www.google.com")
                     .get();
        }catch (Error e){
            LOGGER.log(Level.SEVERE, "Exception caught", e);
            System.exit(2);
        }

        //System.out.println(doc);
        Elements allCodeHtml = doc.select("*");
        List<String> listAllText = new ArrayList<>();
        Map<String, Integer> resultWordAndCount = new HashMap<>();
        //allCodeHtml.forEach(element -> System.out.println(element.text()));
        allCodeHtml.forEach(element -> listAllText.add(element.text()));
        //listAllText.forEach(System.out::println);
        listAllText.stream().distinct().filter(s -> !s.isEmpty()).collect(Collectors.toList()).forEach(str -> Stream.of(str.split("[^A-Za-zА-Яа-я]+")).collect(Collectors.toList()).forEach(e -> resultWordAndCount.put(e,resultWordAndCount.getOrDefault(e,0)+1)));
        resultWordAndCount.forEach((s, integer) -> System.out.println(s+" - "+integer));
    }
}
