 # <p align= "center"> Проект автотестов на сайт ВТБ </p>
<a href="https://ibb.co/hFt7QPN"><img src="https://i.ibb.co/60fn93S/1280px-VTB-Logo-2018-svg.png" alt="1280px-VTB-Logo-2018-svg" border="0"></a>

## Были выполнены следующие автотесты:

🌸 ___Проверка содержимого на главной странице___

🌸 ___Проверка содержимого на страницах: Крупный бизнес, Малый и средний бизнес___

🌸 ___Заполнение конвертера валют и проверка содержимого страницы при нажатии кнопок___

🌸 ___Проверка смены языка на странице___ 

🌸 ___Скачивание PDF-документа и проверка количества страниц___

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

<details>
<summary>И последний является URL`ом к тестироемому сайту  </summary>
   
- browserSize ( по умолчанию 1280x1024)
   
- browserVersion = (по умолчанию 96.0)
   
- browserName = ( по умолчанию Chrome)
</details>

### Запуск локально

```
gradle clean test
```
###  Запуск в [Jenkins](https://jenkins.autotests.cloud/job/009-AnnaBlin-Itog/) <img src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg" width="40" height="40"  alt="Jenkins"/>

При нажатии кнопки "Собрать с параметрами" появится окно, где можно настроить параметры запуска

<a href="https://ibb.co/FW88CsW"><img src="https://i.ibb.co/YWffwDW/param.png" alt="param" border="0"></a>

### Анализ результатов тестирования

Более подробно результаты тестов можно рассмотреть в:

[Allure Report](#Отчёт-о-прохождении-автотестов-в-Allure-Report)

[Allure TestOps](#Отчёт-о-прохождении-автотестов-в-Allure-TestOps)

### Отчёт о прохождении автотестов в [Allure Report](https://jenkins.autotests.cloud/job/009-AnnaBlin-Itog/7/allure/)

<a href="https://ibb.co/ZccyDcG"><img src="https://i.ibb.co/1RRHWR7/StatAll.png" alt="statAll" border="0"></a>

### Список автотестов в [Allure Report](https://jenkins.autotests.cloud/job/009-AnnaBlin-Itog/7/allure/#suites/17f25cd99236779462cd74c955f7c813/276515797d3f6030/)

<a href="https://ibb.co/5RhKSpY"><img src="https://i.ibb.co/qrYJcq0/Desc-Tests.png" alt="Desc-Tests" border="0"></a>

### Отчёт о прохождении автотестов в [Allure TestOps](https://allure.autotests.cloud/launch/9847) <img src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="40" height="40"  alt="Allure TestOps"/>

<a href="https://ibb.co/QPhJJpS"><img src="https://i.ibb.co/X76WWj0/stat-Test-Ops.png" alt="stat-Test-Ops" border="0"></a>
<a href="https://ibb.co/qD1FhbG"><img src="https://i.ibb.co/VLBpbXy/TestOps.png" alt="TestOps" border="0"></a>

### Список автотестов в [Allure TestOps](https://allure.autotests.cloud/launch/9847/tree?treeId=1792&from=WyIzMjIzIl0%3D) <img src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="40" height="40"  alt="Allure TestOps"/>
<a href="https://ibb.co/dDnpKqr"><img src="https://i.ibb.co/M7q1N4s/Testcase.png" alt="Testcase" border="0"></a>

### Результаты о прохождении тестов в [Jira](https://jira.autotests.cloud/browse/HOMEWORK-331)<img src="https://starchenkov.pro/qa-guru/img/skills/Jira.svg" width="40" height="40"  alt="Jira"/>

<a href="https://ibb.co/c1w9W7g"><img src="https://i.ibb.co/t4z60Wm/jira.png" alt="jira" border="0"></a>

### Уведомления о прохождении автотестов в Telegram <img src="https://starchenkov.pro/qa-guru/img/skills/Telegram.svg" width="40" height="40"  alt="Telegram"/>

<a href="https://ibb.co/999N72N"><img src="https://i.ibb.co/wNNRfCR/Telegram.png" alt="Telegram" border="0"></a>

### Видео о прохождении тестов

<a href="https://ibb.co/hFm683d"><img src="https://i.ibb.co/fdxg0jN/videoselen-1.gif" alt="videoselen-1" border="0"></a>


