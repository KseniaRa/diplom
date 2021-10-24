# Final project for QA.Guru with examples of UI, API and Mobile tests 


### Used technologies:

![Java](https://user-images.githubusercontent.com/52957959/136703369-49c177b4-4d36-4fef-9b37-e14684928b97.png)
![Gradle](https://user-images.githubusercontent.com/52957959/136703385-c49eb8a2-e280-45cd-adfa-3578de827ee0.png)
![Selenide](https://user-images.githubusercontent.com/52957959/136703397-d892d3dc-d394-4e81-9a5b-79ed76871110.png)
![Selenoid](https://user-images.githubusercontent.com/52957959/136703399-ca897221-bf6e-4a52-b276-d5f6ba7fb42c.png)
![Jenkins](https://user-images.githubusercontent.com/52957959/136703405-18cc48a6-0040-4ccb-8478-0761e620351a.png)
![AllureReport](https://user-images.githubusercontent.com/52957959/136703410-86350964-f2ff-45b5-b87b-72859303ca87.png)
![TestOps](https://user-images.githubusercontent.com/52957959/136703412-6a6ca040-554c-4b4d-bae6-d04c4d1d8b82.png)
![Jira](https://user-images.githubusercontent.com/52957959/136703413-c4a3954f-6643-48ff-acdf-9f8be940688e.png)
![Telegram](https://user-images.githubusercontent.com/52957959/136703423-3c828863-bbb1-4346-a7e8-fd5400822de8.png)



Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```



### Видео о прохождении тестов
Web 

![news_(online-video-cutter com)](https://user-images.githubusercontent.com/52957959/136703815-122ea0e9-cfd1-4c80-88a3-ca65b96686ac.gif)


Mobile
![mobile__test_video](https://user-images.githubusercontent.com/52957959/137966105-e8161145-1969-44f1-913d-9314c02f0fdd.gif)



## [Jenkins](https://jenkins.autotests.cloud/job/rassadina_diplom/)

Указание параметров для запуска
![Jenkins - Google Chrome 2021-10-10 19 10 02](https://user-images.githubusercontent.com/52957959/136704127-7219a7fe-6568-4dcf-8056-2106f46b081e.png)



## Отчёт в Allure Report
![image](https://user-images.githubusercontent.com/52957959/138585572-89ff297f-5462-470a-bd7f-2306b7ec6bf2.png)


## Хранение тест-кейсов в [Allure TestOps](https://allure.autotests.cloud/project/540/test-cases?treeId=1072)
![Allure TestOps - Google Chrome 2021-10-19 21 07 52](https://user-images.githubusercontent.com/52957959/137966633-eb128181-a12f-4363-878a-57dbacb700e6.png)


## Тест планы в Allure TestOps
![image](https://user-images.githubusercontent.com/52957959/137966418-28b2221f-fbee-482a-9f05-2c65dbd2bc18.png)



## Дашборд с тестами и историей запусков
![image](https://user-images.githubusercontent.com/52957959/138585641-f2d68168-9ffc-44f0-9849-68a5d09ebbb4.png)


## Дашборд с результатами запуска
![Allure TestOps - Google Chrome 2021-10-24 10 56 16](https://user-images.githubusercontent.com/52957959/138585621-afd1dc7f-cf17-447e-b269-e4d13bcd6943.png)


## Интерграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-253)
![image](https://user-images.githubusercontent.com/52957959/137966978-8c29bffb-8434-42ec-a78f-5ceafe3b0ffd.png)



## Уведомление в телеграмм
![Telegram (6) 2021-10-24 10 55 31](https://user-images.githubusercontent.com/52957959/138585597-654fab35-409a-44d9-b5df-f55656ec08af.png)

