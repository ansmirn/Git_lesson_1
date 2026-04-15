package tes;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class proba {

    @Test
     void vitaschi(){
        open("https://github.com");
        $("[aria-label=\"Search or jump to…\"]").click();
        $("[id=\"query-builder-test\"]").setValue("Selenide").pressEnter();
        sleep(2000);
        $("a[href=\"/selenide/selenide\"]").click();
        $("a[href=\"/selenide/selenide/wiki\"]").click();
        sleep(2000);
        $("a[href=\"/selenide/selenide/wiki/SoftAssertions\"").click();
        $("body").shouldHave(text("Using JUnit5 extend test class"));
        sleep(7000);

    }
}
