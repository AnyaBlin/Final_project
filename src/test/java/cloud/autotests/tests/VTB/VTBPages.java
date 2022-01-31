package cloud.autotests.tests.VTB;

import cloud.autotests.config.Project;
import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class VTBPages {
    String VTBCapital = "ВТБ Капитал";
    String VTBInsurance = "ВТБ Страхование";
    String VTBFactoring = "ВТБ Факторинг";
    String Individuals = "Частным лицам";
    String MediumBusiness = "Малый и средний бизнес";
    String OfficesAndATMs = "Отделения и Банкоматы";
    String English = "English";
    String CorporateBusiness = "Крупный бизнес";
    String PaymentsAndTransfers = "Платежи и переводы";
    String CurrencyExchange = "Обмен валюты";
    String Cash = "В офисе (наличные)";
    String NonCash = "В офисе (безналично)";
    String Calculate = "Рассчитать";
    String PreliminaryCalculation = "Предварительный расчет по текущему курсу";
    String SymbolDollar = "$";
    String SearchOffice = "Найти отделение";
    String VTBCapitalText = "ВТБ Капитал предлагает полный спектр инвестиционно-банковских продуктов и услуг как российским";
    String VTBInsuranceText = "Почему именно ВТБ Страхование";
    String Careers = "Careers";
    String PDFDocumentText = "Раскрытие информации профессиональным участником рынка ценных бумаг";
    //String VTBMainPage = "https://www.vtb.ru/";
    String Investment = "Инвестиции";
    String ForPensioners = "Для пенсионеров";
    String Privilege = "Привилегия";
    String VTBMyInvestment = "ВТБ Мои Инвестиции";
    String MulticardForpensioners = "Мультикарта ВТБ для пенсионеров";
    String MulticardPrivilege = "Мультикарта Привилегия";

    public VTBPages checkResultsVTBMainPageInd() {

        $(".header-menu").shouldHave(text(Individuals));

        return this;
    }

    public VTBPages checkResultsVTBMainPageCor() {

        $(".header-menu").shouldHave(text(CorporateBusiness));

        return this;
    }

    public VTBPages checkResultsVTBMainPageMed() {

        $(".header-menu").shouldHave(text(MediumBusiness));

        return this;
    }

    public VTBPages checkResultsVTBCapitalTab() {

        $(".tab-panel__wrap").shouldHave(text(VTBCapitalText));

        return this;
    }

    public VTBPages checkResultsVTBInsurance() {

        $(".tab-panel__wrap").shouldHave(text(VTBInsuranceText));

        return this;
    }

    public VTBPages checkResultsVTBFactoring() {

        $(".tab-panel__wrap").shouldHave(text(VTBFactoring));

        return this;
    }

    public VTBPages checkResultsAfterClickingOnButtonCalculate() {

        $(".typographystyles__Box-foundation-kit__sc-14qzghz-0.cQoWFL").shouldHave(text(PreliminaryCalculation));

        return this;
    }

    public VTBPages checkTabInvestments() {
        $(".suggest-for-you-header").scrollTo();
        $$(".text.color-black.size-normal.weight-normal").findBy(text(Investment)).click();
        $(".tab-panel-block.tab-panel-block--active.tab-panel-block--vertical.anim-fade-enter-done").shouldHave(text(VTBMyInvestment));

        return this;
    }

    public VTBPages checkTabForPensioners() {
        $$(".text.color-black.size-normal.weight-normal").findBy(text(ForPensioners)).click();
        $(".tab-panel-block.tab-panel-block--active.tab-panel-block--vertical.anim-fade-enter-done").shouldHave(text(MulticardForpensioners));

        return this;
    }

    public VTBPages checkTabPrivilege() {
        $$(".text.color-black.size-normal.weight-normal").findBy(text(Privilege)).click();
        $(".tab-panel-block.tab-panel-block--active.tab-panel-block--vertical.anim-fade-enter-done").shouldHave(text(MulticardPrivilege));

        return this;
    }

    public VTBPages checkResultsAfterClickingOnButtonSearchOffice() {

        $(".ng-scope").shouldHave(text(OfficesAndATMs));

        return this;
    }

    public VTBPages checkResultsChangeLanguage() {

        $(".navigation__second__menu").shouldHave(text(Careers));

        return this;
    }

    public VTBPages goToTheCorporateBusinessTab() {
        $$(".link__text.text.color-white.size-small-medium.weight-medium").find(text(CorporateBusiness)).click();
        return this;
    }

    public VTBPages goToTheVTBCapitalTab() {

        $(".tab-panel__image").scrollTo();
        $$(".tab-panel__row li").find(text(VTBCapital)).click();

        return this;
    }

    public VTBPages goToTheVTBInsurance() {

        $$(".tab-panel__row li").find(text(VTBInsurance)).click();

        return this;
    }

    public VTBPages goToTheVTBFactoring() {

        $$(".tab-panel__row li").find(text(VTBFactoring)).click();

        return this;
    }

    public VTBPages goToThePaymentPage() {

        open(Project.config.VTBURL());
        $$(".header-bottom-menu-item").findBy(text(PaymentsAndTransfers)).click();

        return this;
    }

    public VTBPages goToTheCurrencyExchangePage() {

        $$(".header-menu-panel-group-item").findBy(text(CurrencyExchange)).click();

        return this;
    }

    public VTBPages chooseNonCashMethodOfExchange() {

        $(".parametersstyles__Box-currency-converter__sc-8kybyp-0.ghRtZY").scrollTo();
        //$$(".selectstyles__Box-currency-converter__sc-30iz8h-0.hVxMvd").findBy(text(Cash)).click();
        $(".select-inputstyles__SelectInputBlock-foundation-kit__sc-uv08kr-0.kcjYt").click();
        $$(".dropdownstyles__List-foundation-kit__sc-1f1ybea-2.hXgEzC li").findBy(text(NonCash)).click();

        return this;
    }

    public VTBPages fillCurrencyConverterAndClickButtonCalculate() {

        $$(".tabsstyles__TabsLayout-foundation-kit__sc-v13t8p-0.cFicyP").find(text(SymbolDollar)).click();
        $(".base-inputstyles__Input-foundation-kit__sc-pjb7i3-4.bvNA-Dt").click();
        $(".base-inputstyles__Input-foundation-kit__sc-pjb7i3-4.bvNA-Dt").sendKeys("100");
        $$(".buttonstyles__Box-foundation-kit__sc-sa2uer-1.kjzMIF.big-buttonstyles__ButtonStyled-foundation-kit__sc-e4yvjp-3.erWJUO").find(text(Calculate)).click();

        return this;
    }

    public VTBPages clickButtonSearchOffice() {

        $$(".resultstyles__WrapperButtons-currency-converter__sc-bn1358-5.hxDVUb").find(text(SearchOffice)).click();

        return this;
    }

    public VTBPages downloadPDFFileAndCheckNumberOfPages() throws IOException {

        open(Project.config.VTBURL());
        $(".link__text.text.color-dark-gray.size-small-medium.weight-normal").scrollTo();
        $(By.linkText(PDFDocumentText)).click();
        File pdf = $(".docs-items__doc.docs-items__doc_pdf.docs-items__doc-br").scrollTo().download();
        PDF parsedPdf = new PDF(pdf);
        Assertions.assertEquals(2, parsedPdf.numberOfPages);

        return this;
    }

    public VTBPages scrollToChangeLanguageAndClickEnglish() {

        $(".location").scrollTo().find(By.linkText(English)).click();

        return this;
    }


}
