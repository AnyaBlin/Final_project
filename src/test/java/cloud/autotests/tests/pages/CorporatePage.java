package cloud.autotests.tests.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CorporatePage {
    public String VTBCapital = "ВТБ Капитал";
    public String VTBInsurance = "ВТБ Страхование";
    public String VTBFactoring = "ВТБ Факторинг";
    public String CorporateBusiness = "Крупный бизнес";
    public String VTBCapitalText = "ВТБ Капитал предлагает полный спектр инвестиционно-банковских продуктов и услуг как российским";
    public String VTBInsuranceText = "Почему именно ВТБ Страхование";

    public CorporatePage goToTheCorporateBusinessTab() {
        open("");
        $$(".link__text.text.color-white.size-small-medium.weight-medium").find(text(CorporateBusiness)).click();

        return this;
    }

    public CorporatePage goToTheCapitalTab() {
        $(".tab-panel__image").scrollTo();
        $$(".tab-panel__row li").find(text(VTBCapital)).click();

        return this;
    }

    public CorporatePage goToTheInsurance() {
        $$(".tab-panel__row li").find(text(VTBInsurance)).click();

        return this;
    }

    public CorporatePage goToTheFactoring() {
        $$(".tab-panel__row li").find(text(VTBFactoring)).click();

        return this;
    }

    public CorporatePage checkResultsCapitalTab() {
        $(".tab-panel__wrap").shouldHave(text(VTBCapitalText));

        return this;
    }

    public CorporatePage checkResultsInsurance() {
        $(".tab-panel__wrap").shouldHave(text(VTBInsuranceText));

        return this;
    }

    public CorporatePage checkResultsFactoring() {
        $(".tab-panel__wrap").shouldHave(text(VTBFactoring));

        return this;
    }
}
