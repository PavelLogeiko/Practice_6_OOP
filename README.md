# Практическая работа № 6 ООП Java
Доработать телефонный справочник

## На 3-ем этапе доработки задачи реализовано (NEW):

- XmlWriter - компонент записи контактов в файл формата xml


- DelContact - компонент удаления записи из файла csv по Фамилии
  //Так как файл Book.csv при старте программы - пустой, для корректной работы,
  сначала выполните запись в файл, через меню п.6, потом удаление из файла п.9

## На 2-ом этапе доработки задачи реализовано (NEW):

- JsonWriter - компонент записи контактов в файл формата json


- FileReader - компонент чтения записи из файла csv
//Так как файл Book.csv при старте программы - пустой, для корректной работы, 
сначала выполните запись в файл, через меню п.6, потом чтение из файла п.7


## Для начального решения задачи реализованы компоненты телефонного справочника "PhoneBook":
- Add - формат и добавление нового контакта


- Controller - создание первичного справочника и запуск меню


- CsvWriter - задает формат записи контактов в файл csv


- Format - интерфейс для форматирования записи


- Main - основной модуль - точка старта


- Menu - основное меню и подменю действий


- Book - поиск и сортировка по справочнику


- BookIterator - итератор для списка контактов


- SaveModel и Saver - сохранение контактов в файл csv


- Contact - конструктор объекта Контакт, геттеры и сеттеры


- BookComparator - компаратор контактов


- UserInterface - методы реализации меню и подменю

// Внимание: для проверки работоспособности записи задач в файл, необходимо скорректировать путь к файлу Book.csv или .json или .xml
в компоненте UserInterface, с учетом расположения папки с программой на вашем локальном компьютере. 