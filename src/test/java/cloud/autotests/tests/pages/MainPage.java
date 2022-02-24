package cloud.autotests.tests.pages;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public String Individuals = "Частным лицам";
    public String MediumBusiness = "Малый и средний бизнес";
    public String CorporateBusiness = "Крупный бизнес";
    public String Investment = "Инвестиции";
    public String ForPensioners = "Для пенсионеров";
    public String Privilege = "Привилегия";
    String Careers = "Careers";
    String English = "English";
    String PDFDocumentText = "Раскрытие информации профессиональным участником рынка ценных бумаг";
    String VTBMyInvestment = "ВТБ Мои Инвестиции";
    String MulticardForpensioners = "Мультикарта ВТБ для пенсионеров";
    String MulticardPrivilege = "Мультикарта Привилегия";

    public MainPage checkResultsIndividuals() {
        $(".header-menu").shouldHave(text(Individuals));

        return this;
    }

    public MainPage checkResultsCorporate() {
        $(".header-menu").shouldHave(text(CorporateBusiness));

        return this;
    }

    public MainPage checkResultsMedium() {
        $(".header-menu").shouldHave(text(MediumBusiness));

        return this;
    }

    public MainPage checkTabInvestments() {
        $(".suggest-for-you-header").scrollTo();
        $$(".text.color-black.size-normal.weight-normal").findBy(text(Investment)).click();
        $(".tab-panel-block.tab-panel-block--active.tab-panel-block--vertical.anim-fade-enter-done").shouldHave(text(VTBMyInvestment));

        return this;
    }

    public MainPage checkTabForPensioners() {
        $$(".text.color-black.size-normal.weight-normal").findBy(text(ForPensioners)).click();
        $(".tab-panel-block.tab-panel-block--active.tab-panel-block--vertical.anim-fade-enter-done").shouldHave(text(MulticardForpensioners));

        return this;
    }

    public MainPage checkTabPrivilege() {
        $$(".text.color-black.size-normal.weight-normal").findBy(text(Privilege)).click();
        $(".tab-panel-block.tab-panel-block--active.tab-panel-block--vertical.anim-fade-enter-done").shouldHave(text(MulticardPrivilege));

        return this;
    }

    public MainPage checkResultsChangeLanguage() {
        $(".navigation__second__menu").shouldHave(text(Careers));

        return this;
    }

    public MainPage downloadPDFFileAndCheckNumberOfPages() throws IOException {
        open("");
        $(".link__text.text.color-dark-gray.size-small-medium.weight-normal").scrollTo();
        $(By.linkText(PDFDocumentText)).click();
        File pdf = $(".docs-items__doc.docs-items__doc_pdf.docs-items__doc-br").scrollTo().download();
        PDF parsedPdf = new PDF(pdf);
        Assertions.assertEquals(2, parsedPdf.numberOfPages);

        return this;
    }

    public MainPage scrollToChangeLanguageAndClickEnglish() {
        $(".location").scrollTo().find(By.linkText(English)).click();

        return this;
    }
}
