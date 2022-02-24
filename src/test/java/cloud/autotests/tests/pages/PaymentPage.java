package cloud.autotests.tests.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PaymentPage {
    String PaymentsAndTransfers = "Платежи и переводы";
    String CurrencyExchange = "Обмен валюты";
    String NonCash = "В офисе (безналично)";
    public String Calculate = "Рассчитать";
    String PreliminaryCalculation = "Предварительный расчет по текущему курсу";
    String SymbolDollar = "$";
    public String OfficesAndATMs = "Отделения и Банкоматы";
    String SearchOffice = "Найти отделение";

    public PaymentPage goToThePaymentPage() {
        open("");
        $$(".header-bottom-menu-item").findBy(text(PaymentsAndTransfers)).click();

        return this;
    }

    public PaymentPage goToTheCurrencyExchangePage() {
        $$(".header-menu-panel-group-item").findBy(text(CurrencyExchange)).click();

        return this;
    }

    public PaymentPage checkResultsAfterClickingOnButtonCalculate() {
        $(".typographystyles__Box-foundation-kit__sc-14qzghz-0.cQoWFL").shouldHave(text(PreliminaryCalculation));

        return this;
    }


    public PaymentPage checkResultsAfterClickingOnButtonSearchOffice() {
        $(".ng-scope").shouldHave(text(OfficesAndATMs));

        return this;
    }

    public PaymentPage chooseNonCashMethodOfExchange() {
        $(".parametersstyles__Box-currency-converter__sc-8kybyp-0.ghRtZY").scrollTo();
        //$$(".selectstyles__Box-currency-converter__sc-30iz8h-0.hVxMvd").findBy(text(Cash)).click();
        $(".select-inputstyles__SelectInputBlock-foundation-kit__sc-uv08kr-0.kcjYt").click();
        $$(".dropdownstyles__List-foundation-kit__sc-1f1ybea-2.hXgEzC li").findBy(text(NonCash)).click();

        return this;
    }

    public PaymentPage fillCurrencyConverterAndClickButtonCalculate() {
        $$(".tabsstyles__TabsLayout-foundation-kit__sc-v13t8p-0.cFicyP").find(text(SymbolDollar)).click();
        $(".base-inputstyles__Input-foundation-kit__sc-pjb7i3-4.bvNA-Dt").click();
        $(".base-inputstyles__Input-foundation-kit__sc-pjb7i3-4.bvNA-Dt").sendKeys("100");
        $$(".buttonstyles__Box-foundation-kit__sc-sa2uer-1.kjzMIF.big-buttonstyles__ButtonStyled-foundation-kit__sc-e4yvjp-3.erWJUO").find(text(Calculate)).click();

        return this;
    }

    public PaymentPage clickButtonSearchOffice() {
        $$(".resultstyles__WrapperButtons-currency-converter__sc-bn1358-5.hxDVUb").find(text(SearchOffice)).click();

        return this;
    }
}
