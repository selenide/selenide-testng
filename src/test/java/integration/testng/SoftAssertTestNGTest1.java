package integration.testng;

import com.codeborne.selenide.ex.SoftAssertionError;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SoftAssertTestNGTest1 extends AbstractSoftAssertTestNGTest {
  @Test(expectedExceptions = SoftAssertionError.class)
  public void userCanUseSoftAssertWithTestNG1() {
    $("#radioButtons input").shouldHave(value("777"));
    $("#xxx").shouldBe(visible);
    $$("#radioButtons input").shouldHave(size(888));
    $("#radioButtons").$$("input").shouldHave(size(999));
    $("#radioButtons select").click();
  }

  @Test
  public void successfulTest1() {
  }

  @Test(expectedExceptions = SoftAssertionError.class)
  public void testWithExpectedExceptions() {
    $("h22").shouldBe(visible).shouldHave(text("Selenide"));
  }
}
