 # <p align= "center"> Проект автотестов на сайт ВТБ </p>
<a href="https://ibb.co/hFt7QPN"><img src="https://i.ibb.co/60fn93S/1280px-VTB-Logo-2018-svg.png" alt="1280px-VTB-Logo-2018-svg" border="0"></a>

## Были выполнены следующие автотесты:

    * 🌸 Проверка содержимого на главной странице
    * 🌸 Проверка содержимого на страницах: Крупный бизнес, Малый и средний бизнес
    * 🌸 Заполнение конвертера валют и проверка содержимого страницы при нажатии кнопок
    * 🌸 Проверка смены языка на странице 
    * 🌸 Скачивание PDF-документа и проверка количества страниц

## Технологический стек

<a href="https://github.com/angry-qa/vkc-demo">
  <img src="https://starchenkov.pro/qa-guru/img/skills/Java.svg" width="40" height="40"  alt="Java"/>
  <img src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="40" height="40"  alt="Gradle"/>
  <img src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="40" height="40"  alt="JUnit 5"/>
  <img src="https://starchenkov.pro/qa-guru/img/skills/Intelij_IDEA.svg" width="40" height="40"  alt="IDEA"/>
  <img src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg" width="40" height="40"  alt="Seleide"/>
  <img src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg" width="40" height="40"  alt="Jenkins"/>
  <img src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="40" height="40"  alt="Allure TestOps"/>
  <img src="https://starchenkov.pro/qa-guru/img/skills/Jira.svg" width="40" height="40"  alt="Jira"/>
  <img src="https://starchenkov.pro/qa-guru/img/skills/Github.svg" width="40" height="40"  alt="Github"/>
  <img src="https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width="40" height="40"  alt="Telegram"/>
</a>

## Как запустить

* В remote.properties содержатся следующие параметры конфигурации, которые необходимо определить для запуска тестов удалённо:
------- 
<details>
<summary>Первые 2 параметра отвечают за URL селеноида</summary>
   
- remoteBrowser= https://user1:1234@selenoid.autotests.cloud/wd/hub/
   
- videoStorage= https://selenoid.autotests.cloud/video/
</details>

-------

<details>
<summary>Следующие 3 являются настройками браузера</summary>
   
- browserSize ( по умолчанию 1280x1024)
   
- browserVersion = (по умолчанию 96.0)
   
- browserName = ( по умолчанию Chrome)
</details>

-------

### Запуск локально

```
gradle clean test
```
### Запуск в Jenkins

При нажатии кнопки "Собрать с параметрами" появится окно, где можно настроить параметры запуска

<a href="https://ibb.co/tKn50tQ"><img src="https://i.ibb.co/PjJ82nF/param.jpg" alt="param" border="0"></a>

### Отчёт о прохождении автотестов в Allure Report

<a href="https://ibb.co/p17fb7z"><img src="https://i.ibb.co/wdkSBkW/allure-Main.jpg" alt="allure-Main" border="0"></a>

### Список автотестов в Allure Report

<a href="https://c.radikal.ru/c40/2112/d9/e6eb62018cbb.jpg"><img src="https://c.radikal.ru/c40/2112/d9/e6eb62018cbb.jpg" alt="e6eb62018cbb" border="0"></a>


### Видео о прохождении тестов

<a href="https://ibb.co/hFm683d"><img src="https://i.ibb.co/fdxg0jN/videoselen-1.gif" alt="videoselen-1" border="0"></a>

### Уведомления о прохождении автотестов в Telegram

<a href="https://ibb.co/dkv4NbQ"><img src="https://i.ibb.co/3Sbmxf0/bot.jpg" alt="bot" border="0"></a>

