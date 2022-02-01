package cloud.autotests.tests.VTB;

import cloud.autotests.config.Project;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class VTBTests extends TestBase {
    @Test
    @DisplayName("Проверка содержимого главной страницы сайта")
    public void testsForVTBMainPageAndCheckContent() {

        step("Открываем главную страницу ВТБ", () -> {
            open(Project.config.VTBURL());
            //open(VTBPages.VTBMainPage);
            step("Проверяем, что шапка содержит элементы" + VTBPages.Individuals + VTBPages.CorporateBusiness + VTBPages.MediumBusiness, () -> {
                VTBPages.checkResultsVTBMainPageInd().checkResultsVTBMainPageCor().checkResultsVTBMainPageMed();
            });
            step("Проверяем содержимое блока Предложения для Вас", () -> {

                step("Скроллим до самого блока и проверяем содержимое вкладок" + VTBPages.Investment + VTBPages.ForPensioners + VTBPages.Privilege, () -> {
                    VTBPages.checkTabInvestments().checkTabForPensioners().checkTabPrivilege();

                });

            });
        });
    }

    @Test
    @DisplayName("Проверка содержимого страницы Крупный бизнес")
    public void testsForVTBCorporateAndCheckContent() {
        step("Открываем вкладку " + VTBPages.CorporateBusiness, () -> {

            VTBPages.goToTheCorporateBusinessTab();

            step("Скроллим вниз и открываем вкладку  " + VTBPages.VTBCapital, () -> {
                VTBPages.goToTheVTBCapitalTab();
            });
            step("Проверяем вкладку на содержание текста " + VTBPages.VTBCapitalText, () -> {
                VTBPages.checkResultsVTBCapitalTab();
            });
            step("Переходим на вкладку" + VTBPages.VTBInsurance, () -> {
                VTBPages.goToTheVTBInsurance();
                step("Проверяем вкладку на содержание текста " + VTBPages.VTBInsuranceText, () -> {
                    VTBPages.checkResultsVTBInsurance();
                });
                step("Переходим на вкладку" + VTBPages.VTBFactoring, () -> {
                    VTBPages.goToTheVTBFactoring();
                    step("Проверяем вкладку на содержание текста " + VTBPages.VTBFactoring, () -> {
                        VTBPages.checkResultsVTBFactoring();
                    });
                });

            });

        });
    }

    @Test
    @DisplayName("Проверка содержимого вкладки Платежи и переводы -> Обмен Валюты ")
    public void openPaymentPageFillСurrencyConverterAndCheckButton() {

        step("Открываем Платежи и переводы", () -> {
            VTBPages.goToThePaymentPage();
        });
        step("Переходим на страницу Обмен валюты", () -> VTBPages.goToTheCurrencyExchangePage());
        step("Выбираем способ обмена", () -> {
            VTBPages.chooseNonCashMethodOfExchange();
        });
        step("Заполняем конвертер валют и жмём кнопку " + VTBPages.Calculate, () -> {
            VTBPages.fillCurrencyConverterAndClickButtonCalculate();
        });
        step("Проверяем, что после нажатия кнопки появился проверяемый текст ", () -> {
            VTBPages.checkResultsAfterClickingOnButtonCalculate();
        });

        step("Нажимаем на кнопку Найти отделение", () -> VTBPages.clickButtonSearchOffice());
        step("Проверяем, что страница содержит элемент" + VTBPages.OfficesAndATMs, () -> VTBPages.checkResultsAfterClickingOnButtonSearchOffice());
    }

    @Test
    @DisplayName("Скачиваем PDF документ и проверяем на количество страниц")
    public void downloadFiles() throws IOException {
        VTBPages.downloadPDFFileAndCheckNumberOfPages();
    }

    @Test
    @DisplayName("Меняем язык на сайте и проверяем содержимое")
    public void changeLanguage() {
        step("Выбираем английский язык", () -> {
            open(Project.config.VTBURL());
            //open(VTBPages.VTBMainPage);
            VTBPages.scrollToChangeLanguageAndClickEnglish();
            step("Проверяем содержимое", () -> VTBPages.checkResultsChangeLanguage());
        });
    }

}