# Отчёт о тестировании Money Transfer

## Краткое описание

25.03.2021 - 25.03.2021 было проведено функциональное тестирование приложения Money Transfer.

На тестирование затрачено: 0.5 часа

В результате тестирования выявлены следующие дефекты:
* [Добавление денег на счет где хранится 2 000 000 000 выдает неправильный результат](https://github.com/sbusygin/JavaQA1.2/issues/1#issue-840943506)


## Описание процесса тестирования

В качестве тестовых данных использовались данные из задания:
* На счет где хранится 2 000 000 000 добавили 500 000 000 - ожидаемый результат - ответ в консоли "2500000000"

Тестирование производилось в следующем окружении:
* Windows 10
* Java v1.8
* Intellij IDEA
