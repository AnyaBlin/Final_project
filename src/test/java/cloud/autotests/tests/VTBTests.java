package cloud.autotests.tests;

import io.qameta.allure.Allure;
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
            open("");
            step("Проверяем, что шапка содержит элементы" + mainPage.Individuals + mainPage.CorporateBusiness + mainPage.MediumBusiness, () -> {
                mainPage.checkResultsIndividuals()
                        .checkResultsCorporate()
                        .checkResultsMedium();
            });
            step("Проверяем содержимое блока Предложения для Вас", () -> {

                step("Скроллим до самого блока и проверяем содержимое вкладок" + mainPage.Investment + mainPage.ForPensioners + mainPage.Privilege, () -> {
                    mainPage.checkTabInvestments()
                            .checkTabForPensioners()
                            .checkTabPrivilege();
                });
            });
        });
    }

    @Test
    @DisplayName("Проверка содержимого страницы Крупный бизнес")
    public void testsForVTBCorporateAndCheckContent() {
        step("Открываем вкладку " + corporatePage.CorporateBusiness, () -> {

            corporatePage.goToTheCorporateBusinessTab();

            step("Скроллим вниз и открываем вкладку  " + corporatePage.VTBCapital, () -> {
                corporatePage.goToTheCapitalTab();
            });
            step("Проверяем вкладку на содержание текста " + corporatePage.VTBCapitalText, () -> {
                corporatePage.checkResultsCapitalTab();
            });
            step("Переходим на вкладку" + corporatePage.VTBInsurance, () -> {
                corporatePage.goToTheInsurance();
                step("Проверяем вкладку на содержание текста " + corporatePage.VTBInsuranceText, () -> {
                    corporatePage.checkResultsInsurance();
                });
                step("Переходим на вкладку" + corporatePage.VTBFactoring, () -> {
                    corporatePage.goToTheFactoring();
                    step("Проверяем вкладку на содержание текста " + corporatePage.VTBFactoring, () -> {
                        corporatePage.checkResultsFactoring();
                    });
                });

            });

        });
    }

    @Test
    @DisplayName("Проверка содержимого вкладки Платежи и переводы -> Обмен Валюты ")
    public void openPaymentPageFillСurrencyConverterAndCheckButton() {

        step("Открываем Платежи и переводы", () -> {
            paymentPage.goToThePaymentPage();
        });
        Allure.step("Переходим на страницу Обмен валюты", () -> paymentPage.goToTheCurrencyExchangePage());
        step("Выбираем способ обмена", () -> {
            paymentPage.chooseNonCashMethodOfExchange();
        });
        step("Заполняем конвертер валют и жмём кнопку " + paymentPage.Calculate, () -> {
            paymentPage.fillCurrencyConverterAndClickButtonCalculate();
        });
        step("Проверяем, что после нажатия кнопки появился проверяемый текст ", () -> {
            paymentPage.checkResultsAfterClickingOnButtonCalculate();
        });

        Allure.step("Нажимаем на кнопку Найти отделение", () -> paymentPage.clickButtonSearchOffice());
        step("Проверяем, что страница содержит элемент" + paymentPage.OfficesAndATMs, () -> paymentPage.checkResultsAfterClickingOnButtonSearchOffice());
    }

    @Test
    @DisplayName("Скачиваем PDF документ и проверяем на количество страниц")
    public void downloadFiles() throws IOException {
        mainPage.downloadPDFFileAndCheckNumberOfPages();
    }

    @Test
    @DisplayName("Меняем язык на сайте и проверяем содержимое")
    public void changeLanguage() {
        step("Выбираем английский язык", () -> {
            open("");
            //open(VTBPages.VTBMainPage);
            mainPage.scrollToChangeLanguageAndClickEnglish();
            Allure.step("Проверяем содержимое", () -> mainPage.checkResultsChangeLanguage());
        });
    }

}