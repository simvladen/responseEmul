Инструкция
На адрес http://localhost:8080/responseEmul отправить Post запрос.
В запросе тело с полями operationName(строка), userName(строка) и sum(число).
В ответе придет json двумя полями userName из первого запроса и balance(рандомное число + sum из первого запроса)