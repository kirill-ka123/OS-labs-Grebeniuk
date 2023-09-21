# OS-labs-Grebeniuk
## Отчет выполнения
### Первый пункт:
  - Создание папки - mkdir
  - Создание файла через nano
### Второй пункт:
  - Сначала скрипт на добавление имен в начала файла:
    ```
    for dir in */; do
      character_name=$(basename "$dir")
      echo "$character_name" >> characters_info.txt
    done
    ```
  - Потом скрипт на добавление описания персонажей с разеделителем:
    ```
    for dir in */; do
      cat "$dir/info.txt" >> characters_info.txt
      echo "----------------------------------------" >> characters_info.txt
    done
    ```
